package ex0724;

import java.util.Scanner;

public class Quiz3_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year, month, day;
		System.out.print("�⵵ ?");
		year = sc.nextInt();
		System.out.print("�� ?");
		month = sc.nextInt();

		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		case 4 : case 6: case 9: case 11: day = 30; break;
		case 2: 
			day = (year%4 == 0 && (year % 100 != 0 || year % 400 == 0)? 29:28); //if�� �ۼ��ص� ��!
			break;
		default :  day = -1; //���� �߸� �Է����� ��
		}
		
		if(day < 0) System.out.println("�Է� ����...");
		else
			System.out.println(year+"�� "+month+"���� "+day+"�ϱ��� �ֽ��ϴ�.");
		
		sc.close();
	}
}
