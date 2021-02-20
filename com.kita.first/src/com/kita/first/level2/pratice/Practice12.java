package com.kita.first.level2.pratice;

import java.util.Arrays;

public class Practice12 {
public static void main(String[] args) {
	String[] arr1 = {"사과","포도","딸기","귤","바나나","코코넛"};
	String[] arr2 = new String[arr1.length];
	String[] arr3 = new String[arr1.length];
	
	for (int i = 0; i < arr2.length; i++) {
		arr2[i] = arr1[i];
	}
	
	System.out.println(Arrays.toString(arr2));
	
	arr2[3] = "레몬";
	
	System.out.println(Arrays.toString(arr2));
	
}
}
