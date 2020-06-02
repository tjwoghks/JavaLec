package www.jca.com.June2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sumup {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터n까지의 합을구합니다.");

		int n= -1;
		while(n!=0) {
			System.out.println("n을입력해주세요:");
			n=stdIn.nextInt();
			int sum=0;
			for(int i=1; i<n; i++) {
				System.out.print(i+"+");
				sum+=i;
			}
			System.out.print(n+" = ");
			sum +=n;
			System.out.println(sum);
		}
		stdIn.close();
	}

}
