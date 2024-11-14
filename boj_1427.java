import java.util.Arrays;
import java.util.Scanner;

public class boj_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int length = (int)(Math.log10(n)+1); //길이 구하기
		
		int[] arr = new int[length];
		
		for(int i = 0; i < length; i++) {
			arr[i] = n % 10;	
			n = n / 10;	
		}
		
		Arrays.sort(arr);
		
		for(int i = length-1; i >= 0; i--) { //내림차순 정렬 필요X -> 오름차순 정렬 후 거꾸로 출력하기
			System.out.print(arr[i]);
		}
	}
}
