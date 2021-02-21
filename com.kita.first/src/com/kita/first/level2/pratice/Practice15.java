package com.kita.first.level2.pratice;

import java.util.Scanner;

public class Practice15 {
public static void main(String[] args) {
	final int LEN = 3; 
	Scanner sc = new Scanner(System.in);
	int[] com_num = new int[LEN];
	int[] p_num = new int[LEN];
	int max = 9;
	int min = 1;
	int strike = 0;
	int ball = 0;
	int out = 0;
	int cnt=1;
	
	for (int i = 0; i < p_num.length; i++) {
		com_num[i] = (int)(Math.random()*(max-min+1)+min);
		for (int j = 0; j < i; j++) {
			if(com_num[i] == com_num[j]) {
				i--;
			}
			
		}
	}
	System.out.println("================================");
	for (int i = 0; i < p_num.length; i++) {
		System.out.println(com_num[i]);
	}
	System.out.println("================================");
	
	while(true) {
		strike = 0;
		ball = 0;
		out = 0;
		for (int i = 0; i < p_num.length; i++) {
			System.out.printf("값%d :",i+1);
			p_num[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if(p_num[i]==p_num[j]) {
					i--;
					System.out.println("값이 중복되었습니다.");
					break;
				}
			}
		}
		for (int i = 0; i < LEN; i++) {
			for (int j = 0; j < LEN; j++) {
				if(p_num[i] == com_num[j]) {
					if(p_num[i] == com_num[i]) {
						strike++;
					}
					else {
						ball++;
					}
				}
				if(strike == LEN) {
				System.out.println("정답입니다!!");
				System.out.printf("시도한 횟수는 %d 입니다.",cnt);
				return;
			}			
			}	
		}
		//if(strike == LEN) {
		//	System.out.println("정답입니다!!");
		//	break;
		//}
		//else {
		System.out.printf("s:%d  b:%d o:%d\n",strike,ball,out);//LEN-strike-ball
		cnt++;
		//}
	}
}
}

