import javax.swing.*;
import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int no = in.nextInt();
        String name = in.next();

        switch (no) {
            case 10 -> System.out.println("Presanth");
            case 201 -> System.out.println("Shaam");
            case 32 -> {
                System.out.println("Thirssha");
                switch (name) {
                    case "presanth", "shaam" -> System.out.println("Brother");
                    case "thirssha" -> System.out.println("Me");
                    default -> System.out.println("enter valid name");
                }
            }
            default -> System.out.println("enter valid no.");
        }

    }
}
