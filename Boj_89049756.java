import java.util.Scanner;

public class Boj_89049756 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
        int[] arr = new int[6];
    
	    for (int i = 0; i < 6; i++) {
	        arr[i] = sc.nextInt();
    	}
    	//예제에서 입력받는 순서대로 작성하기
        int t = sc.nextInt();
	    int p = sc.nextInt();
	    
        int cnt = 0;
		for (int i = 0; i < 6; i++) {
		    cnt += arr[i]/t;
		    if (arr[i]%t != 0) {
		        cnt ++;
		    }
		}  
		System.out.println(cnt);
		System.out.println(n/p + " " + n%p);
		sc.close();
	}
}