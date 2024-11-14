import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int length = (int)(Math.log10(n)+1); //길이 구하기
		
		Integer[] arr = new Integer[length];
		
		for(int i = 0; i < length; i++) {
			arr[i] = n % 10;	
			n = n / 10;	
		}
		
		Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬
		/* 배열 내림차순 : int에서는 Collections.reverseOrder() 사용 불가
		 * 				-> Integer로 변수 선언해야함
		 */
		// 오름차순 정렬 : Arrays.sort(arr);
		
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i]);
		}
	}
}
