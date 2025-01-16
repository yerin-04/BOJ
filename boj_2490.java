import java.util.Scanner;

public class boj_2490 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		for(int k = 0; k < 3; k++) {
			int[] arr = new int[4];
			int cnt = 0;
			
			for(int i = 0; i < 4; i++) {
				arr[i] = sc.nextInt();
			}
			for(int j = 0; j < 4; j++) {
				if(arr[j] == 0)
					cnt += 1;
			}
			if(cnt == 1)
				System.out.println("A");
			else if(cnt == 2)
				System.out.println("B");
			else if(cnt == 3)
				System.out.println("C");
			else if(cnt == 4)
				System.out.println("D");
			else
				System.out.println("E");
		}
	}
}
