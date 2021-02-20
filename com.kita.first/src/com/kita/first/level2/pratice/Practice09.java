package com.kita.first.level2.pratice;

import java.util.Arrays;

public class Practice09 {
public static void main(String[] args) {
	int[] arr = new int[100];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = i+1;
	}
	
	for (int val : arr)
	{
		System.out.print(val+", ");
	}
	System.out.println();
	System.out.println(Arrays.toString(arr));
}
}
