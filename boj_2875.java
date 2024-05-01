import java.util.Scanner;

public class boj_2875 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		
		int teams = Math.min(n/2, m);
		while(true){
			if ( n + m - (3 * teams) >= k )
				break;
			teams -= 1;
		}
		System.out.println(teams);
	}
}
