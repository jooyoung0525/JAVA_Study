package ex0729;

import java.util.Scanner;

public class Array_Quiz5_Calender_pdf4 {
	public static void main(String[] args) {
		
		//��,���� �Է¹޾� �޷�����ϱ�
		//1�� 1�� 1�� : ������
		//366(2�� 29��):�⵵�� 4�ǹ���̰� 100�ǹ�����ƴϰų� 400�ǹ���϶�
		//365(2�� 28��)
		
		Scanner sc = new Scanner(System.in);
		
		
		//1��=> days[0].... 12=>days[11]
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		//String[] weeks = new String[] {"��","��","ȭ","��","��","��","��"};
		
		int y,m;
		int total,w;
		
		do {
			System.out.print("�⵵?");
			y=sc.nextInt();
		}while(y<100);
		
		do {
			System.out.print("��?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//y�⵵�� 2���� ���ϱ���?
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		//1.1.1 ~ y.m.d �ϱ����� ��ü ����
		//1.1.1 ~ 2019.12.31
		//��ü���� = 2019*365 + (2019/4) - (2019/100) + (2019/400);
		
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
	
		for(int i = 0; i<m-1; i++)
			total += days[i];
		
		total+=1; //m��1���� ���ϱ��ϱ�
		w = total%7;
		
		System.out.printf("\t  %d�� %d��\n",y,m);
		System.out.println("=================================");
		System.out.println("    ��     ��     ȭ    ��    ��    ��    ��");
		System.out.println("=================================");
		
		
		for(int i = 0; i<w; i++)
		{
			System.out.print("    ");
		}
		
		for(int i = 1; i<days[m-1]; i++) {
			System.out.printf("%4d",i);
			if(++w%7==0) System.out.println();
		}
		System.out.println();
		
		sc.close();
	}
}
