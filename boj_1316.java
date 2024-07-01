import java.util.Scanner;

public class boj_1316 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0; 
		int total = 0; //그룹단어의 수
		
		for(int j = 0; j < num; j++) {
			String str = sc.next();
			int[] arr = new int[100];
			int[] alpha = new int[26];
			cnt = 0; //초기화
			
			for(int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);//str을 배열 arr에 저장
				
			}
			for(int k = 0; k <= str.length(); k++) {
				if (arr[k] != arr[k+1]) {
					alpha[arr[k]-97]++;
				}
			}
			
			for(int p = 0; p < 26; p++) {
				if (alpha[p] > 1)
					cnt++;
				//System.out.println("cnt: " + cnt);//
			}
			if (cnt == 0)
				total++;
		}
		System.out.println(total);
	}
}
