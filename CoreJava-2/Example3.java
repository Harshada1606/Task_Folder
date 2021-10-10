package Capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();

    	//Lets take two numbers 55 and 121 and find their GCD
        int  gcd = 1;

        /* loop is running from 1 to the smallest of both numbers
         * In this example the loop will run from 1 to 55 because 55
         * is the smaller number. All the numbers from 1 to 55 will be 
         * checked. A number that perfectly divides both numbers would
         * be stored in variable "gcd". By doing this, at the end, the 
         * variable gcd will have the largest number that divides both
         * numbers without remainder.
         */
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }

}