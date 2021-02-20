package com.kita.first.level2.pratice;

public class Practice14 {
public static void main(String[] args) {
	int[][] arr = {
			{67,49,87},//국어
			{89,92,56},//수학
			{76,39,98} //영어
	};
	
	int total[] = new int[3];
	double ave[] = new double[3];
	String[] clsarr = {"국어","수학","영어"};
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			total[i] += arr[i][j];
		}
	}
	for (int i = 0; i < ave.length; i++) {
		ave[i] = (double)total[i]/ave.length;
	}
	for (int i = 0; i < clsarr.length; i++) {
		System.out.printf("%s합계:%d, 평균: %.1f\n",clsarr[i],total[i],ave[i]);
	}
	double total_all=0;
	double total_ave=0;
	for (int i = 0; i < clsarr.length; i++) {
		total_all += total[i];
		total_ave += ave[i];
	}
	System.out.printf("전체합계:%d, 전체평균: %.1f\n",(int)total_all,total_ave/clsarr.length);
	
}
}







