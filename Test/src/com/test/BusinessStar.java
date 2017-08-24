package com.test;

public class BusinessStar extends Star implements Business{

	public BusinessStar(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("can sing");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("can dance");
	}

	@Override
	public void sell(String xx) {
		// TODO Auto-generated method stub
		System.out.println("Âô"+xx);
	}

}
