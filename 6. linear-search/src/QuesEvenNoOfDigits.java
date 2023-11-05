// LeetCode Question: 1295. Find Numbers with Even Number of Digits
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class QuesEvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println("Count of numbers having even digits: " + findNumbers(arr));
    }

    //counting the values having even no. of digits
    static int findNumbers(int[] arr) {
        int count = 0;
        //run for-each-loop
        for(int num: arr) {
            // check if each element has even no. of digits
            if(even(num)) {
                //if true increment count
                count++;
            }
        }
        //return the total count
        return count;
    }

    //checking for even number
    static boolean even(int num) {
        int digits = 0;

        //handling -ve numbers and zero
        if(num < 0) {
            num *= -1;
        }
        if(num == 0) {
            digits = 1;
        }

        //counting the no of digits in the number
        while(num > 0) {
            num /= 10;
            digits++;
        }
        //return true if even
        return digits % 2 == 0;
    }
}
