package in.java;

public class LargestNumber {
	public static void main(String[] args) {
		int a = 25, b = 30, c = 40;

		int largest = a;

		if (b > largest) {
			largest = b;
		}

		if (c > largest) {
			largest = c;
		}

		System.out.println("Largest number is: " + largest);
	}

}
