public class PatternsPart1 {
    public static void main(String[] args) {
        for(int line = 1; line <= 4; line++) {                    // Pattern
            for(int stars = 1; stars <= line; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        // int n =4;                                                    // Inverted Star Pattern
        // for(int line = 1; line<=n; line++) {
        //     for(int stars =1; stars <=n-line+1; stars++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n= 4;                                                      // Half Parimid
        // for(int line = 1; line <= n; line++) {
        //     //numbers
        //     for(int number = 1; number <= line ; number++) {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        // int n =4;                                                            // Character Pattern
        // char ch = 'A';
        // //Outer Loop
        // for(int line = 1; line <= n ; line++){
        //     //Inner Loop
        //     for(int chars = 1 ; chars <= line ; chars++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    }
}
