package www.jca.com.May28;

import javax.swing.JOptionPane;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
System.out.println("_____"+input+"단______");
for(int j=1; j<10; j++) {
	System.out.println(j*result);
}
	}

}
