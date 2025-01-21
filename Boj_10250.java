import java.util.Scanner;

public class Boj_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				int n = sc.nextInt();
		
				System.out.println(100*(((n-1)%h)+1) + (((n-1)/h)+1));
				//(n%h)-> 꼭대기 층의 경우 0이 나옴 => (n-1)%h +1
		}
		
	}

}
