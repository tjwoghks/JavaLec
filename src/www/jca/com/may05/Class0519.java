package www.jca.com.may05;

import javax.swing.JOptionPane;

public class Class0519 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("숫자 A");
		String input2 = JOptionPane.showInputDialog("숫자 B");
		int result = Integer.parseInt(input);
		int result2 = Integer.parseInt(input2);
		System.out.println("숫자A"+"숫자B"+result+result2);
		
		String input3 = JOptionPane.showInputDialog("실수입력");
		double result3 =Double.parseDouble(input);
		System.out.println("실수입력"+result);
	}

}
