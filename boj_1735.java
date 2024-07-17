import java.util.Scanner;
import java.util.ArrayList;

public class boj_1735 {
	
	//최대공약수를 구하는 함수 gcd
	public static int gcd(int a, int b) {
		while(b!=0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(); int den1 = sc.nextInt();
		int num2 = sc.nextInt(); int den2 = sc.nextInt();
		
		int num = num1*den2 + num2*den1;
		int den = den1*den2;
		
		int gcdValue = gcd(num, den);
		
		//최대공약수로 나눠서 기약분수 만들기
		num /= gcdValue;
		den /= gcdValue;
		
		System.out.println(num + " " + den);
	}
}
