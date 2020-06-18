package www.jca.com.june18;

public class Minofarr {
	public int minof(int[]a) {
		int min =a[0];
		for(int i=1; i<5; i++) {
			if(min>a[i])
				min=a[i];}
		return min;
	}

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=5;arr[1]=7;arr[2]=3;arr[3]=2;arr[4]=6;

		Minofarr ss = new Minofarr();
		int result =ss.minof(arr);
		System.out.println("배열의 최솟값:"+result);

	}

}
