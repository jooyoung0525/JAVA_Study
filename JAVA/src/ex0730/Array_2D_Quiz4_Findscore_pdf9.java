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
		
		String []subject = {"����","����","����"};
		
		do {
			System.out.print("�ο� �� ?");
			cnt = sc.nextInt();
		}while(cnt<1);
		
		//�޸� �Ҵ�
		name = new String[cnt];
		score = new int[cnt][3];
		tot = new int[cnt];
		rank = new int[cnt];
		
		//������ �Է�
		for(int i = 0; i<cnt; i++) {
			System.out.print((i+1)+"��° �̸� ? ");
			name[i]=sc.next();
			
			for(int j = 0; j<subject.length; j++) {
				System.out.print(subject[j]+" ?");
				score[i][j]=sc.nextInt();
				tot[i] += score[i][j];
			}
			rank[i]=1;
		}
		
		//����
		for(int i = 0; i<cnt-1; i++) {
			for(int j = i; j<cnt; j++) {
				if(tot[i]<tot[j])rank[i]++;
				else if(tot[i]>tot[j])rank[j]++;
			}
		}
		
		//���
		System.out.println("\n------------------------------------------------------");
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����\tEX");
		
		
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
				case 10: case 9: grade = "��"; break;
				case 8: grade = "��";break;
				case 7 : grade = "��";break;
				case 6: grade = "��";break;
				default : grade = "��";break;
				}
			}
			System.out.print(grade + "\t");
			System.out.println();
		}
		
		sc.close();
	}
}
