package com.��̬����;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
//		List<String> s = new ArrayList<String>();
//		s.add("����");
//		s.add("����");
//		for (String string : s) {
//			System.out.println(string);
//		}
		List<Student> stu = new ArrayList<Student>();
		Student s1 = new Student("csc", 1);
		stu.add(s1);
		for (Student string : stu) {
			System.out.println(string);
		}
	}
}
