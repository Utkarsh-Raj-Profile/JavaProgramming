public class Inheritance {
    public static void main(String[] args) {
        Fish nemo = new Fish();
        nemo.eats();
        nemo.swim();
        Bird Hok = new Bird();
        Hok.breaths();
        Hok.fly();
        // Dog dobby = new Dog();
        // dobby.eats();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
        // Fish shark = new Fish();
        // shark.eats();        
    }
}

//base class
class Animal {
    String color;

    void eats() {
        System.out.println("eats");
    }
    void breaths(){
        System.out.println("breaths");
    }
}

class Mammal extends Animal {
    // int legs;
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends Animal {
    // int legs;
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    // int legs;
    void fly() {
        System.out.println("fly");
    }
}

// class Dog extends Mammal {
//     String breed;
// }

//drived class / subclass
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }
