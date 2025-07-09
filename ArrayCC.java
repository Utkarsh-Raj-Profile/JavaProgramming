import java.util.*;
public class ArrayCC {
    public static void update(int marks[], int nonchangeable) {
        nonchangeable =10;
        for(int i = 0; i < marks.length ; i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nonchangeable =5;
        update(marks , nonchangeable);
        System.out.println(nonchangeable);

        //for print marks
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        // System.out.println("lenght of array : " + marks.length);
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt(); //maths
        // marks[1] = sc.nextInt(); //phys
        // marks[2] = sc.nextInt(); //chem

        // System.out.println("maths :" + marks[0] );
        // System.out.println("phys : " + marks[1]);
        // System.out.println("chem : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage : " + percentage + "%");
    }
}
