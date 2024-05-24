import java.util.Scanner;

public class boj_25206 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double scoreSum = 0;
		int result = 0;
		double gradeNum = 0;
		
		for( int i = 0; i < 20; i++ ) {
			String name = sc.next();
			double score = sc.nextDouble();
			String grade = sc.next();
			
			if(grade.equals("A+") || grade.equals("a+")) 
				gradeNum = 4.5;
			if(grade.equals("A0") || grade.equals("a0")) 
				gradeNum = 4.0;
			if(grade.equals("B+") || grade.equals("b+")) 
				gradeNum = 3.5;
			if(grade.equals("B0") || grade.equals("b0")) 
				gradeNum = 3.0;
			if(grade.equals("C+") || grade.equals("c+")) 
				gradeNum = 2.5;
			if(grade.equals("C0") || grade.equals("c0")) 
				gradeNum = 2.0;
			if(grade.equals("D+") || grade.equals("d+")) 
				gradeNum = 1.5;
			if(grade.equals("D0") || grade.equals("d0")) 
				gradeNum = 1.0;
			if(grade.equals("F") || grade.equals("f")) 
				gradeNum = 0.0;
			
			if(!grade.equals("P") && !grade.equals("p")) {
				sum += score * gradeNum;
				scoreSum += score;
			}
		}
		System.out.println(sum / scoreSum);
	}
}
