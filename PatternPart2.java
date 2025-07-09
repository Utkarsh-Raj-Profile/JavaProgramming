public class PatternPart2 {

    public static void Hollow_Rectangle(int totrows, int totcolumns) {
        //outer loop
        for(int i =1; i <= totrows; i++){
            //inner loop
            for(int j= 1; j <= totcolumns; j++){
                //cells (i,j)
                if (i == 1|| i== totrows || j == 1|| j== totcolumns) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Inverted_Routed_half_Perimid(int n) {
        for(int i =1; i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Inverted_Routed_half_Perimid_withNumbers(int n) {
        for(int i= 1; i<=n;i++){
            //inner loop - numbers
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++){
            //inner loop - totalnumber of times counter print
            for(int j =1; j<= i ; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void triangle(int n) {
        for(int i =1;i<=n;i++){
            for(int j=1; j<=i;j++){
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void buterfly(int n) {
        // 1st half
        for(int i =1; i<=n; i++){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
            //2nd half
            for(int i = n; i>=1; i--){
                 // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
        public static void solid_rombos(int n) {
            //lines
            for(int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j =1; j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void hollow_rombus(int n) {
            for(int i =1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //hollow rombus
                for(int j=1;j<=n;j++){
                    if (i==1||i==n||j==1||j==n) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        public static void diamond(int n) {
            //lines
            for(int i=1; i<=n;i++){
                //spaces
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                //stares
                for(int j=1; j <= (2*i)-1 ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            // //inverted image
            // for(int i =n; i>=1; i--){
            //      //spaces
            //      for(int j=1; j<=(n-i); j++){
            //         System.out.print(" ");
            //     }
            //     //stares
            //     for(int j=1;j<=(2*i)-1;j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
        }
    public static void main(String[] args) {
        // Hollow_Rectangle(4,5);
        // Inverted_Routed_half_Perimid(5);
        //Inverted_Routed_half_Perimid_withNumbers(5);
        //floyds_triangle(5);
        //triangle(5);
        //buterfly(4);
        //solid_rombos(5);
        //hollow_rombus(5);
        diamond(5);
    }
    
}
