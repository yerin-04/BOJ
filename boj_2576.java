import java.util.Scanner;

public class boj_2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] odd = new int[7];
		int sum = 0;
		int min = 100;
		
		for( int i = 0; i < 7; i++ ) {
			odd[i] = sc.nextInt();
			
			if( odd[i] % 2 == 1 ) {
				sum += odd[i];
				min = Math.min(min, odd[i]);
			}
		}
		
		if( sum == 0 ) {
			System.out.println("-1");
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
