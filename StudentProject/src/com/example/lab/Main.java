package com.example.lab;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		System.out.println("Student List (ordered by name)");
		Student s1= new Student(101, "Park", 1000);
		al.add(s1);
		Student s2= new Student(102, "Lee", 1500);
		al.add(s2);
		al.add(new Student(103, "Wang", 2000));
		al.add(new Student(104, "Kim", 1300));
		al.add(new Student(105, "Oh", 1700));
		al.add(new Student(106, "Kyung", 2200));
		al.add(new Student(107, "Ahn", 1150));
		al.add(new Student(108, "Kang", 2100));
		al.add(new Student(109, "Moon", 1900));
		al.add(new Student(110, "Sung", 1500));
		
		Collections.sort(al);
		for(Student s:al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());;
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}

}
