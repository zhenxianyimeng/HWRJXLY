package com.xlc.chuji;

import java.util.Scanner;

public class T002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] left = new int[N];
		int[] right = new int[N];
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		left[0] = 1;
		right[N-1] = 1;
		int max;
		for(int i=1; i<N; i++){
			max = 1;
			for(int j=0; j<i; j++){
				if(arr[j] < arr[i])
					max = max > left[j]+1 ? max : left[j]+1;
			}
			left[i] = max;
		}
		
		for(int i=N-2; i>=0; i--){
			max = 1;
			for(int j=N-1; j>i; j--){
				if(arr[j] < arr[i])
					max = max>right[j]+1? max:right[j]+1;
			}
			right[i] = max;
		}
		int mmax = 0;
		for(int i=0; i<N; i++){
			if(left[i] + right[i] -1 >mmax)
				mmax = left[i]+right[i]-1;
		}
		System.out.println(N-mmax);
		sc.close();
	}
}
