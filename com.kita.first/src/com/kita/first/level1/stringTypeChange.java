package com.kita.first.level1;

public class stringTypeChange {
	public static void main(String[] args)
	{
		int num = 3;
		String str = "안녕";
		
		String result1 = num +str;
		System.out.println(result1);
		
		String str2 = "123";
		
		//int result2 = (int)str2;
		int result2 = Integer.parseInt(str2);
		String str3 = "2.3";
		double result3 = Double.parseDouble(str3);
		
		System.out.println(result2);
		System.out.println(result3);
	}

}
