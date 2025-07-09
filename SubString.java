public class SubString {
    public static String SubStrings(String str, int si, int ei) {
        String SubStr = "";
        for(int i = si ; i < ei ; i++) {
            SubStr += str.charAt(i);
        }
        return SubStr;
    }
    public static void main(String[] args) {
        //String str = "Hello World";
        //System.out.println(str.substring(0, 5));
        //System.out.println(SubStrings(str,0,5));

        String fruits[] = {"apple", "banana", "mango"};                     //O(x * N)      -- Time Complixity
        String largest =fruits[0];
        for(int i=1;i<fruits.length;i++){
            if (largest.compareTo(fruits[i]) < 0 ) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
