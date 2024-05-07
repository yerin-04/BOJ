import java.util.Scanner;

public class boj_1546
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double arr[] = new double[n];
		double sum = 0;
		double max = 0;
		
		for( int i = 0; i < n; i++ ){
		    arr[i] = sc.nextDouble();
		    if( arr[i] > max )
		        max = arr[i];
		}
		for( int k = 0; k < n; k++ ){
		    arr[k] = arr[k] / max * 100;
		    sum += arr[k];
		}
		System.out.println(sum/n);
	}
}