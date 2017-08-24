package com.student;

public class Student {

	String name;
	int[] scores = new int[3];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return scores;
	}
	public void setScore(int[] scores) {
		this.scores = scores;
	}
	
}
