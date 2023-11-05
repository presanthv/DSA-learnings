import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// Initialising a 2D array
        int[][] arr2D = new int[3][3]; // size of rows is mandatory.
        // Column size is non-mandatory as it can vary for each row.

        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        /*
        Array we are trying to build 3X3
            1 2 3
            4 5 6
            7 8 9
         */
//----------------------------------------------------------------------------------------------------------------
        // Input to a 2D array

        // nested for-loop
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                arr2D[row][col] = in.nextInt();
//            }
//        }

        // nested for-loop
//        arr2D[0][0] = 1;
//        arr2D[0][1] = 2;
//        arr2D[0][2] = 3;
//        arr2D[1][0] = 4;
//        arr2D[1][1] = 5;
//        arr2D[1][2] = 6;
//        arr2D[2][0] = 7;
//        arr2D[2][1] = 8;
//        arr2D[2][2] = 9;

//----------------------------------------------------------------------------------------------------------------
        //Output a 2D array

        //1: for-loop Arrays.toString
//        for (int row = 0; row < arr2D.length; row++) {
//            System.out.println(Arrays.toString(arr2D[row]));
//        }

        //2: Nested for-loop
//        for (int row = 0; row < arr2D.length; row++) {
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

        //3: Enhanced for-loop & Arrays.toString()
        for (int[] row : arr2D) {
            System.out.println(Arrays.toString(row));
        }

    }
}
