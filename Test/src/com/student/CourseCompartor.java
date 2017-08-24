package com.student;

import java.util.Comparator;

//±È½ÏÆ÷
public class CourseCompartor implements Comparator<Student>{
	
	public int compare(Student o1,Student o2) {
		// TODO Auto-generated method stub
		if(o1.getScore()[0]>o2.getScore()[0]) {
			return 1;
		}else if(o1.getScore()[0]<o2.getScore()[0]){
			return -1;
		}
		return 0;
	}

}
