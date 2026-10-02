package in.java;

import java.util.Arrays;

public class Anangram {
	public static void main(String[] args) {
		String s = "silent";
		String s1 = "listen";
		
		char[] a = s.toCharArray();
		char[] b = s1.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean equals = Arrays.equals(a, b);
		if(equals) {
			System.out.println("Its Anangram");
		}else {
			System.out.println("Its not Anangram");
		}
		
	}

}
