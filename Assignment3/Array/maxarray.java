package Assignment3.Array;

import java.util.Scanner;

public class maxarray {
     static Scanner scn=new Scanner(System.in);
     
	public static void main(String[] args) {
	  int n=scn.nextInt();
		int[] a=takeinput();
		
		int[] arr=new int[n];
//		display(a);
		System.out.println(maxArray(a));
//		Bubblesort(arr);
	}
	
	public static int[] takeinput() {
		
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
		
	
		public static int maxArray(int[] arr) {
			int max=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
		

	}
		public static void Bubblesort(int[]arr){
			for(int counter=0;counter<arr.length-1;counter++) {
				int min=counter;
				for(int j=counter+1;j<=arr.length-1;j++) {
					if(arr[j]<arr[min])
					min=j;
						
				}
				int temp=arr[min];
				arr[min]=arr[counter];
				arr[counter]=temp;
			}
		}
	
}

