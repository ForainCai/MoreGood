package com.ถþฮฌสýื้;

public class TestDemo {
	public boolean Find(int[][] array,int target) {
		for(int i=0;i<array.length;i++) {
			int low = 0;
			int longth = array[i].length-1;
			while(low<=longth) {
				int mid =(low+longth)/2;
				if(target>array[i][mid]) {
					low = mid+1;
					
				}else if(target<array[i][mid]) {
					low = mid-1;
				}else {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
//		int[][] array = new int[6][6];
//		System.out.println(array[2].length);
		TestDemo td = new TestDemo();
		int[][] array = new int[5][4];
		array[0][0] = 1;
		array[1][0] = 2;
		array[2][0] = 3;
		array[3][0] = 4;
		array[4][0] = 5;
		array[0][1] = 2;
		array[1][1] = 3;
		array[2][1] = 4;
		array[3][1] = 5;
		array[4][1] = 6;
		array[0][2] = 3;
		array[1][2] = 4;
		array[2][2] = 5;
		array[3][2] = 6;
		array[4][2] = 7;
		array[0][3] = 4;
		array[1][3] = 5;
		array[2][3] = 6;
		array[3][3] = 7;
		array[4][3] = 8;
//		array[0][4] = 5;
//		array[1][4] = 6;
//		array[2][4] = 7;
//		array[3][4] = 8;
//		array[4][4] = 9;
		boolean flag = td.Find(array, 8);
		System.out.println(flag);
}
}