package com.¶¯Ì¬Êý×é;

public class StringDemo1 {
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		String s = "abc";
		for(int i=0;i<50000;i++) {
			
			s+="abc";
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}
}
