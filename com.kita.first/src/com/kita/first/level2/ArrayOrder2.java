package com.kita.first.level2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder2 {
public static void main(String[] args) {
	int arr[] = {5,4,3,2,1,6};
	int min,temp=0;
	for (int i = 0; i < arr.length-1; i++) {
		min = i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[min] < arr[j]){
				min = j;
			}
		}
		if(min != i)
		temp = arr[min];
		arr[min] = arr[i];
		arr[i] = temp;
		System.out.println(Arrays.toString(arr));
	}
}
}
