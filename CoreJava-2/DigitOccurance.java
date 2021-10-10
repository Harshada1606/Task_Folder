package Capgemini;

import java.util.Scanner;

public class DigitOccurance {

	public static void main(String[] args) {
		int n, x, count = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = s.nextInt();
        System.out.print("Digit occurance: ");
        x=s.nextInt();
        while(n>0)
        {
        if(n%10==x)
        	count++;
        	n=n/10;
        
    }
        System.out.println("Count is: "+count);
}}