import java.util.Arrays;
import java.util.Scanner;

public class boj_9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrx = new int[n];
		int[] arry = new int[n];
		
		for(int i = 0; i < n; i++) {//좌표 입력 받고 배열에 저장하기
			int x = sc.nextInt();
			int y = sc.nextInt();
			arrx[i] = x;
			arry[i] = y;
		}
		
		Arrays.sort(arrx);
		int minx = arrx[0];
		int maxx = arrx[arrx.length - 1];
		int width = maxx - minx;
		
		Arrays.sort(arry);
		int miny = arry[0];
		int maxy = arry[arry.length - 1];
		int height = maxy - miny;
		
		System.out.println(width * height);
	}
}
