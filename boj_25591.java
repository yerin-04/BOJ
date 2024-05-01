import java.util.Scanner;

public class boj_25591 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		int a = 100 - num1, b = 100 - num2;
		int c = 100 - (a + b);
		int d = a * b;
		int q = d / 100;
		int r = d % 100;
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+q+" "+r);
		System.out.print(c+q);
		System.out.println(" " + r);
	}
}
 