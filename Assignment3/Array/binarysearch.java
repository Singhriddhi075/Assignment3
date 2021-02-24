package Assignment3.Array;

import java.util.Scanner;

public class binarysearch {
    static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		int n=scn.nextInt();
		int[] arr= new int[n];
		System.out.println(Binarysearch(arr,n));

	}
	public static int Binarysearch(int[] arr,int item) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]<item) {
				lo=mid+1;
			}else if(arr[mid]>item) {
				hi=mid-1;
				
			}else {
				return mid;
			}
		}
		return -1;
	}

}
