package com.kita.first.level2.pratice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int max = 90;
		int min = 10;
		int Num = (int)(Math.random()*(max-min+1) + min);
		int num;
		
		while(true) {
			System.out.print("값을 입력하세요 :");
			num = scan.nextInt();
			if(num > max || num < min) {
				System.out.println("잘못된 값을 입력했습니다.다시입력하세요");
				continue;
			}
			else if(num>Num) {
				System.out.println("정답보다 큽니다.");
			}
			else if(num<Num) {
				System.out.println("정답보다 작습니다.");
			}
			else {
				System.out.println("정답입니다!");
				break;
			}
			
		}
		scan.close();
	}
}
