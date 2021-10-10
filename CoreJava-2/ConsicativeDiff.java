package Capgemini;

import java.util.Scanner;

public class ConsicativeDiff {

	public static void main(String[] args) {
		int d;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n < 0) {
			System.out.print("Invalid array size: ");
			System.exit(0);
			}
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++){
			
			arr[i]=sc.nextInt();}
		for(int i=0;i<n;i++){
			 d=Math.abs(arr[i]-arr[i+1]);
			if(d>=4)
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}

}
