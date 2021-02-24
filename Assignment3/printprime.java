package Assignment3;

import java.util.Scanner;

public class printprime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=2;i<=n;i++) {
			int fact=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0){
					fact++;
				}
			}
			if(fact==0) {
				System.out.println(i+" ");
			}
		}
	
	
		

	}
	
}
