package com.动态数组;

public class TangShi {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("床前明月光，疑是地上霜。举头望明月，低头思故乡。");
		sb.replace(0, 5, "白毛浮绿水");
		sb.insert(24, "quxiangxiangtiange");
		System.out.println(sb.toString());
	}
}
