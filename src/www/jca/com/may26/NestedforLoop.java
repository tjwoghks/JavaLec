package www.jca.com.may26;

public class NestedforLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 1; i<=1; i++) {
			System.out.print(i);
		}
		System.out.println();

		for(int i = 1; i<=2; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1; i<=3; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1; i<=4; i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1; i<=5; i++) {
			System.out.print(i);
		}	
		System.out.println();
	}
}*/
		int i,j;
		for(i=1; i<=5; i++) {
			for(j=1;j<=i; j++)
				System.out.print(j+"   ");
			System.out.println();
		}
	}
}