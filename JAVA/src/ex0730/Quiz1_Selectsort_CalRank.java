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
			System.out.print("�ο� �� ? ");
			cnt = sc.nextInt();
		}while(cnt<1);
		
		//�������� �迭�� ũ�� �Է�
		name = new String[cnt];
		score = new int[cnt];
		rank = new int[cnt];
		
		for(int i = 0; i < cnt; i++)
		{
			System.out.print((i+1)+"��° �̸� ?");
			name[i] = sc.next();
			System.out.print("���� ?");
			score[i] = sc.nextInt();
			
			rank[i]=1;
		}
		
		//���� ��� 
		for(int i = 0; i < cnt-1; i++)
		{
			for(int j = i+1; j<cnt; j++) {
				if(score[i]<score[j])rank[i]++;
				else if(score[i]>score[j])rank[j]++;
			}
		}
		
		
		System.out.println("\n�̸�\t����\t����");
		for(int i = 0; i<cnt; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(score[i] + "\t");
			System.out.println(rank[i] + "\t");
		}
		
		sc.close();
	}
}
