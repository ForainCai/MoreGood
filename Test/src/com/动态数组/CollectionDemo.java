package com.¶¯Ì¬Êý×é;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("huanglingdan");
		list.add("heshuxin");
		list.add("huwenbang");
		list.add("wangmingyi");
		list.remove("huanglingdan");
		Collection list1 = new ArrayList();
		list1.add("huanglingdan");
		list1.add("heshuxin");
		list.removeAll(list1);
		Iterator itor = list.iterator();
		while(itor.hasNext()) {
			Object o = itor.next();
			System.out.println(o);
		}
	}
}
