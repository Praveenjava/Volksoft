package in.java;

import java.util.Arrays;

public class ReverseArr {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		int[] array = Arrays.stream(arr).boxed().sorted((a, b) -> Integer.compare(b, a)).mapToInt(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(array));
	}

}
