package www.jca.com;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;

		// 반복문 
		for(n=1; n<=10; n=n+1) {//n=1 부터 n이 10보다 작거나 같을동안 반복하고; 반복할때마다 n을1만큼 증가시켜라.
			sum=sum+n;
			System.out.println("total:"+sum);
		}
		System.out.println("--total--"+sum);
	}

}
