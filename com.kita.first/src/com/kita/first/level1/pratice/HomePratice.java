package com.kita.first.level1.pratice;

import java.util.Scanner;

public class HomePratice {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 를 입력해주세요 :");
		int num = scan.nextInt();
		String grade = "\0";
		if(num>90) {
			grade = "A";
		}
		else if(num>=80){
			grade = "B";
		}
		else if(num>=70) {
			grade = "C";
			
		}
		else {
			grade = "D";
			System.out.println("D입니다.");
		}
		
		if(!(grade.equals("D"))){
			if((num%10) > 5){
				System.out.printf("%s+입니다.",grade);
			}
			else if((num%10) == 5) {
				System.out.printf("%s입니다.",grade);
			}
			else {
				System.out.printf("%s-입니다.",grade);
			}
		}
		scan.close();

}
	
}
