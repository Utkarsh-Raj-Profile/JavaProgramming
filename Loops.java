import java.util.*;

public class Loops {
    public static void main(String[] args) {
        // int counter = 0;                                         //   While Loop
        // while (counter<100) {
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Printed Hello World 100 times");

        // int counter = 1;
        // while (counter <= 10) {
        //     System.out.println(counter);
        //     counter++;
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter range");
        // int range = sc. nextInt();
        // int counter = 1;
        // while (counter<=range) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }

    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    int sum = 0;
    //    int i=1;
    //    while (i<=n) {
    //     sum +=i;
    //     i++;
    //    }
    //    System.out.println("Sum is :" + sum);

    // for(int i=1;i<=10;i++){                             // For Loop
    //     System.out.println("Hello World");
    // }

    // for(int line =1; line<=4 ; line++){
    //     System.out.println("****");
    // }

    // int n = 10899;                    // Reverse of any number
    // while (n>0) {
    //     int lastdigit = n%10;
    //     System.out.print(lastdigit);
    //     n= n/10;
    // }
    // System.out.println();

    // int n = 10899;                   //reverse
    // int rev = 0;

    // while (n>0) {
    //     int lastdigit = n %10;
    //     rev = (rev*10) + lastdigit;
    //     n = n/10;
    // }
    // System.out.println(rev);

    // int counter = 1;            // Do while
    // do{
    //     System.out.println("Hello World");
    //     counter++;
    // }while(counter<=10);

    // for(int i = 0; i<=5; i++){
    //     if (i==3) {
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("I am out of the loop");

    // Scanner sc = new Scanner(System.in);                    // Break Statemant
    // do{
    //     System.out.println("Enter your number : ");
    //     int n =sc.nextInt();
    //     if (n % 10 == 0) {
    //         break;
    //     }System.out.println("Your number is : " + n);
    // }while (true);

    // for(int i = 1; i<=5 ; i++){                // Continue
    //     if (i == 3) {
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // Scanner sc = new Scanner(System.in);

    // do{
    //     System.out.println("Enter your number : ");
    //     int n = sc.nextInt();
    //     if (n % 10 == 0) {
    //         continue;
    //     }System.out.println("Your number is : " + n);
    // }while(true);

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 2) {
        System.out.println("n is a prime number");
    } else {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime==true) {
            System.out.println("n is a prime number");
        }else{
            System.out.println("n is not a prime number");
        }
    }

    }
}
