package com.kita.first.level2.pratice;

public class Practice03 {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\t",i,j,i*j);
			}
			System.out.println();
		}
	}

}
