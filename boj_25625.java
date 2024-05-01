import java.util.Scanner;

public class boj_25625 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if( x > y ) {
			System.out.println(x+y);
		}
		else {
			System.out.println(y-x);
		}
	}
}
