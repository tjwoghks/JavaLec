package www.jca.com.May28;

import javax.swing.JOptionPane;

public class SumWithInputEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
		for(int i=0; i<= result; i++) {
			if(i%2==0)
				sum+=i;
		}System.out.println("1부터"+result+"까지 짝수들의 합은"+sum+"입니다");
	}
	

}