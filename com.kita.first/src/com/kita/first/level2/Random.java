package com.kita.first.level2;

public class Random {
public static void main(String[] args) {//10 <=  < 90
	double n = Math.random(); // 0~0.999...사이의 난수를 하나 발생
	System.out.println("n :"+n);
	
	int n2 = (int)(Math.random()*80 + 10);   
	System.out.println("n2 :"+n2);
	
	int n3 = (int)(Math.random()*5 + 1); // 1에서 5
	System.out.println("n3 :"+n3);
	
	int n4 = (int)(Math.random()*12 + 2); // 2에서 13
	System.out.println("n4 :"+n4);
	
	int n5 = (int)(Math.random()*35 + 17); // 17에서 51
	System.out.println("n5 :"+n5);
	
	int max = 51;
	int min = 17;
	int rNum = (int)(Math.random()*(max-min+1) + min);
}
}
