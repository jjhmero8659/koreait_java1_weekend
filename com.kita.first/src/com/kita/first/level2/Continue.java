package com.kita.first.level2;

public class Continue {
	public static void main(String[] args) {
		/*for (int i = 0; i < 9; i++) {
			
			if(i == 5) {
				System.out.println("continue를 만납니다.");
				continue;
			}
			System.out.printf("i는 %d 입니다.\n",i);
		}*/
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==2) {
					break;
				}
				System.out.printf("i: %d, z:%d\n",i,j);
			}
			
		}
	}
	


}
