package www.jca.com.may21;

import javax.swing.JOptionPane;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("");
		String input2 = JOptionPane.showInputDialog("");
		int result = Integer.parseInt(input);
		int num = Integer.parseInt(input2);

		System.out.println(result+=num);
		System.out.println(result-=num);
		System.out.println(result*=num);
		System.out.println(result/=num);
		System.out.println(result%=num);
	}

}
