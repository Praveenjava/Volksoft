package in.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {

		List<Student> al = new ArrayList<>();

		al.add(new Student(101, "John", 3));
		al.add(new Student(104, "Anil", 4));
		al.add(new Student(102, "Smith", 2));
		al.add(new Student(103, "Robert", 1));

		Collections.sort(al);

		for (Student s : al) {
			System.out.println(s);
		}

	}

}
