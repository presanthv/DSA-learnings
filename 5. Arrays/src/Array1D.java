import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //array of primitives

//Initialising a 1D Array
        // Method one
        int[] arr = new int[3];

        //Method 2
        int[] arr1D = {1,2,3,4,5};

//----------------------------------------------------------------------------------------------------------------

// Input to an array
        // 1: For loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        //2: Manual input
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;

//----------------------------------------------------------------------------------------------------------------

// Output an array

        // 1: for-loop normal
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // 2: Enhanced for-loop
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

        //3. toString() Method
//        System.out.println(Arrays.toString(arr));

//----------------------------------------------------------------------------------------------------------------

        //array of objects
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        for (String name: str) {
            System.out.print(name + " ");
        }

        System.out.println(Arrays.toString(str));
    }
}
