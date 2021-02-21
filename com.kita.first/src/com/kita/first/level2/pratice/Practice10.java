package com.kita.first.level2.pratice;

import java.util.Arrays;

import com.kita.first.level2.For1;

public class Practice10 {
public static void main(String[] args) {
	int max = 9;
	int min = 1;
	int i,j;
	int[] arr = new int[9];
	for (i = 0; i < arr.length; i++) {	
		arr[i] = (int)(Math.random()*(max-min+1)+min);
		
		for (j= 0;j<i; j++) {
			if(arr[i] == arr[j])
			{
				i--;
				break;
			}
		}
		
	}

	System.out.println(Arrays.toString(arr));
}
}
