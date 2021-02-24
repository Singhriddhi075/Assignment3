package Assignment3;

import java.util.Scanner;

public class maxarray {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[] array=takeinput();
//	    display(array);
	    System.out.println(MaxInArray(array));	

	}
public static int[] takeinput() {
		
		int n=scn.nextInt();
//		allocate space for array
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
//			System.out.println(i);
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void display(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static int MaxInArray(int[] array) {
//		from minus infinity check
		int max=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		return max;
		}

}
