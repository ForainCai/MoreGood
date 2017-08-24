package com.test;

public class Test {
	public static void main(String[] args) {
		Star liudehua = new GoodStar("ΑυµΒ»ª", 2500000);
		liudehua.getInfo();
		liudehua.sing();
		liudehua.dance();
		Star furong = new OhMyGodStar("ά½ΘΨ½γ½γ", 250);
		BusinessStar hb = new BusinessStar("huangbo", 1000000);
		hb.sing();
		hb.dance();
		hb.sell("yangrou");
	}
	
}
