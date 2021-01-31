package com.kita.first.level1.pratice;

import java.util.Scanner;

public class Pratice03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해주세요 :");
		String math = scan.next();
		//"가" 주소와 math의 동적할당 주소가 다름
		
		System.out.print("점수를 입력해주세요:");
		int math_re = scan.nextInt();
		
		
		int ave=0;
		
		if(math.equals("가")){//(math =="가")
			ave = 60;
		}
		else if(math.equals("나")){
			ave = 70;
		}
		
		if(math_re > ave) {
			System.out.println("평균 이상입니다.");
		}
		else if(math_re == ave){
			System.out.println("평균 입니다.");
		}
		else {
			System.out.println("평균 이하입니다.");
		}
		
		
		
			 
		
		
		scan.close();
	}
}
