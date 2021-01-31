package com.kita.first.level1;

public class Equals {
	public static void main(String [] args)
	{
		int n1 = 2;
		int n2 = 3;
		int n3 = 3;
		
		boolean result = (n1 == n2);
		System.out.println("result값은 :" + result);
		
		boolean result2  = (n1 != n2);
		System.out.println("result2값은 :" + result2);
		
		boolean result3 = ((n1 != n2) || (n2 == n3));
		System.out.println("result3값은 :" + result3);
		
		String str1 = "안녕"; // &123  안녕
		String str2 = "안녕"; // &123
		String str3 = new String("안녕"); //&135
		String str4 = new String("안녕");
		
		if (str1 == str2)
		{
			System.out.println("str1과 str2의 값이 같습니다.");
		}
		else
		{
			System.out.println("str1과 str2의 값이 같지 않습니다.");
		}
		
		
		boolean result4 = (str1 == str2);
		System.out.println("result4값은 :" + result4);
		boolean result5 = (str1 == str3);
		System.out.println("result5값은 :" + result5);
		
		boolean result6 = (str2.equals(str3));
		System.out.println("result6값은 :" + result6);
		
		boolean result7 = (str3==str4);
		System.out.println("result7값은 :" + result7);
		
		
		
	}

}
