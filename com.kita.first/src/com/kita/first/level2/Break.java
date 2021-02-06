package com.kita.first.level2;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.printf("i는 %d 입니다.\n",i);
			if(i == 5) {
				System.out.println("반복문을 종료합니다.");
				break;
			}
		}
	}

}
