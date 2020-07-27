package ex0727;

import java.util.Scanner;

public class For_Quiz10_pdf7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score1, score2, hap,avg,cnt,temp;
		System.out.print("두점수 ? ");
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		
		temp = hap = avg = cnt = 0;
		
		if(score2 < score1)
		{
			temp = score1;
			score1 = score2;
			score2 = temp;
		}
		
		
		for(int i = score1; i<=score2; i++)
		{
			if(i%3 == 0 || i % 5 == 0) {
				hap+=i;
				cnt++;
			}
		}
		
		
		avg = hap/cnt;
		
		System.out.println("합 : "+ hap);
		System.out.println("평균 : "+ avg);
		
		sc.close();
	}
}
