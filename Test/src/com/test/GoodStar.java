package com.test;

public class GoodStar extends Star{

	public GoodStar(String name, int salary) {
		super(name, salary);
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("���ĺ�");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("���İ�");
	}

}
