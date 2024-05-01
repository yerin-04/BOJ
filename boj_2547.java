import java.util.Scanner;
import java.math.BigInteger;

public class boj_2547 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int k = 0; k<t; k++) {
			int num = sc.nextInt();
			BigInteger sum = new BigInteger("0");
		
			for (int i = 0; i < num; i++) {
				sum = sum.add(BigInteger.valueOf(sc.nextLong()));
			}
			if (sum.mod(BigInteger.valueOf(num)).equals(BigInteger.ZERO)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}
