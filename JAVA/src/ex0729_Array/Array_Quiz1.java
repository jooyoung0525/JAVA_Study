package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int[] score = new int[5];
		int tot,ave;
		
		tot = 0;
		for(int i = 0; i<name.length; i++)
		{
			System.out.print((i+1)+"��° �̸� ? ");
			name[i] = sc.nextLine(); //���� ����ؼ� �Է¹ޱ�
			
			System.out.print("     ���� ? ");
			score[i] = sc.nextInt();
			sc.nextLine(); //�������
			
			tot+=score[i];
		}
		
		ave = tot/score.length;
		
		int s;
		System.out.println("\n�̸�\t����\t����");
		System.out.println("---------------");
		for(int i = 0; i<name.length; i++) {
			s = score[i]-ave;
			System.out.println(name[i]+"\t"+score[i]+"\t"+s);
		}
		System.out.println("---------------");
		System.out.println("���� : "+tot);
		System.out.println("---------------");
		System.out.println("��� : "+ave);
		System.out.println("---------------");
		sc.close();
	}
}
