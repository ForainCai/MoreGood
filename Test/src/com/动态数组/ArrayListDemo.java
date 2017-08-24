package com.¶¯Ì¬Êı×é;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
//		List<String> s = new ArrayList<String>();
//		s.add("²ÌÉò³¿");
//		s.add("Áõ¾²");
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
