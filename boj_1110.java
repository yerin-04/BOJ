import java.util.Scanner;

public class boj_1110 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int n = start;
		int cnt = 0;
		
		while(true) {
			n = (n % 10)*10 + ((n / 10 + n % 10) % 10);
			cnt += 1;
			
			if (n == start)
				break;
		}
		System.out.println(cnt);	
	}
}
