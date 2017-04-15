package com.xlc.chuji;

import java.util.Scanner;

public class T007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int k=0;
		for(int i=0; i<N; i++){
			int t = i;
			for(int j=0; j<=i;j++){
				arr[t--][j] = ++k;
			}
		}
		for(int i=0; i<N; i++){
			for(int j=0; j<N; j++){
				if(arr[i][j] != 0){
					if(j==0)
						System.out.print(arr[i][j]);
					else
						System.out.print(" "+arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
