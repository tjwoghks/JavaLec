package www.jca.com.May28;

import javax.swing.JOptionPane;

public class PrintStars1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
		for(int i=0; i<result; i++) {
			for(int j=result; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
