import java.util.Scanner;

public class boj_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num;
		
		//c * num > a + (b * num)
		num = a / (c-b) + 1;
		//a / (c-b) + 1 이 음수일 때 이익 발생X
		if(c <= b) {
			num = -1;
		}
		System.out.println(num);
	}
}
