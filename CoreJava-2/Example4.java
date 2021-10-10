package Capgemini;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 
        int i,j,n,sum=0,sum2=0;

n = sc.nextInt();
//System.out.println("Enter the number of columns:");
//col = sc.nextInt();

int[][] mat = new int[n][n];

    System.out.println("Enter the elements of the matrix") ;
    for(i=0;i<n;i++)
    { 
     for(j=0;j<n;j++)
     { 
         mat[i][j] = sc.nextInt();
         System.out.print(mat[i][j]+"\t");
     }
       System.out.println("");
 }
  

    for(i=0;i<n;i++)
    { 
     for(j=0;j<n;j++)
     { 
//if(i==j) //this condition checks for diagonal
//{
//	int k= mat[i][j];
//sum = sum + k;
//}
    	  if (i == j)
    		  sum += mat[i][j];

          // finding sum of secondary diagonal
          if (i == n - j - 1)
        	  sum2 += mat[i][j];
          
    }
}
    int k=Math.abs(sum-sum2);

    System.out.printf("differance of diagonal  "+k) ;
} 
}