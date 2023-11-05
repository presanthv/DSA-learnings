public class IntLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,34, 502, 293, 2093, 2, -29, 39, -21, -8, 298, 929};
        int target = 1;
        boolean output = linearSearchBool(arr, target);

        System.out.println(output);
    }

//1: find the target value and return the index
    static int linearSearchIn(int[] arr, int target) {
        // check if the arr is empty
        if(arr.length == 0) {
            return -1;
        }
        //run a for-loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            //compare the element at each index to the target
            if(element == target) {
                // return the index of the target
                return index;
            }
        }
        // this return executes when the target value is not in the array
        return -1;
    }

//2: find the target value and return the element
    static int linearSearchEle(int[] arr, int target) {
        // check if the arr is empty
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        //run a for-loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            //compare the element at each index to the target
            if(element == target) {
                // return the index of the target
                return element;
            }
        }
        // this return executes when the target value is not in the array
        return Integer.MAX_VALUE;
    }

//3: find the target value and return true/false
    static boolean linearSearchBool(int[] arr, int target) {
        // check if the arr is empty
        if(arr.length == 0) {
            return false;
        }
        //run a for-loop
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            //compare the element at each index to the target
            if(element == target) {
                // return the index of the target
                return true;
            }
        }
        // this return executes when the target value is not in the array
        return false;
    }

}
