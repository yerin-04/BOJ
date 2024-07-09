import java.util.Scanner;

public class boj_9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			int[] arr = new int[100000];
			int j  = 0;
			int sum = 0;
			int cnt = 0;
			
			if ( n == -1 )
				break;
			for ( int i = 1; i < n; i++ ) {//자신은 제외한 약수이므로 i<n
				if ( n % i == 0 ) {
					arr[j] = i;
					sum += i;
					j++;
					cnt++;
				}
			}
			if (sum == n) {
				System.out.print(n + " = ");
				for ( int k = 0; k < cnt-1; k++ ) {	
					System.out.print(arr[k] + " + ");
				}
				System.out.println(arr[cnt-1]);
			}
			else if ( sum != n ) {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}

}
