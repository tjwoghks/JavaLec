package www.jca.com.june11;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MethodPractice1 {
	public int sumTo(int input) {
		int result=0;
		for(int i=0; i<=input; i++) {
			result+= i;
		}
		return result;
	}

	public static void main(String[] args) {
		MethodPractice1 p= new MethodPractice1();

		Scanner scanner=new Scanner(System.in);
		int num =scanner.nextInt();
		int result = p.sumTo(num);

		System.out.println("rseult="+result);
		scanner.close();

	}

}
