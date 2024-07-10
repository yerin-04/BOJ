import java.util.Scanner;

public class boj_11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i <= n; i++) { //for문 안에 while문 넣어 소인수분해 구현
			while(n % i == 0) {
				System.out.println(i);
				n /= i;
			}
		}
	}
}
