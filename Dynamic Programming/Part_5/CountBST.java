public class CountBST {
    public static int countBSTCode(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n+1; i++) {
            //Ci -> BST (i nodes) -> dp[i]
            for(int j = 0; j < i; j++) {
                int left = dp[j];
                int rigth = dp[i-j-1];
                dp[i] += left * rigth;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countBSTCode(n));
    }
}
