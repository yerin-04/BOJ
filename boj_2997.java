import java.util.Scanner;
import java.util.Arrays;

public class boj_2997 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3]; //배열크기 3으로 지정
		/*
		 * 배열 크기 3보다 크게 지정하면 Array.sort(arr); 이후 오류 발생
		 * ex) int[] arr = new int[4]; -> Arrays.sort(arr); 이후 arr[0] = 0으로 적용되는 오류 발생
		 */
		
		for(int i = 0; i < 3; i++) 
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < 3; i++) 
			System.out.println("arr[" + i + "] = " + arr[i]);
		
		Arrays.sort(arr);
		
		for(int i = 0; i < 3; i++) 
			System.out.println("arr[" + i + "] = " + arr[i]);
		
		int n = arr[1] - arr[0];
		int n2 = arr[2] - arr[1];
		
		if(n == n2)
			System.out.println(arr[2] + n);
		else if(n < n2)
			System.out.println(arr[1] + n);
		else
			System.out.println(arr[0] + n2);

	}
}
