package com.kita.first.level1.pratice;

import java.util.Scanner;

public class Pratice04 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("값을 입력해주세요 :");
		int num = scan.nextInt();
		
		switch(num % 2)
		{
		case 0:
			System.out.println("값 이 짝수 입니다.");
			break;
		case 1:
			System.out.println("값 이 홀수 입니다.");
			break;
		}
		
		scan.close();
	}

}
