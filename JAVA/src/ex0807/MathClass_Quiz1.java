package ex0807;

import java.util.Random;
import java.util.Scanner;

public class MathClass_Quiz1 {
	public static void main(String[] args) {
			//1~100 ������ ������ �߻��Ͽ� 20���ȿ� ���߱�
		    Random r = new Random();
			Scanner sc = new Scanner(System.in);
			
			boolean flag = false;
		    int com = r.nextInt(101)+1;
			int myNum=0;
			System.out.println("���� : "+com);
			
			for(int i = 0; i<10; i++) {
				System.out.print("�� ?");
				myNum = sc.nextInt();
				
				if(com > myNum) {
					System.out.println(com+":"+myNum+"���� ū���Դϴ�.");
				}
				else if(com < myNum) {
					System.out.println(com+":"+myNum+"���� �������Դϴ�.");
				}
				else {
					System.out.println("�����Դϴ�.");
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("������ : "+com+"�Դϴ�.");
			}
			
			sc.close();
	}
}
