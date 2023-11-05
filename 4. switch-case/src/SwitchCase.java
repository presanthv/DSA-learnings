import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Program [1] old switch case
//        String fruit = in.next();
//        switch (fruit) {
//            case "mango":
//                System.out.println("Yellow");
//                break;
//            case "apple":
//                System.out.println("Red");
//                break;
//            case "grape":
//                System.out.println("Purple");
//                break;
//            case "orange":
//                System.out.println("Orange");
//                break;
//            default:
//                System.out.print("Enter a valid fruit.");
//        }
        //Program [1] enhanced switch case
//        switch (fruit) {
//            case "mango" -> System.out.println("Yellow");
//            case "apple" -> System.out.println("Red");
//            case "grape" -> System.out.println("Purple");
//            case "orange" -> System.out.println("Orange");
//            default -> System.out.print("Enter a valid fruit.");
//        }


        //Program [2] enhanced switch case
        int day = in.nextInt();

        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("Enter a valid day.");
        }

        //Program [3] enhanced switch case
        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("Enter a valid day.");
        }
        //Program [3] old switch case
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("Enter a valid day.");
        }
    }
}
