import java.util.Scanner;

public class boj_5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'B' || str.charAt(i) == 'C') {
				sum += 3;
			}
			else if(str.charAt(i) == 'D' || str.charAt(i) == 'E' || str.charAt(i) == 'F') {
				sum += 4;
			}
			else if(str.charAt(i) == 'G' || str.charAt(i) == 'H' || str.charAt(i) == 'I') {
				sum += 5;
			}
			else if(str.charAt(i) == 'J' || str.charAt(i) == 'K' || str.charAt(i) == 'L') {
				sum += 6;
			}
			else if(str.charAt(i) == 'M' || str.charAt(i) == 'N' || str.charAt(i) == 'O') {
				sum += 7;
			}
			else if(str.charAt(i) == 'P' || str.charAt(i) == 'Q' || str.charAt(i) == 'R' || str.charAt(i) == 'S') {
				sum += 8;
			}
			else if(str.charAt(i) == 'T' || str.charAt(i) == 'U' || str.charAt(i) == 'V') {
				sum += 9;
			}
			else if(str.charAt(i) == 'W' || str.charAt(i) == 'X' || str.charAt(i) == 'Y' || str.charAt(i) == 'Z') {
				sum += 10;
			}
		}
		System.out.println(sum);
	}
}
