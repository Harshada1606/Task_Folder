package Capgemini;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int i = 1,rem;
		while(num!=0){
			System.out.println(num!=0);
			rem=num%10;
			i=i*10+rem;
			num=num/10;
		for (int j=rem+1;j<=9;j++){
			count++;
			
		}
		}
		 System.out.println(count);
	}

}
