package www.jca.com.june11;

import java.util.Arrays;
import java.util.Scanner;

public class Mathodpractice2 {

	public int[] evenArr(int input) {
		int[] result = new int[input/2];
		for(int i=1, j=0; i<=input; i++) {
			if(i % 2 == 0) {
				result[j++] = i;}
		}
		return result; 
	}
	public static void main(String[] args) {
		Mathodpractice2 p = new Mathodpractice2();

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int num = scanner.nextInt();
		int[] result = p.evenArr(num);
		System.out.println(Arrays.toString(result));
		scanner.close();
		System.out.println(p.sumof(result));
	}
	public int sumof(int[] input) {
		int result =0; 
		for(int item: input) {
			result += item;
		}
		return result;
	}

}
