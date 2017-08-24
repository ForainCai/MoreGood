package com.二维数组;
/**
 * 问题：在一个二维数组中，每一行都按照从左到右递增的顺序，每一列都按照
 * 从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * 整数，判断数组中是否含有该整数。
 * @author caishenchen
 *
 */
public class  Queryint{
	public boolean query(int[][] array,int target) {
		
		for (int i = 0; i < array.length; i++) {
			int start = 0;
			int end = array[0].length-1;
			while(start<=end) {
				int mid = (start+end)/2;
				if(target>array[i][mid]) {
					start = mid+1;
				}else if(target<array[i][mid]) {
					end = mid-1;
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
		Queryint td = new Queryint();
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
		boolean flag = td.query(array, 9);
		System.out.println(flag);
}
}
