package com.xlc.chuji;

import java.util.Scanner;

public class T010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chs = sc.nextLine().toCharArray();
		int num = 0;
		int other = 0;
		int space = 0;
		int chNum = 0;
		for(char ch : chs){
			if((ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z'))
				chNum++;
			else if(ch>='0'&&ch<='9')
				num++;
			else if(ch==' ')
				space++;
			else
				other++;
		}
		System.out.println(chNum);
		System.out.println(space);
		System.out.println(num);
		System.out.println(other);
		
		sc.close();
	}
}
