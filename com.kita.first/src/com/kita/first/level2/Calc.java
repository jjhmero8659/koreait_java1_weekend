package com.kita.first.level2;

import java.util.Scanner;

public class Calc {
public static int minus(int x,int y) {	
	if(x>y) {
		return x-y;
	}
	else if(x<y) {
		return y-x;
	}
	else {return 0;}
}
public static int multiply(int x,int y) {
	return x*y;
}
public static double divide(double x,int y) {
	return x/y;
}
/*public static void powerOn() {
	System.out.println("전원을 킵니다");
}*/
public static void main(String[] args) {
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	System.out.println("-값 : "+ minus(num1,num2));
	System.out.println("*값 : "+ multiply(num1,num2));
	System.out.println("/값 : "+ divide(num1,num2));
	
	
	sc.close();
}
}
