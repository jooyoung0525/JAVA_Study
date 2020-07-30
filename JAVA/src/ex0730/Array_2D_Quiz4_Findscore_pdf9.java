package ex0730;

import java.util.Scanner;

public class Array_2D_Quiz4_Findscore_pdf9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt;
		
		String []name;
		int [][]score;
		int []tot;
		int []rank;
		String grade ="";
		
		String []subject = {"국어","영어","수학"};
		
		do {
			System.out.print("인원 수 ?");
			cnt = sc.nextInt();
		}while(cnt<1);
		
		//메모리 할당
		name = new String[cnt];
		score = new int[cnt][3];
		tot = new int[cnt];
		rank = new int[cnt];
		
		//데이터 입력
		for(int i = 0; i<cnt; i++) {
			System.out.print((i+1)+"번째 이름 ? ");
			name[i]=sc.next();
			
			for(int j = 0; j<subject.length; j++) {
				System.out.print(subject[j]+" ?");
				score[i][j]=sc.nextInt();
				tot[i] += score[i][j];
			}
			rank[i]=1;
		}
		
		//석차
		for(int i = 0; i<cnt-1; i++) {
			for(int j = i; j<cnt; j++) {
				if(tot[i]<tot[j])rank[i]++;
				else if(tot[i]>tot[j])rank[j]++;
			}
		}
		
		//출력
		System.out.println("\n------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차\tEX");
		
		
		for(int i = 0; i<cnt; i++) {
			System.out.print(name[i]+"\t");
			
			for(int j = 0; j<subject.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t");
			System.out.print((tot[i]/score[i].length)+"\t");
			System.out.print(rank[i]+"\t");
			
			//System.out.print("\t");
			for(int j = 0; j<subject.length;j++) {
				switch(score[i][j]/10) {
				case 10: case 9: grade = "수"; break;
				case 8: grade = "우";break;
				case 7 : grade = "미";break;
				case 6: grade = "양";break;
				default : grade = "가";break;
				}
			}
			System.out.print(grade + "\t");
			System.out.println();
		}
		
		sc.close();
	}
}
