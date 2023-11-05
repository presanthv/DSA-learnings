import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;

        while (true) {
            System.out.print("Enter the operator: ");
            char operator = in.next().trim().charAt(0);

            if ( operator == '+' || operator == '-' || operator == '*' || operator == '/' ||operator == '%' ) {
                System.out.print("Enter any two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (operator == '+') {
                    answer = num1 + num2;
                }
                if (operator == '-') {
                    answer = num1 - num2;
                }
                if (operator == '*') {
                    answer = num1 * num2;
                }
                if (operator == '/' && num2 != 0) {
                    answer = num1 / num2;
                }
                if (operator == '%') {
                    answer = num1 % num2;
                }

            } else if (operator == 'x' || operator == 'X') {
                    break;
            } else {
                    System.out.println("Invalid Operation.");
            }

            System.out.println(answer);
        }
    }
}
