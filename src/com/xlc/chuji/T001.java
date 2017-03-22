package com.xlc.chuji;

import java.util.Scanner;

public class T001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strs = sc.nextLine().split(" ");
		System.out.println(strs[strs.length-1].length());
	}
}