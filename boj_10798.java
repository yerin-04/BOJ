import java.util.Scanner;

public class boj_10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][15];
		//초기에는 모든 요소가 '\0'으로 초기화됨
		
		for(int i = 0; i < 5; i++) {
			String str = sc.next();
			
			for(int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 5; j++) {
				if (arr[j][i] == ' ' || arr[j][i] == '\0') {
					continue;
				}
				System.out.print(arr[j][i]);
			}
		}
	}
}
