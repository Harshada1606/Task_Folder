package Capgemini;

import java.util.Scanner;

public class Example1 {
	public static void main (String [] args){
		Scanner sc=new Scanner(System.in);
		int idealSpeed=sc.nextInt();
		int actualSpeed=sc.nextInt();
		int distance=sc.nextInt();
		int i=distance/(idealSpeed+actualSpeed);
		System.out.println(+i);
		
	}

}
