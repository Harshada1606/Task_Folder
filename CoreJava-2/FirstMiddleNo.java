package Capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMiddleNo {

	public static void main(String[] args) {
//		int i,j;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Size of array ");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(i=0;i<n;i++) 
//		{
//			arr[i]=sc.nextInt();
//			
//		}
//		if(n%2==1 && arr[0]==arr[(n+1)/2-1])
//		{
//			System.out.println("100");
//		}
//		else if(n%2==1 && arr[0]!=arr[(n+1)/2-1])
//		{
//			System.out.println(arr[0]);
//		}
//		
//	   }
//	
//}
		
		
		
		int n, i;
		//int flag=0;
		Scanner in=new Scanner(System.in);
		n = in.nextInt();
		if(n < 0) {
			System.out.print("Invalid array size");
			System.exit(0);
			}
		else if(n%2==0){
			System.out.print("size must be odd");
			}
		else {
			int a[]=new int[n];
			for(i = 0; i< n; i++) {
		a[i] = in.nextInt();
		if(a[i] < 0) {
			//flag=1;
			System.out.print("Invalid input");
			System.exit(0);
			}}//if(flag!=1)//{
			int mid = n / 2;
			if(a[0] == a[mid]) 
		System.out.println("100");
	else System.out.println(a[0]);
	
	}}
		
	}
		