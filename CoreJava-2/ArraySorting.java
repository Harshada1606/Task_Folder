package Capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,k,count=0,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = in.nextInt();
		if(n < 0) {
		System.out.print("Invalid array size: ");
	
		}else {
		int a[]=new int[n];
		System.out.println("Enter the element of array: ");
		for(i = 0; i< n; i++) {
	a[i] = in.nextInt();
	
	if(a[i] < 0) {
	System.out.print("Invalid input");

		}
	}
		 for (int num: a) {
	          System.out.print(num + " ");
	        }
	        Arrays.sort(a);
	        System.out.println("\nThe sorted array is: ");
	        for (int num: a) {
	          System.out.print(num + " ");
	        }
		}}}


