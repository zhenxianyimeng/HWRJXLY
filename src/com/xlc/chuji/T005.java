package com.xlc.chuji;

import java.util.Scanner;


public class T005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		if (N < 7)
			;
		else {

			for (int i = 7; i <= N; i++) {
				if (i % 7 == 0) {
					num++;
					continue;
				}
				int temp = i;
				while(temp>0){
					if(temp % 10 == 7){
						num++;
						temp = -1;
						continue;						
					}
					temp = temp/10;
					
				}
			}
		}
		System.out.println(num);
	}
}
