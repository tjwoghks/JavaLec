package www.jca.com.May28;

import javax.swing.JOptionPane;

public class PrintStars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
		for(int i=0; i<result; i++) {
			for(int j=0; j<result; j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
