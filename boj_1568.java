import java.util.Scanner;

public class boj_1568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bird = 1;
		int cnt = 0;
		
		while(n >= 1) {
			if(n < bird)
				bird = 1;
			n -= bird;
			bird++;
			cnt++;
		}
		System.out.println(cnt);
	}

}
