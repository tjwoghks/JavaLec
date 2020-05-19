package www.jca.com.may05;

import javax.swing.JOptionPane;

public class dd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("정사각형의 한변의 길이를 입력하세요");
		double result =Double.parseDouble(input);
		System.out.println("정사각형의 넓이는"+result*result+"입니다");
	
	}

}
