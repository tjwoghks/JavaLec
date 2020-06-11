package www.jca.com.june11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathodPractice3 {
	public int[] makeRandom(int input) {
		int[]arr =new int[input];
		Random rand=new  Random();
		for(int i=0; i<input; i++) {
			arr[i] =rand.nextInt(input)+1;
		}
				return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathodPractice3  m= new MathodPractice3 ();
    
    Scanner scanner=new Scanner(System.in);
    System.out.println("숫자");
    int num =scanner.nextInt();
    
    int[]array=m.makeRandom(num);
    System.out.println(Arrays.toString(array));
    scanner.close();
	}

}
