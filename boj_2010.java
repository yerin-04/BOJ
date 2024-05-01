import java.util.Scanner;

public class boj_2010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 1;
		
		int n = sc.nextInt();
		
		for ( int i = 0; i < n; i++) {
			num = sc.nextInt();
			sum += num -1;
		}
		System.out.println(sum);
	}
}
