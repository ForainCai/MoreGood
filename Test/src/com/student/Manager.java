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
	
	//��ʼ��һЩ����
	public void init(List<Student> data) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		s.setName("����");
		s1.setName("����");
		s2.setName("����");
		Random r = new Random();
		s.getScore()[0] = r.nextInt(100);
		s1.getScore()[1] = r.nextInt(100);
		s2.getScore()[2] = r.nextInt(100);
		data.add(s);
		data.add(s1);
		data.add(s2);
	}
	//����ѧ��
	public void input(List<Student> list) {
		Student s = new Student();
		System.out.println("������ѧ��������");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		s.setName(name);
		for(int i=0;i<s.getScore().length;i++) {
			System.out.println("������ѧ����"+(i+1)+"�ſγɼ���");
			s.getScore()[i] = scan.nextInt();
		}
		list.add(s);
		System.out.println("��ӳɹ�");
	}
	//����ѧ��
	public void update(List<Student> list) {
		System.out.println("����ѧ����ţ�");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Student s = list.get(num);
		System.out.println("����ѧ��������");
		String name = scan.next();
		s.setName(name);
		for(int i=0;i<s.getScore().length;i++) {
			System.out.println("������ѧ����"+(i+1)+"�ſγɼ���");
			s.getScore()[i] = scan.nextInt();
		}
		System.out.println("�޸ĳɹ�");
	}
	//��ʾѧ��
	public void display(List<Student> list) {
		System.out.println("���\t"+"����\t"+"�γ�һ\t"+"�γ̶�\t"+"�γ���");
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
	//����
	public void courseAsc(List<Student> list) {
		Collections.sort(list, new CourseCompartor());
		
	}
	//��ʾ�˵�
	public void showMenu() {
		List<Student> data = new ArrayList<Student>();
		init(data);
		String[] menus = {"1������ѧԱ","2���޸�ѧԱ","3����ʾѧԱ","4������","5���˳�"};
		for(String s : menus) {
			System.out.println(s);
		}
		Scanner scan = new Scanner(System.in);
		while (true) {
			int cmd=-1;
			try {
				System.out.println("������ָ�");
				cmd = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("����ָ��Ϸ���");
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
				System.out.println("δָ֪�");
				break;
			}
		}
	}
	public static void main(String[] args) {
		new Manager().showMenu();;
	}
}
