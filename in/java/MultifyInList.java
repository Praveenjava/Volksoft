package in.java;

import java.util.Arrays;
import java.util.Optional;

public class MultifyInList {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 5 };
		Optional<Integer> reduce = Arrays.stream(arr).boxed().reduce((a, b) -> a * b);
		System.out.println(reduce);
	}

}
