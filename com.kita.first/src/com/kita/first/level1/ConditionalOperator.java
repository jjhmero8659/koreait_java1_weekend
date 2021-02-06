package com.kita.first.level1;

import java.util.Scanner;

public class ConditionalOperator {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("정수하나를 입력하시오 :");
	int num = scan.nextInt();
	//if(num % 2 == 1) {
	//	System.out.println("홀수입니다");
	//}
	//else {
	//	System.out.println("짝수입니다");
	//}
	
	String sNum = (num%2 == 1) ? "홀수" : "짝수";
	System.out.printf("%s입니다.",sNum);
	scan.close();
}
}
