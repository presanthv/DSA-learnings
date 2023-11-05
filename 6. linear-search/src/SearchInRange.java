public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 34, 502, 293, 2093, 2, -29, 39, -21, -8, 298, 929};
        int target = 2;
        System.out.println(linearSearch(arr, target, 1, 10));
    }
    public static int linearSearch(int[] arr, int target, int indStart, int indEnd) {
        // handling edge cases
        if(arr.length == 0 || indStart < 0 || indEnd < 0 || indEnd > arr.length-1) {
            return -1;
        }
        //for-loop and value comparison
        for(int i = indStart; i <= indEnd; i++) {
            if(target == arr[i]) {
                return i;
            }
        }
        // no match return -1
        return -1;
    }
}
