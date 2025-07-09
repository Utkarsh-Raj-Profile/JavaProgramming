public class Palindrome {
    public static boolean IsPalindrome(String str) {                            // O(n) -- Time Complixity
        for(int i =0; i<str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)) {
                //Not a palindrome.
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="racecar";
        System.out.println(IsPalindrome(str));
    }
}
