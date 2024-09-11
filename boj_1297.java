import java.util.Scanner;

public class boj_1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		double diagnol = Math.sqrt((h*h + w*w));
		double i = d / diagnol;
		System.out.println((int)(h*i) + " " + (int)(w*i));
	}
}
