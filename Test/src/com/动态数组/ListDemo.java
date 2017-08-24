package com.¶¯Ì¬Êý×é;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		add(list);
//		show(list);
//		delete(list);
//		show(list);
		
	}
	public static void add(Collection list) {
		Student s = new Student("csc", 1);
		Student s1 = new Student("zhy", 2);
		Student s2 = new Student("hy", 3);
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		
	}
	public static void delete(Collection list) {
		Student s3 = new Student("hy", 3);
		list.remove(s3);
	}
	public static void show(Collection list){
		Iterator itor = list.iterator();
		while(itor.hasNext()) {
			Object o = itor.next();
			System.out.println(o);
		}
		
	}
}
