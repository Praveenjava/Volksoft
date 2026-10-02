package in.java;

public class Demo {

	{
		System.out.println("i am from instance block");
	}

	public Demo() {
		System.out.println("I am from constructor");
	}

	static {
		System.out.println("I am from static block");
	}

	public static void main(String[] args) {
		System.out.println("i am from main method...");
		Demo d = new Demo();
	}
}
