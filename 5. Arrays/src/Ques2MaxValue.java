import java.sql.SQLOutput;

public class Ques2MaxValue {
    public static void main(String[] args) {
        int[] arr = {1 ,5, 12, 10, 130};
        System.out.println("Maximum Value in the array: " + max(arr));
        System.out.println("Maximum Value in the given range: " + maxInRange(arr, 1, 3));
    }

// find the max value in the array
    static int max(int[] arr) {
        int maxValue = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
// find the max value in a given range
    static int maxInRange(int[] arr, int index1, int index2) {
        int maxValue = arr[index1];
        for (int i = index1; i <= index2 ; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
