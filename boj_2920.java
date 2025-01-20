import java.util.Scanner;

public class boj_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int j = 10000000;
		int[] arr = new int[8];
		
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
			
			num += arr[i]*j;
			j /= 10;
			
		}
		if (num == 12345678){
			System.out.println("ascending");
		}
		else if (num == 87654321) {
			System.out.println("descending");
		}
		else
			System.out.println("mixed");
		
	}
}
