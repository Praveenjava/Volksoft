package in.upcasting;

class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class UpCastingExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        // Up Casting
       // A child object is assigned to a parent reference.
        Animal a = d;

        a.eat();
    }
}
