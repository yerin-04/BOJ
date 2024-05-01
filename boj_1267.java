import java.util.Scanner;

public class boj_1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int n;
		int y = 0;
		int m = 0;
		
		for (int i = 0; i < num; i ++) {
			n = sc.nextInt();
			y += ( (n/30) + 1 ) * 10;
			m += ( (n / 60 ) + 1 ) * 15;
		}
		
		if (y == m) {
			System.out.println("Y M " + y);
		}
		else if ( y < m ) {
			System.out.println("Y " + y);
		}
		else {
			System.out.println("M " + m);
		}
	}
}
