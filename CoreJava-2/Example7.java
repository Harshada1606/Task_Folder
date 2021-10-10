package Capgemini;

import java.util.Scanner;

public class Example7 {

	 static int twinArrays(int[] ar1, int[] ar2){
	       
	        int minAr1 = ar1[0];
	        int minAr2;
	        int index = 0;
	        for(int i =0; i<ar1.length;i++) {
	            if(ar1[i]<minAr1) {
	                minAr1 = ar1[i];
	                index = i;
	            }
	        }
	        if(index == 0) {
	            minAr2 = ar2[1];
	        }else {
	            minAr2 =ar2[0];
	        }

	        for(int j=0;j<ar2.length;j++) {
	            if(j!=index && minAr2>ar2[j]) {
	                minAr2 =ar2[j];
	            }
	        }
	        return minAr1+minAr2;
	     }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        if(n>=2 && n<=1000000) {
	        int[] ar1 = new int[n];
	        for(int ar1_i = 0; ar1_i < n; ar1_i++){
	            int temp1 = in.nextInt();
	            if(temp1>=1&&temp1<=1000000) {
	                ar1[ar1_i] = temp1;
	            }
	        }
	        int[] ar2 = new int[n];
	        for(int ar2_i = 0; ar2_i < n; ar2_i++){
	            int temp2 = in.nextInt();
	            if(temp2>=1&&temp2<=1000000) {
	                ar2[ar2_i] = temp2;
	            }
	        }
	        int result = twinArrays(ar1, ar2);
	        System.out.println(result);
	        }

	}

}
