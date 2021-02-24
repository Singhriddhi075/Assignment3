package Assignment3.Array;

import java.util.Scanner;

public class Insertion {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		insertionsort(arr);
		display(arr);

	}

	public static void insertionsort(int[] arr) {
		int pass = 0;
		int comp = 0;
		for (int count = 1; count <= arr.length - 1; count++) {
			int val = arr[count];
			int item = arr[count];
			int j = count - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
				comp++;
			}
			arr[j + 1] = val;
			pass++;
		}

	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + ",");
		}
	}

}
