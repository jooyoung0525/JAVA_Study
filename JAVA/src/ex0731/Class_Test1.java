package ex0731;

import java.util.Scanner;

// " . : �� " --> ��ü�� ���� �Ӽ����� �����ϴ� ������ (�켱���� TOP!!)
// ��� �� Ŭ������ ������ ��ġ�� ������ import�ؾ���


public class Class_Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//���1)
		// ���۷������� ����
		Class_Score ob1;
		// ��ü ����
		ob1 = new Class_Score(); 
		
		//���2)
		//��ü ���� �� �޸� �Ҵ�
		//Class_Score ob2 = new Class_Score();
		
		
		//System.out.println(ob1.name + ":"+ ob1.tot()); //null:0
		
		System.out.print("�̸��� ? ");
		ob1.name = sc.next();
		System.out.print("�������� ? ");
		ob1.Kor = sc.nextInt();
		System.out.print("�������� ? ");
		ob1.Eng = sc.nextInt();
		
		System.out.println(ob1.name + " ����: "+ ob1.tot()+" ���: "+ob1.ave()); //�Է��� �̸� : ����

		sc.close();
	}
}

