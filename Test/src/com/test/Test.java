package com.test;

public class Test {
	public static void main(String[] args) {
		Star liudehua = new GoodStar("���»�", 2500000);
		liudehua.getInfo();
		liudehua.sing();
		liudehua.dance();
		Star furong = new OhMyGodStar("ܽ�ؽ��", 250);
		BusinessStar hb = new BusinessStar("huangbo", 1000000);
		hb.sing();
		hb.dance();
		hb.sell("yangrou");
	}
	
}
