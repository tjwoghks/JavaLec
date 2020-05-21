package www.jca.com.may21;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		String input = JOptionPane.showInputDialog("값입력");
		dat=Integer.parseInt(input);
		if(dat%10==0) {
			System.out.println(dat+"은 10의 배수 입니다");
		}else {
			System.out.println(dat+"은 10의 배수가 아닙니다");
		}
	}

}
