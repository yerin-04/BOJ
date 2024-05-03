import java.util.Scanner;

public class boj_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n+1]; //바구니 배열 선언
		
		for( int p = 1; p <= n; p++ ) //바구니 n개
			arr[p] = p;

		for( int k = 0; k < m; k++ ) {
			int start = sc.nextInt();
			int stop = sc.nextInt();
			
			for( int i = start; i <= stop; i++ ) {
				int nn = stop--;
				
				int tmp = arr[i];
				arr[i] = arr[nn];
				arr[nn] = tmp;
			}
		}
		for( int i = 1; i <= n; i++ )
			System.out.print(arr[i] + " ");
	}
}
