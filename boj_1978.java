import java.util.Scanner;
public class boj_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num;
		int cnt = 0;
		int result = 0;
		
		for(int k = 0; k < n; k++) {
			num = sc.nextInt();
			cnt = 0;
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					cnt +=1;
				}
			}
			if(cnt == 2) {
				result += 1;
			}
			
		}
		System.out.println(result);
	}
}
