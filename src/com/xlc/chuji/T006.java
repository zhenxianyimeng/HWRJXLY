package com.xlc.chuji;

import java.util.Scanner;

public class T006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] toCodes = sc.next().toCharArray();
		char[] toDecodes = sc.next().toCharArray();
		for(int i=0; i<toCodes.length; i++){
			char ch = toCodes[i];
			if(ch>='a' && ch<'z'){
				toCodes[i] = (char)(ch-32+1);
			}else if(ch == 'z'){
				toCodes[i] = 'A';
			}else if(ch>='A' && ch<'Z'){
				toCodes[i] = (char)(ch+32+1);
			}else if(ch == 'Z'){
				toCodes[i] = 'a';
			}else{
				toCodes[i] = (char)('0'+(ch-'0'+1)%10);
			}
		}
		for(char i : toCodes)
			System.out.print(i);
		System.out.println();
		for(int i=0; i<toDecodes.length; i++){
			char ch = toDecodes[i];
			if(ch>'a' & ch<='z'){
				toDecodes[i] = (char)(ch-32-1);
			}else if(ch == 'a'){
				toDecodes[i] = 'Z';
			}else if(ch>'A' && ch<='Z')
				toDecodes[i] = (char)(ch+32-1);
			else if(ch == 'A')
				toDecodes[i] = 'z';
			else {
				toDecodes[i] = (char)('0'+(ch - '0'+10-1)%10);
			}
		}
		for(char i: toDecodes)
			System.out.print(i);
		System.out.println();
		
		sc.close();
	}
}
