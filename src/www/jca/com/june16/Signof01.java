package www.jca.com.june16;

import java.util.Scanner;

public class Signof01 {
	public int signof(int num) {
		int result =0;

		if(num<0) {
			result =-1;
		}else if(num>0) {
			result=1;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Signof01 signup=new Signof01();
		Scanner sc =new Scanner(System.in);

		System.out.println("정수입력");
		int input = sc.nextInt();
		int signResult =signup.signof(input);
		System.out.println("signResult:"+signResult);
		sc.close();
	}

}
