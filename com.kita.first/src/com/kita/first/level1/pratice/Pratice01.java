package com.kita.first.level1.pratice;

public class Pratice01 {
	public static void main(String [] args)
	{
		int n1 = 2;
		int n2 = 3;
		
		if(n1 > n2){
			System.out.println("n1이 n2보다 크다.");
		}
		else if(n1 == n2){
			System.out.println("n1 과 n2가 같습니다.");
		}
		else{
			System.out.println("n1이 n2보다 작다.");
		}
		
		System.out.println("num의 값을 입력하세요 :");
		
		
		
		int num;
		
		
		switch(num)
		{
		case 1: System.out.println("num의 값은 1입니다.");break;
		case 2: System.out.println("num의 값은 2입니다.");break;
		case 3: System.out.println("num의 값은 3입니다.");break;
		
		}
	}

	private static void input(int num) {
		// TODO Auto-generated method stub
		
	}

}
