import java.util.Scanner;

public class boj_15873 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1010) {
			System.out.println(20);
		}
		else if( (num/10 >=10) && (num % 10 != 0) ) {//101 102, ... , 109
			System.out.println(10 + num%10);
		}
		else if( (num/10 >=10) && (num % 10 == 0) ) {//110 210, ... , 910
			System.out.println(num/100 + 10);
		}
		else {
			System.out.println(num/10 + num%10);
		}
		
	}
}
