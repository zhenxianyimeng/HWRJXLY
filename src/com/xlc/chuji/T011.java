package com.xlc.chuji;

import java.util.Scanner;

public class T011 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] weight = new int[N];
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			weight[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++){
			num[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<N; i++){
			sum += weight[i]*num[i];
		}
		boolean[] flags = new boolean[sum+1];
		flags[0] = true;
		for(int i=0; i<N; i++){
			for(int j=0; j<num[i]; j++)
				for(int k=sum; k>=weight[i]; k--){
					if(flags[k-weight[i]])
						flags[k] = true;
				}
		}
		int count = 0;
		for(int i=0; i<sum+1;i++){
			if(flags[i])
				count++;
		}
		System.out.println(count);
		sc.close();
	}
}
