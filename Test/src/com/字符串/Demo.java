package com.字符串;
/**
 * ==和eaqul区别
 * @author caishenchen
 *
 */
public class Demo {
	public static void main(String[] args) {
		String str = new String("hello");
		if(str.equals("hello")) {
			System.out.println("值相等");
		}else if(str=="hello") {
			System.out.println("地址相等");
		}
		
	}
}
