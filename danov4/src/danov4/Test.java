package danov4;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Subject s1 = new Subject("History");
		Subject s2 = new Subject("Mathematics");
		Subject s3 = new Subject("Economy");
		
		Teacher t1 = new Teacher("Svilen", "Svilenov", "Svilenov", "9800000000", 23, s1);
		Teacher t2 = new Teacher("Ivan", "Ivanov", "Ivanov", "8900000000", 32, s2);
		Teacher t3 = new Teacher("Dimitar", "Dimitrov", "Dimitrov", "9300000000", 28, s3);
		ArrayList<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);

		for (Teacher t : teachers) {
			System.out.println("Name : " + t.getName());
			System.out.println("Subject : " + t.getS1().getDiscipline());
			System.out.println();
		}

	}

}
