import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists1D {
    public static void main(String[] args) {
        ArrayList<Integer> list = getIntegers();

//---------------------------------------------------------------------------------------------------------------------

// output an ArrayList

        //1: using for-loop
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }

        // 2: using println which internally uses Arrays.toString() method.
        System.out.println(list);

//---------------------------------------------------------------------------------------------------------------------

// ArrayList functions

//        //getting the value at an index.
//        System.out.println(list.get(0));  // Here list[] will not work. list.get(0) should be used
//
//        // update value to 5 at index 0
//        list.set(0,5);
//        System.out.println(list);
//
//        // remove value at index 2
//        list.remove(2);
//        System.out.println(list);
//
//        // check if an element is present true/false
//        System.out.println(list.contains(2));



    }


    private static ArrayList<Integer> getIntegers() {
        Scanner in = new Scanner(System.in);

// Initialising an ArrayList
        ArrayList<Integer> list = new ArrayList<>(5);

//---------------------------------------------------------------------------------------------------------------------

// input to an ArrayList

        // 1: adding elements to an Arraylist
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        // 2: using for-loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        return list;
    }
}
