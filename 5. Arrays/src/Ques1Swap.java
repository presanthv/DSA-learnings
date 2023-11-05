import java.util.Arrays;

public class Ques1Swap {
    public static void main(String[] args) {
// write a method to swap values in two positions in an array

        int[] arr = {1,3,5,6,7};
        swap(arr, 0 , 4);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
