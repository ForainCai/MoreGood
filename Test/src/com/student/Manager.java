package com.student;

import java.lang.invoke.SwitchPoint;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Manager {
	
	//初始化一些变量
	public void init(List<Student> data) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.setName("张三");
		s1.setName("李四");
		s2.setName("王五");
		Random r = new Random();
		s.getScore()[0] = r.nextInt(100);
		s1.getScore()[1] = r.nextInt(100);
		s2.getScore()[2] = r.nextInt(100);
		data.add(s);
		data.add(s1);
		data.add(s2);
	}
	//输入学生
	public void input(List<Student> list) {
		Student s = new Student();
		System.out.println("请输入学生姓名：");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		s.setName(name);
		for(int i=0;i<s.getScore().length;i++) {
			System.out.println("请输入学生第"+(i+1)+"门课成绩：");
			s.getScore()[i] = scan.nextInt();
		}
		list.add(s);
		System.out.println("添加成功");
	}
	//更新学生
	public void update(List<Student> list) {
		System.out.println("输入学生编号：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Student s = list.get(num);
		System.out.println("输入学生姓名：");
		String name = scan.next();
		s.setName(name);
		for(int i=0;i<s.getScore().length;i++) {
			System.out.println("请输入学生第"+(i+1)+"门课成绩：");
			s.getScore()[i] = scan.nextInt();
		}
		System.out.println("修改成功");
	}
	//显示学生
	public void display(List<Student> list) {
		System.out.println("编号\t"+"姓名\t"+"课程一\t"+"课程二\t"+"课程三");
//		Student s = new Student();
//		for(int i=0;i<list.size();i++) {
//			System.out.println(i+"\t"+s.getName()+"\t"+s.getScore()[0]+"\t"+s.getScore()[1]+"\t"+s.getScore()[2]);
//		}
		int i = 0;
		for(Student s : list) {
			System.out.println(i+"\t"+s.getName()+"\t"+s.getScore()[0]+"\t"+s.getScore()[1]+"\t"+s.getScore()[2]);
			i++;
		}
	}
	//排序
	public void courseAsc(List<Student> list) {
		Collections.sort(list, new CourseCompartor());
		
	}
	//显示菜单
	public void showMenu() {
		List<Student> data = new ArrayList<Student>();
		init(data);
		String[] menus = {"1、增加学员","2、修改学员","3、显示学员","4、排序","5、退出"};
		for(String s : menus) {
			System.out.println(s);
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			int cmd=-1;
			try {
				System.out.println("请输入指令：");
				cmd = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("输入指令不合法！");
				scan = new Scanner(System.in);
				continue;
			}
			switch (cmd) {
			case 1:
				this.input(data);
				break;
			case 2:
				this.update(data);
				break;
			case 3:
				this.display(data);
				break;
			case 4:
				this.courseAsc(data);
				break;
			case 5:
				return;

			default:
				System.out.println("未知指令！");
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Manager().showMenu();;
	}
}
