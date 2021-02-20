package com.kita.first.level2;

import java.util.Arrays;

public class ArrayCopy {
public static void main(String[] args) {
	int[] arr1 = {1,2,3,4};
	int[] arr2 = arr1;
	int[] arr3 = new int[arr1.length];
	
	for (int i = 0; i < arr1.length; i++) {
		arr3[i] = arr1[i];
	}
	
	for(int result : arr3) {
		System.out.print(result + ", ");
		
	}
	System.out.println();
	System.out.println(Arrays.toString(arr3));
	System.out.println("arr :" + arr3);
}
}
