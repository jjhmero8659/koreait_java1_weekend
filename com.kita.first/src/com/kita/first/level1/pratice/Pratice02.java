package com.kita.first.level1.pratice;

import java.util.Scanner;

public class Pratice02 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("값을 입력해주세요 :");
		int num = scan.nextInt();
		
		if(num %2==0) {
			System.out.println("짝수 입니다.");
		}
		else {
			System.out.println("홀수 입니다.");
		}
		
		scan.close();
	}

}
