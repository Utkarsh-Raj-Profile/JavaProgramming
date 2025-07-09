import java.util.*;

public class CallFu {
    public static void PrintHelloWorld() {
        System.out.println("Hello World");
    } 
    public static int calculatesum(int a , int b) {       // Parameters or formal parameters
        int sum = a + b;
        return sum;
    }
    public static void swap(int a , int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }

    public static int multiply(int a,int b) {
        int product = a*b;
        return product;
    }
    public static int factorial (int n) {
        int f = 1;
        for(int i =1; i <= n ; i++){
            f = f*i;
        }
        return f;
    }
    public static int bincoff(int n , int r) {
        int factor_n = factorial(n);
        int factor_r = factorial(r);
        int factor_nmr = factorial(n - r);
        int binomial =factor_n/(factor_r*factor_nmr);
        return binomial;
    }
    // public static int sum(int a, int b) {                   //with two parameters(function overloading)
    //     return(a+b);
    // }
    // public static int sum(int a,int b,int c) {                 // with three parameter(function overloading)
    //     return(a+b+c);
    // }
    public static int sum(int a, int b) {                          //fun to cal sum of 2 int(Overloading using data type)
        return a+b;
    }
    public static float sum(float a, float b) {                    //fun to cal sum of 2 float(overloading using data type)
        return a+b;
    }
    // public static boolean isprime(int n) {
    //     if(n == 2){
    //         return true;
    //     }
    //     for(int i = 2; i<=n-1 ;i++) {
    //         if(n % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public static boolean isprime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void RangeInPrime(int n) {
        for(int i =2; i<=n ; i++) {
            if(isprime(i)) {      //true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int sum = calculatesum(num1, num2);               // Arguments or Actual Parameter
        // System.out.println("Your sum is : " + sum);
        // int a = 5;
        // int b = 10;
        // swap(a, b);                                            // Call By Value

        // int prod = multiply(10, 05);
        // System.out.println("product of given number is : " + prod);

        // System.out.println("Factorial of given number : "  +factorial(4));

        // System.out.println(bincoff(5, 2));
        // System.out.println(sum(5, 3));
        // System.out.println(sum(4.8f,3.2f));

        RangeInPrime(100);
    }
}
