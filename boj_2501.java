import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class boj_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String arr[] = {}; //배열 선언
		List<String> list = new ArrayList<>(Arrays.asList(arr)); //배열을 List로
		
		for( int i = 1; i <= n; i++ ) {
			if( n % i == 0 ) {
				list.add(Integer.toString(i));
			}
		}
		
		arr = list.toArray(arr);
		
		if( arr.length < k ) {
			System.out.println(0);
		}
		else {
			System.out.println(arr[k-1]);
		}
	}
}
