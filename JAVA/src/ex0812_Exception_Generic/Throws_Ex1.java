package ex0812_Exception_Generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_Ex1 {
	public static void main(String[] args) {
		User11 uu = new User11();
		uu.input();
	}
}

class User11 {
	private Scanner sc = new Scanner(System.in);

	private int inputScore() throws Exception {
		//runtime exception ���� �� �ִ� �޼ҵ�
		//throws �߻��� ���ܸ� ȣ���� ���� ���ѱ�� ��
		//throw ���ܸ� �߻� ��Ű�� ��
		int n = 0;

		try {
			n = sc.nextInt();
			if(n<0||n>100) {
				throw new Exception("������ 0~100 �̾���մϴ�.");
				//checked �� ĳġ�ؾ���
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); // �߸� �Էµ� ���� �о ����
			//nextInt �� \n ������������ �Է°��� ����ϰ� \n�� ���ۿ� ���� �ֱ⶧����
			//���� nextLine�� ����� �ٷ� �Ѿ�Ե�.
//			next()<->nextLine() : �����̶� ���ͱ��� ���
//			System.out.println("���ڰ� �ƴմϴ�.");
			throw e;
		}

		return n;
	}

	public void input() {
		System.out.println("����ó��..");
		String name;
		int kor, eng;
		int tot;
		
		try {
			
			System.out.print("�̸�?");
			name = sc.next();
			
			System.out.print("����?");
			kor = inputScore();
			
			System.out.print("����?");
			eng = inputScore();

			tot = kor + eng;
			System.out.println(name + ":" + tot + "��");
		} catch (InputMismatchException e) {
			//	e.printStackTrace();
			System.out.println("������ ���ڸ� ����");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}