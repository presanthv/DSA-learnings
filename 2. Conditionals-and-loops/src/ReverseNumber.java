public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456789;
        int reversedNumber = 0;

        while (n > 0) {
            int rem = n % 10;
            reversedNumber = (reversedNumber * 10) + rem;

            n /= 10;
        }
        System.out.println(reversedNumber);
    }
}
