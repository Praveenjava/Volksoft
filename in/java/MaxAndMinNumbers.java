package in.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMinNumbers {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2, 0, 3, 4, 5, 8, 9);
		Optional<Integer> max = asList.stream().max(Integer::compareTo);
		// System.out.println(max);
		max.ifPresent(value -> System.out.println("Max:" + value));

		Optional<Integer> min = asList.stream().min(Integer::compareTo);
		min.ifPresent(value -> System.out.println("Min:" + value));

	}

}
