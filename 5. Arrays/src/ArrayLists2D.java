import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists2D {
/*
// normal ArrayList declaration
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// Initialising a 2D ArrayList
        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>(3);
        //initialising the internal ArrayList
        for (int row = 0; row < 3 ; row++) {
            list2D.add(new ArrayList<>());
        }
// input to a 2D ArrayList
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list2D.get(row).add(in.nextInt());
            }
        }

//output a 2D ArrayList
        System.out.println(list2D);
    }
*/
//---------------------------------------------------------------------------------------------------------------------

// using method to declare the ArrayList
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arrayList2D = getIntegers();

        System.out.println(arrayList2D);
    }

    public static ArrayList<ArrayList<Integer>> getIntegers(){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the required no. of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the required no. of columns: ");
        int col = in.nextInt();

        ArrayList<ArrayList<Integer>> list2D = new ArrayList<>(col);

        for (int i = 0; i < row; i++) {
            list2D.add(new ArrayList<>(col));
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                list2D.get(i).add(in.nextInt());
            }
        }
        return list2D;
    }

}
