import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class boj_1934 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int result;
		
		for( int i = 0; i < t; i++ ) {
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			String arr[] = {};
			List<String> list = new ArrayList<>(Arrays.asList(arr));
		 
			for( int j = 0; j <= a; j++) {
				if( a % i == 0 ) {
					list.add(Integer.toString(i));
				}
			}
			for( int k = 0; k <= b; k++ ) {
				if( b % list.get(k) == 0 ) {
					result = list.get(k);
				}
			}
			System.out.println(result);
		}
	}
}
