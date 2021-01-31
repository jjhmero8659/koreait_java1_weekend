package com.kita.first.level1;

public class Print2 {
	public static void main(String [] args)
	{
		String name = "홍길동";
		int age = 34;
		System.out.println("제 이름은 " + name +"이고 나이는" +age+"세 입니다.");
		System.out.printf("제 이름은 %s 이고 나이는 %d 세 입니다.\n",name,age);
		
		double grade = 44.34323;
		System.out.printf("제 학점의 평균 %.2f입니다.",grade);
	}
}
