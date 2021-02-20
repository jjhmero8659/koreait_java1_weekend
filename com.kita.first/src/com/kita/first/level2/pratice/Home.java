package com.kita.first.level2.pratice;

import java.util.Scanner;

public class Home {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String Menu[] = {"콜라","사이다", "캔커피", "데자와","환타", "웰치스"};
	int Price[] = {900,700,400,500,600,1000};
	int i;
	int total=0;
	System.out.println("--메뉴--");
	for(i=0; i<Price.length;i++)
	System.out.printf("%d. %s %d원\n",i+1,Menu[i],Price[i]);
	
	while(true) {
		System.out.print("메뉴를 입력하세요(0 입력 시 종료) :");
		int menu = scan.nextInt();
		if(menu == 0)
			break;
		else if(0 < menu && menu < 7){
			System.out.printf("%s %d원\n",Menu[menu-1],Price[menu-1]);
			total += Price[menu-1];
		}
		else {
			System.out.println("잘못된 값을 입력하였습니다.");
		}		
	}
	System.out.println("합계 :"+ total);
	scan.close();
}
}









