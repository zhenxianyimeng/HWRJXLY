package com.xlc.chuji;

import java.util.Arrays;
import java.util.Scanner;

public class T003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] chs = sc.nextLine().toCharArray();
		Arrays.sort(chs);
		//System.out.println(chs.toString());
		for(char ch : chs)
			System.out.print(ch);
		System.out.println();
	}
}	
