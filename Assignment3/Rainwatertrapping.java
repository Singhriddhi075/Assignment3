package Assignment3;

import java.util.Scanner;

public class Rainwatertrapping {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int[] leftmax = new int[arr.length];
		leftmax[0] = arr[0];

		for (int i = 1; i < leftmax.length; i++) {
			leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
		}

		int[] rightmax = new int[arr.length];
		rightmax[rightmax.length - 1] = arr[arr.length - 1];

		for (int i = rightmax.length - 2; i >= 0; i--) {
			rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
		}

		int sum = 0;
		for (int b = 0; b < arr.length; b++) {
			int pbc = Math.min(leftmax[b], rightmax[b]) - arr[b];
			sum += pbc;
		}

		System.out.println(sum);

	}

}
