package com.kita.first.level2.pratice;

public class Practice05 {
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		while(true)
		{
			i++;
			sum+=i;
			if(i==100)
				break;
		}
		System.out.printf("합계 : %d",sum);
	}

}
