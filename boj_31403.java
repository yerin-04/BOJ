import java.util.Scanner;

public class boj_31403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a + b - c);
		
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);
		String plusStr = strA + strB;
		int result = Integer.parseInt(plusStr);
		
		System.out.println(result-c);
	}

}
