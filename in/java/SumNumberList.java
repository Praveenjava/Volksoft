package in.java;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumNumberList {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 5, 6 };
		Integer collect = Arrays.stream(arr).boxed().collect(Collectors.reducing(0, Integer::sum));
		System.out.println(collect);
	}

}
