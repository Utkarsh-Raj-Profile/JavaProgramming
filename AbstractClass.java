// public class AbstractClass {
//     public static void main(String[] args) {
//         Horse h = new Horse();
//         h.eat();
//         h.walk();
//         System.out.println(h.color);

//         Chiken c = new Chiken();
//         c.eat();
//         c.walk();
//     }
// }

// abstract class Animal {
//     String color;

//     Animal() {
//         color = "brown";
//     }

//     void eat() {
//         System.out.println("animal eats");
//     }

//     abstract void walk();
// }

// class Horse extends Animal {
//     void changeColor() {
//         color = "dark brown";
//     }

//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chiken extends Animal {
//     void changeColor() {
//         color = "yellow";
//     }

//     void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isPrime = true;
            for(int i = 2; i<=n-1;i++){
                if(n%i==0){
                    isPrime = false;
            }
        }
        if(isPrime==true){
            System.out.println("n is prime number");
        }else{
            System.out.println("n is not a prime number");
        }
        }
    }
}