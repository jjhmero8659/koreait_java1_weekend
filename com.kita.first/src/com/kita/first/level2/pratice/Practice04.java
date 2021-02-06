package com.kita.first.level2.pratice;

public class Practice04 {
	public static void main(String[] args) {
		int j,i,k,l;
		for (i = 0; i < 3; i++) {
			for(j=3; j>i; j--) {
			System.out.print(" ");
			}
			for(k=0; k < i+1; k++) 
			{
				System.out.print("*");
			}
			for(l=0; l < j; l++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (k = 3; k > j-1 ; k--) {
				System.out.print("*");
			}
			for (k = 2; k > j-1 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
