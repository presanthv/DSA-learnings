import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {200, 34, 55},
                {23, 45, 55, 56, 109},
                {4, 65, 53, 2}
        };
        int target = 65;

        // 1: find the target
//        int[] ans = search(arr2D, target);
//        System.out.println(Arrays.toString(ans));

        //2: find the max value
//        System.out.println(searchMax(arr2D));

        //3: find the min value
//        System.out.println(searchMin(arr2D));
    }

    // 1: find the target
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //2: find the max value
    static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for(int[] intArr: arr) {
            for(int element: intArr) {
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
    
    //3: find the min value
    static int searchMin(int[][] arr) {
        int min = arr[0][0];

        for(int[] intArr: arr) {
            for(int element: intArr) {
                if(element < min){
                    min = element;
                }
            }
        }
        return min;
    }
}