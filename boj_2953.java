import java.util.Scanner;

public class boj_2953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int[] sum = new int[5];
		
		for (int i = 0; i < 5; i++) { //다섯 참가자에게 점수 받기
			int total = 0;
			for (int j = 0; j < 4; j++) { //각 참가자가 얻은 네 개의 평가 점수
				arr[j] = sc.nextInt();
				total += arr[j];
			}
			sum[i] = total; //각 참가가 얻은 네 개의 평가 점수의 합
		}
		
		int max = sum[0];
		int maxIndex = 0;
		for (int i = 0; i < sum.length; i++) {
			if (sum[i] > max) {
				max = sum[i];
				maxIndex = i;
			}
		}
		System.out.print(maxIndex+1);
		System.out.println(" " + max);
	}

}
