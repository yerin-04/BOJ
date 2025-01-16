import java.util.Scanner;
public class boj_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); //테스트 케이스의 개수
		
		for(int i = 0; i < c; i++) {
			int num = sc.nextInt(); //학생의 수
			int[] arr = new int[num];
			int total = 0; //각 케이스별 점수 총점
			int cnt = 0;
			int avg = 0;
			
			for(int j = 0; j < num; j++) { //각 케이스별 학생 num명의 점수 
				
				arr[j]= sc.nextInt(); //점수 입력
				total += arr[j]; //점수의 합 계산
			}
			
			for(int k = 0; k < num; k++) {
				avg = total / num; //각 케이스별 성적 평균
				if(arr[k] > avg) {
					cnt += 1;
				}
			}
			double percent = ((double)cnt / (double)num) * 100;
			
			String result = String.format("%.3f", percent); //소수점 넷째자리에서 반올림 후 셋째자리까지 표시
			System.out.println(result + "%");
			 
		}

	}

}
