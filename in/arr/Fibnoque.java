package in.arr;

public class Fibnoque {
	public static void main(String[] args) {
		int n = 10;
		int a = 0, b = 1;

		for (int i = 2; i <= n; i++) {
			int c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;

		}
	}

}
