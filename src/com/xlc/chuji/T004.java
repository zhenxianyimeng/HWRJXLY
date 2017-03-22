package com.xlc.chuji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class T004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
			int sum = 0;
			char[] chs = sc.next().toLowerCase().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for(char ch : chs){
				if(!map.containsKey(ch))
					map.put(ch, 1);
				else
					map.put(ch, map.get(ch)+1);
			}
			List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
			Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>() {
						@Override
						public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
							// TODO Auto-generated method stub
							return o2.getValue() - o1.getValue();
						}
			});
			
			int base = 26;
			for(Map.Entry<Character, Integer> entry : list){
				int value = entry.getValue();
				while(value > 0){
					value--;
					sum += base;
				}
				base--;
			}
			System.out.println(sum);
		}
	}
}
