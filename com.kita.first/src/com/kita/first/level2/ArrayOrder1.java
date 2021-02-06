package com.kita.first.level2;

public class ArrayOrder1 {
public static void main(String[] args) {
	int[] arr = {34,67,2,11,6,90};
			//   i  z
	int temp;
	
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int z = i+1; z < arr.length; z++) {
			if(arr[i]>arr[z]) {
				temp = arr[z];
				arr[z] = arr[i];
				arr[i] = temp;
			}
			
		}
		
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
}
