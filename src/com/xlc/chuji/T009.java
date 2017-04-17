package com.xlc.chuji;

import java.util.Scanner;

public class T009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ip1 = sc.next();
		String ip2 = sc.next();
		String[] strs;
		String[] ip1s;
		String[] ip2s;
		boolean isTrue = true;
		try {
			strs = str.split("\\.");
			ip1s = ip1.split("\\.");
			ip2s = ip2.split("\\.");
			for(int i=0; i<4; i++){
				if(!((Integer.parseInt(strs[i])>=0 && Integer.parseInt(strs[i])<=255)
						&& (Integer.parseInt(ip1s[i])>=0 && Integer.parseInt(ip1s[i])<=255)
						&& (Integer.parseInt(ip2s[i])>=0 && Integer.parseInt(ip2s[i])<=255)
						))
					isTrue = false;
			}
			
			if(!isTrue)
				System.out.println(1);
			else {
				int i=0;
				for(i=0; i<4; i++){
					if((Integer.parseInt(ip1s[i])&Integer.parseInt(strs[i])) != 
						(Integer.parseInt(ip2s[i])&Integer.parseInt(strs[i])) )
						break;
				}
				if(i==4)
					System.out.println(0);
				else
					System.out.println(2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(1);
		}
		
	}
}
