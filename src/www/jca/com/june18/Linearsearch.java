package www.jca.com.june18;

import java.util.Scanner;

public class Linearsearch {
	public int search(int[] arr,int input) {
		int result=-1;
		for(i=0; i)



		return result;
	}
	public static void main(String[] args) {
		int[]array = {8,4,6,10,2,7,5,3,9,1};
		System.out.println("어떤숫자를 찾을까요?");
		Scanner scanner=new Scanner(System.in);
		int input =scanner.nextInt();

		Linearsearch linear=new Linearsearch();
		int where =linear.search(array,input);
		System.out.println(where+"번째에있네요");
		scanner.close();}

}
