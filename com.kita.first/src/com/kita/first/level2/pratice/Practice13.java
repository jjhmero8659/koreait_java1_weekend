package com.kita.first.level2.pratice;

import java.util.Arrays;

public class Practice13 {
public static void main(String[] args) {
	int[][] arr = new int[5][3];
	int num = 1;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = num;
			num++;
		}
	}
	for (int j = 0; j < arr.length; j++) {
		System.out.print(Arrays.toString(arr[j]));
	}
	System.out.println();
	System.out.println(Arrays.deepToString(arr));
	
}
}




















