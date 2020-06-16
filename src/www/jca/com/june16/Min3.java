package www.jca.com.june16;

import java.util.Scanner;

import www.jca.com.Storage;

public class Min3 {
	public int min(int a, int b, int c) {
		int min =a;
		if(b<min) {
			min =b;}
			if(c<min) {
				min =c;
			}
			return min;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc =new Scanner (System.in);
			System.out.println("정수 a:");
			int a=sc.nextInt();
			System.out.println("정수 b:");
			int b=sc.nextInt();
			System.out.println("정수 c:");
			int c=sc.nextInt();
			Min3 mm=new Min3();
			int minNum=mm.min(a, b, c);
			System.out.println("최솟값:"+minNum);
			sc.close();
		}

	}
