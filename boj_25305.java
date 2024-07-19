import java.util.Arrays;
import java.util.Scanner;

public class boj_25305 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] score = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			score[i] = num;
		}
		
		Arrays.sort(score); //오름차순 정렬
		
		System.out.println(score[score.length - k]);
	}
}
