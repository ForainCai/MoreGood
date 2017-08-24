package com.¶¯Ì¬Êý×é;

public class StringBDemo {
	public static void main(String[] args) {
		int[] num = new int[]{1,2,3,4,5,6,7};
		for(int i : num) {
			System.out.println(i);
		}
		String[] s = new String[] {"nihao","buhao","bushihenhao"};
		for(String ss : s) {
			System.out.println(ss);
		}
//		long begin = System.currentTimeMillis();
//		StringBuffer sb = new StringBuffer("abc");
//		for (int i = 0; i < 1000000; i++) {
//			sb.append("abc");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-begin);
	}
}
