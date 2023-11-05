import java.util.Scanner;

public class CountOccur {
    public static void main(String[] args) {
        int number = 12442;
        int numToCount = 3;

        int count = 0;
        while (number > 0) {
            int remainder = number % 10;
            if (numToCount == remainder) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
