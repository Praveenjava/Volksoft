package in.java;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 3, 4 };
		Map<Integer, Long> collect = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + "::" + entry.getValue()));
	}

}
