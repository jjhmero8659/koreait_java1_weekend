package com.kita.first.level2.pratice;

import java.util.Arrays;

public class My_Practice {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[] = a.clone();
	int[] c = Arrays.copyOf(a, a.length);
	int d[] = new int[a.length];
	
	System.arraycopy(a, 0, d, 0, a.length);
	
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(c));
	System.out.println(Arrays.toString(d));
	
}
}
