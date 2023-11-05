import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        greeting();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = 1;
        System.out.print("Enter 2nd number: ");
        int b = 2;

        a = b;
    }

    // syntax
    /*
        access_modifier return_type method_name (arguments) {
            // body
        }
     */

    static void greeting() {
        System.out.println("Hello World!");
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

    static int sum2(int a, int b) {
        return a + b;
    }
}

