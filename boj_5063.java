import java.util.Scanner;

public class boj_5063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for( int i = 0; i < n; i++ ) {
			int r = sc.nextInt(), e = sc.nextInt(), c = sc.nextInt();
		
			if( r > e - c ) {
				System.out.println("do not advertise");
			}
			else if( r == e - c ) {
				System.out.println("does not matter");
			}
			else {
				System.out.println("advertise");
			}
		}
	}
}
