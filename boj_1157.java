import java.util.Scanner;

public class boj_1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[26];
        
		//str에서 대문자인 경우와 소문자인 경우 구분
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {//대문자일 경우
				arr[str.charAt(i)-'A']++;
			}
			else //소문자일 경우
				arr[str.charAt(i)-'a']++;
		}
		
		int max = -1;
		char ch = '?';
		
		for(int k = 0; k < 26; k++) {
			if(arr[k] > max) {
				max = arr[k];
				ch = (char)(k + 65); //대문자로 출력
				}
			else if(arr[k] == max) //가장 많이 사용된 알파벳이 여러개 존재 하는 경우 판별
				ch = '?';
		}
		System.out.println(ch);
	}
}
