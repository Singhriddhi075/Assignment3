package Assignment3.Array;

import java.util.Scanner;

public class kadanesalgo {

	public static void main(String[] args) {
		
		int[] arr= {2,3,-4,-6,1,7,6};
		
		
	    System.out.println(kadanes(arr));

	}
	public static int kadanes(int[] arr) {
		int sum=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
//			max sum which you can obtain when your arr[i] ends
			sum=Math.max(sum+arr[i],arr[i] );
//			you need to find max of all sum
			if(sum>max) {
				max=sum;
			}
		}
		return max;
		
	}

}
