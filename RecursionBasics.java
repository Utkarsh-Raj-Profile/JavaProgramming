public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {                                           //Factorial of n
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n* fact(n - 1);
        return fn;
    }

    public static int calcSum(int n){                                         //Sum of n natural number
        if(n==1){
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n+Snm1;
        return Sn;
    }

    public static int fib(int n) {                                          //Print Nth Fibonacci number
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i){                         //Check if a given array is sorted or not.
        if (i == arr.length-1) {
            return true;
        }

        if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key, int i) {              //WAF to find the first occurence of an element in an array.
        if (i==arr.length) {
            return -1;
        }
        
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[], int key, int i){            //Last Occurence
        if (i==arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){                                  //Print x to the power n
        if (n==0) {                                                        // timeComplexity o(n)
            return 1;
        }

        // int Xnm1 = power(x, n-1);
        // int Xn = x * Xnm1;
        // return Xn;

        //or

        return x * power(x, n-1);
    }

    public static int optimizedPower(int a, int n){                      //optimized solution
        if(n==0){                                                        //timecomplexity o(logn)
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowersq = halfPower * halfPower;

        //n is odd
        if(n%2!=0){
            halfPowersq = a * halfPowersq;
        }
        return halfPowersq;
    }

    public static int tilingProblem(int n){                                 //Tiling Problem
        if (n==0 || n==1) {
            return 1;
        }

        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){                 //Remove duplicate in a string
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            removeDuplicate(str, idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static int friendspairing(int n){
        if (n==1 || n==2) {
            return n;
        }

        return friendspairing(n-1) + (n-1) * friendspairing(n-2);
    }

    public static void printBinStrings(int n, int lastPlace, String Str){
        if (n==0) {
            System.out.println(Str);
            return;
        }

        printBinStrings(n-1, 0, Str + "0");
        if (lastPlace==0) {
            printBinStrings(n-1, 1, Str + "1");
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        String str = "appnnacollege";
        int arr[] = {8,3,6,9,5,10,2,5,3};
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        System.err.println(friendspairing(3));
        printBinStrings(3, 0, "");
    }
}