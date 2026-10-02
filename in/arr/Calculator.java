package in.arr;

public class Calculator {

	public static void main(String[ ] args) {

		String s1 = "10" ;
		String s2 = "20";

		int i = Integer.parseInt ( s1 ) ;
		int j = Integer.parseInt ( s2 );
		String concat = s1.concat(s2);

		
		System.out.println (concat);   // 30

	}
}

