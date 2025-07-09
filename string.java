import java.util.Scanner;

public class string {
    public static void PrintLetters(String Str) {
        for(int i = 0; i<Str.length(); i++) {
            System.out.print(Str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {'a','b','c','d','e'};

        String str = "abcde";
        String str2 = new String("abcde");

        //Strings are IMMUTABLE.

        //Input/Output in String.

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();                               // Full Line
        // //name = sc.next();                                 // -- One Word
        // System.out.println(name);
        // System.out.println(name.length());                 // String Length

        //Concatination
        String Firstname = "Utkarsh";
        String Lastname ="Raj";
        String Fullname = Firstname + " " + Lastname;
        System.out.println(Fullname);

        //CharAt()

        //System.out.println(Fullname.charAt(0));
        PrintLetters(Fullname);
    }
}
