package com.kita.first.level2;

public class NamedLoop {
public static void main(String[] args) {
	Parent:
	for (int i = 0; i < 5; i++) {
		Child:
		for (int j = 0; j < 3; j++) {
			if(j==1) {
				continue Child;
				
			}
			System.out.printf("i:%d, j: %d\n",i,j);
		}
	}
}
}
