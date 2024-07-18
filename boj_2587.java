import java.util.Scanner;
import java.util.Arrays;

public class boj_2587 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		
		Arrays.sort(arr); //오름차순 정렬
		
		System.out.println(sum / 5);
		System.out.println(arr[2]);
	}
}
