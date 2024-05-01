import java.util.Scanner;

public class boj_2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int answer1 = 0;
		int answer2 = 0;
		
		while(num1 != 0) {
			answer1 = answer1 * 10 + num1 % 10;
			num1 /= 10;
		}
		while(num2 != 0){
			answer2 = answer2 * 10 + num2 % 10;
			num2 /= 10;
		}
		if(answer1 > answer2) {
			System.out.println(answer1);
		}
		else {
			System.out.println(answer2);
		}			
	}
}
