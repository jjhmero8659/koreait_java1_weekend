package com.kita.first.level1;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("공백 포함 문자열을 입력하세요 :");
		String line = scan.nextLine();
		
		System.out.println(line);
		
		scan.close();
		
	}

}
