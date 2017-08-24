package com.¶¯Ì¬Êý×é;

public class Student {
	String name;
	int no;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student s = (Student) obj;
			if(this.no==s.no) {
				return true;
			}
		}
		return false;
	}
	
}
