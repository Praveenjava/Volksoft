package in.downcasting;

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

public class DownCastingExample {

	public static void main(String[] args) {

		Animal a = new Dog();

		// Down Casting
		Dog d = (Dog) a;

		d.eat();
		d.bark();
	}
}