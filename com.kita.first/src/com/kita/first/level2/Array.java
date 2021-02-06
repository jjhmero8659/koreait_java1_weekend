package com.kita.first.level2;

public class Array {
public static void main(String[] args) {
	int[] arr1 = new int[5];
	char[] arr2 = new char[10];
	
	double[] arr3 = new double[100];
	String[] arr4 = new String[10];
	
	arr1[2] = 5; 
	//System.out.println(arr1[2]);
	
	for (int i = 0; i < arr1.length; i++) {
		arr1[i] = 3;
		
	}
	
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
	}
	
	int len = arr1.length;
	System.out.println(len);
	System.out.println(arr1.length);
	
}
}
