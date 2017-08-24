package com.×Ö·û´®;

public class replaceSpace {
	
	public String rSpace(StringBuffer str) {
		if(str==null) {
			return null;
		}
		StringBuffer newstr = new StringBuffer();
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				newstr.append("%");
				newstr.append("2");
				newstr.append("0");
			}else {
				newstr.append(str.charAt(i));
			}
		}
		return newstr.toString();
	}
	public static void main(String[] args) {
		replaceSpace rs = new replaceSpace();
		StringBuffer sb = new StringBuffer("hello world,my name is forain");
		String s = rs.rSpace(sb);
		System.out.println(s);
	}
}
