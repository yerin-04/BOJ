import java.util.Scanner;
import java.util.ArrayList;

public class boj_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		
		for(int i = m; i <= n; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					cnt += 1;
			}
			if(cnt == 0 && i != 1) {
				prime.add(i);
			}
			cnt = 0;
		}
		
		for(int num : prime)
			sum += num;
		/* 확장 for문
		 * for(타입 변수명 : 배열 또는 컬렉션)
		 * 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀져 변수에 저장됨
		 */
		if(sum == 0)
			System.out.println(-1);
		
		else {
			System.out.println(sum);
			System.out.println(prime.get(0));
		}
	}

}
