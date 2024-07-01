import java.util.Scanner;

public class boj_2765 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		while(true) {
			double distance = 0;
			double mph = 0;
			
			double d = sc.nextDouble();
			int turn = sc.nextInt();
			double h = sc.nextDouble();
			
			if(turn == 0)
				break;
			
			distance = (d * 3.1415927 * turn) / (12 * 5280);
			mph = distance * 3600 / h;
			
			System.out.println("Trip #" + num + ": " + String.format("%.2f", distance) +
                    " " + String.format("%.2f", mph));
            num++;
		}
		
		
	}
}
