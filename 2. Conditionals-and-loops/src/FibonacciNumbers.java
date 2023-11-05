import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nth = in.nextInt();
        int p = 0;
        int i = 1;
        // Method 1: For loop
//        for (byte count = 2; count <= nth; count++) {
//            int nextNum = p + i;
//            p = i;
//            i = nextNum;
//        }

        //Method 2: While Loop
//        int count = 2;
//        while (count <= nth){
//            int temp = i;
//            i = i + p;
//            p = temp;
//            count++;
//        }

        System.out.println(i);
    }
}
