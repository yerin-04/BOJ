import java.util.Scanner;
public class boj_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] str = new String[t]; //문자열 배열 

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		for (int i = 0; i < str.length; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == 'O') { 
					cnt += 1;
				}
				else
					cnt = 0;
				sum += cnt;
			}
			System.out.println(sum);
		}
		
	}

}
