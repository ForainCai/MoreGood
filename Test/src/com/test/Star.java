package com.test;

public abstract class Star{
	String name;
	int salary;
	public Star(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	public  void getInfo() {
		System.out.println(name+salary);
	}
	public abstract void sing();
	public abstract void dance();
}
