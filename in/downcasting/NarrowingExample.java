package in.downcasting;

public class NarrowingExample {

	public static void main(String[] args) {

		double a = 100.50;

		// Narrowing
		int b = (int) a;

		System.out.println("double value : " + a);
		System.out.println("int value    : " + b);
	}
}