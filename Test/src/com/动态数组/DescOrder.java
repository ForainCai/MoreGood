package com.��̬����;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DescOrder {

	public static void reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺");
		String s;
		s = scan.next();
		reverseString(s);
	}
}
