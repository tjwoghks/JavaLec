package www.jca.com.June2;

import javax.swing.JOptionPane;

public class Sosu {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("값입력");
		int result = Integer.parseInt(input);
		int num =result-1;
		boolean isSosu = true;

		while(num>2) {
			if(result%num==0) {
				isSosu =false ;
				break;
			}
			num=num-1;
		}

		if(isSosu==true) {System.out.println("소수입니다");
		}else {
			System.out.println("소수가아닙니다");
		}
	}

}
