import java.util.Scanner;

public class boj_25494 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a, b, c;
		
		for( int i = 0; i < t; i++ ) {
		    int cnt = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			for (int p = 1; p <= a; p++) {
				for (int j = 1; j <= b; j++) {
					for (int k = 1; k <= c; k++) {
						if (p%j==j%k && j%k==k%p && p%j==k%p) {
							cnt += 1;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}
