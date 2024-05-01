import java.util.Scanner;

public class boj_23825 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if ( n / 2 > m / 2 ) {
			System.out.println(m/2);
		}
		else {
			System.out.println(n/2);
		}
	}
}
