import java.util.Arrays;
import java.util.Scanner;

public class boj_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int[] result = new int[4];
		
		for(int i = 0; i < 4; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			
			total -= out;
			total += in;
			result[i] = total;
		}
		
		Arrays.sort(result);
		
		System.out.println(result[3]);
	}

}
