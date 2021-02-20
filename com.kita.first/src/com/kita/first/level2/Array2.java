package com.kita.first.level2;

import java.util.Arrays;

public class Array2 {
public static void main(String[] args) {
	int[][] arr = new int[2][3];
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j] = 1;
		}
	}
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
		}
	}
	System.out.println();
	for (int i = 0; i < 2; i++) {
		System.out.print(Arrays.toString(arr[i]));
	}
	
}
}
