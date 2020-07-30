package ex0730;

import java.util.Scanner;

public class Quiz1_Selectsort_CalRank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt;
		
		String name[];
		int score[];
		int rank[];
		
		do {
			System.out.print("인원 수 ? ");
			cnt = sc.nextInt();
		}while(cnt<1);
		
		//동적으로 배열의 크기 입력
		name = new String[cnt];
		score = new int[cnt];
		rank = new int[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			System.out.print((i+1)+"번째 이름 ?");
			name[i] = sc.next();
			System.out.print("점수 ?");
			score[i] = sc.nextInt();
			
			rank[i]=1;
		}
		
		//석차 계산 
		for(int i = 0; i < cnt-1; i++)
		{
			for(int j = i+1; j<cnt; j++) {
				if(score[i]<score[j])rank[i]++;
				else if(score[i]>score[j])rank[j]++;
			}
		}
		
		
		System.out.println("\n이름\t점수\t석차");
		for(int i = 0; i<cnt; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			System.out.println(rank[i] + "\t");
		}
		
		sc.close();
	}
}
