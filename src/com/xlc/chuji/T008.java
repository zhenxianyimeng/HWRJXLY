package com.xlc.chuji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] key = sc.next().toUpperCase().toCharArray();
		char[] data = sc.next().toCharArray();
		List<Character> list = new ArrayList<>();
		for(char ch : key)
			if(!list.contains(key)){
				list.add(ch);
			}
		for(char ch='A'; ch<='Z'; ch++){
			if(!list.contains(ch))
				list.add(ch);
		}
	//	list.stream().forEach(System.out::print);
		StringBuilder sb = new StringBuilder();
		for(char ch : data){
			if(ch>='A' && ch<='Z'){
				sb.append(list.get(ch-'A'));
			}else if(ch>='a' && ch<='z'){
				sb.append(Character.toLowerCase(list.get(ch-'a')));
			}
		}
		System.out.println(sb.toString());
	}
}
