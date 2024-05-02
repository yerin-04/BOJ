import java.util.Scanner;

public class boj_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int tmp;
		
		int[] arr = new int[n+1];
		
		for( int p = 1; p <= n; p++ ) 
			arr[p] = p;
		
		for( int k = 0; k < m; k++ ) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		for( int q = 1; q <= n; q++ ) {
			System.out.print(arr[q]+" ");
		}
	}
}
