package Capgemini;

import java.util.Scanner;

public class EvenRepeatCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,k,count=0,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = in.nextInt();
		if(n < 0) {
		System.out.print("Invalid array size: ");
		System.exit(0);
		}else {
		int a[]=new int[100];
		System.out.println("Enter the element of array: ");
		for(i = 0; i< n; i++) {
	a[i] = in.nextInt();
	
	if(a[i] < 0) {
	System.out.print("Invalid input");
		System.exit(0);
		}
	}
	for(i=0;i<n;i++){
		count=1;
		for(j=i+1;j<n;){
		if(a[i] == a[j]){
		count++;
	for(k=j;k<n;k++){
		a [k] = a [k+1];
		}
	n--;
	}
	else
		j++;
			}
		if(count!=1 && a[i]%2==0)
			sum=sum+1;
			}
		System.out.print("Even repeat number is: "+sum);
		}
		}
}
	
	
	
	
	