package Capgemini;

import java.util.Scanner;

public class Example6 {

	
	static int birthdayCakeCandles(int[][] a) {
		int maxCandleHeight = Integer.MIN_VALUE;
		int maxCandleFreqCount = 0;
		for (int i = 0; i < a.length; i++) {
		for(int j=0;j< a.length;j++){
			if (a[i][j] == maxCandleHeight) {
				maxCandleFreqCount++;
			}
			if (a[i][j] > maxCandleHeight) {
				maxCandleHeight = a[i][j];
				maxCandleFreqCount = 1;
			}
		}
		
	}
		return maxCandleFreqCount;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int[][] a = new int[M][M];
		for (int i = 0; i < M; i++) {
			for(int j=0; j < M;j++)
			a[i][j] = sc.nextInt();
		}
		System.out.println(birthdayCakeCandles(a));
		sc.close();
	}

}
