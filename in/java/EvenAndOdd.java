package in.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> even = asList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> odd = asList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);
	}

}
