package www.jca.com.May28;

import javax.swing.JOptionPane;

public class Sum1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
		int sum  = 0;
		for(int i=0; i<=result;i++) {
			sum+=i;
			System.out.println("sum:"+sum);
		}
		System.out.println("sum:"+sum);

	}
	

}
