package www.jca.com.june04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CoLumnchart {
	public static void main(String[] args) {
		Random rand =new Random();
		Scanner stdIn =new Scanner(System.in);



		System.out.println("몇 개 ?");
		int n= stdIn.nextInt();
		int[]a = new int[n];


		for(int i=0; i<n; i++) {
			a[i]=rand.nextInt(n) + 1;
		}
		System.out.println(Arrays.toString(a));

	for(int i=n; i>0;     i--) {
			for(int j=0; j<n;  j++) {
				if(a[j]>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		stdIn.close();
	}

}
