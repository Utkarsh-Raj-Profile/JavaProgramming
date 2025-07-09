public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "Utkarsh";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++) {
            System.err.println(s2.marks[i]);
        }
        
        // constructor overloading
        // Student s2 = new Student("Utkarsh");
        // Student s3 = new Student(123);
        // Student s4 = new Student("Shradha", 123);
        // System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        // non-parameterized constructor
        System.err.println("Constructor is called...");
    }
    Student(String name){  
        marks = new int[3];                                                     // parameterized constructor
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
