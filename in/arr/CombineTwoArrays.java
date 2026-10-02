package in.arr;

import java.util.Arrays;

public class CombineTwoArrays {

	public static void main(String[] args) {
		int i[] = { 2, 3, 4, 5, 6 };
		int j[] = { 7, 8, 9, 0, 1 };

		Object[] array = Arrays.stream(new int[][] { i, j })
				.flatMapToInt(Arrays::stream)
				.boxed()
				.sorted((a, b) -> a - b)
				.toArray();
		System.out.println(Arrays.toString(array));

	}

}
