package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Scanner;

public class Find_Lastname_Kim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count;
		
		//�̸��� �Է� �޾� �达�� �ο����� count�ϱ�
		//��, �Է¹��� �̸��� end �̸� ����
		
		
		count = 0;
		
		while(true) {
			System.out.print("�̸�?");
			s = sc.next();
			
			if(s.equalsIgnoreCase("end")) break;
			
			/*
			//���1)
			if(s.indexOf("��")==0) //0�̾����!!!!
				count++;
			*/
			
			if(s.startsWith("��"))count++;
		}
		
		System.out.print("\n�达�� ��: "+count);
		
		
		
		sc.close();
	}
}
