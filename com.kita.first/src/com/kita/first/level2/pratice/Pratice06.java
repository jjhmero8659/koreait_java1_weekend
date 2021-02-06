package com.kita.first.level2.pratice;

import java.util.Scanner;

public class Pratice06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		int sum=0;
		while(true)
		{
			System.out.print("숫자를 입력 :(종료 0) ");
			num = scan.nextInt();
			if(num == 0) {
				System.out.printf("합계 : %d",sum);
				break;
			}
			sum+=num;
			
		}
		scan.close();
	}

}
