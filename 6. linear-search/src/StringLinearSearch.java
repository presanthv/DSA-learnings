public class StringLinearSearch {
    public static void main(String[] args) {
        String str = "presanth";
        char target = 'p';
        System.out.println(linearSearch2(str, target));
    }

    //find the char and return the index using for-i-loop
    static int linearSearch(String str, char target) {
        if(str.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }

    //find the char and return the boolean using for-each-loop
    static boolean linearSearch2(String str, char target) {
        if(str.isEmpty()) {
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
