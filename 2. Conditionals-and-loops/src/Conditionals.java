import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salary = input.nextInt();
        int bonus;

        if (salary > 10_00 && salary < 20_000){
            bonus = 1000;
        } else if (salary > 20_000) {
            bonus = 2000;
        } else {
            bonus = 500;
        }

        int newSalary = salary + bonus;
        System.out.println(newSalary);
    }
}
