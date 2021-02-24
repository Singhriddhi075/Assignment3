package Assignment3.Array;

import java.util.Scanner;

public class arraysumtriplet {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
		int target = scn.nextInt();
		int a = 0;
		while (a < arr.length - 2) {
			int b = n - 1;
			int i = a + 1;
			while (i >= a + 1 && b <= arr.length - 1 && i < b) {
				if (arr[a] + arr[i] + arr[b] == target) {
					System.out.println(arr[a] + ", " + arr[i] + " and " + arr[b]);
					i++;
					b--;
				} else if (arr[a] + arr[i] + arr[b] > target) {
					b--;
				} else if (arr[a] + arr[i] + arr[b] < target) {
					i++;
				}
			}
			a++;
		}

	}

}
