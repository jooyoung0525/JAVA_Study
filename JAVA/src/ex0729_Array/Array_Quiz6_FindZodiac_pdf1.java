package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz6_FindZodiac_pdf1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] animal = new String[] {"������","��","��","����","��","��","��","�䳢","��","��","��","��"};
		//�����̰� 12�� ���! -> 0������ ����	
		int y;
	
		do {
			System.out.print("�⵵?");
			y=sc.nextInt();
		}while(y<1900);
	
		System.out.println(y+"�⵵�� "+animal[y%12]+"���� �� �Դϴ�.");
	
		
		sc.close();
	}
}
