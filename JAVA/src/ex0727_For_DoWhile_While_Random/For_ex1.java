package ex0727_For_DoWhile_While_Random;

public class For_ex1 {
	public static void main(String[] args) {

		/* <<for���� ����>>
		int a;
		for(a = 1; a<=5; a++) { //a=1 ���� ����, 1<=5 ���Ǹ��� (1) // a++ --> 2 (3) // a++ --> 6 -->for�� ������ ����
			System.out.println("�� : "+a); // �� : 1 ��� (2) // 2..3..4..5 ���
		}
		System.out.println("�� : "+a); //6
		*/
		
		/*
		int a;
		for(a = 1; a<=5; a+=2) { 
			System.out.println("�� : "+a); 
		}
		System.out.println("�� : "+a);
		
		//1. a = 1 ����
		//2. 1<=5 ���Ǹ���
		//3. 1 ���
		//4. a+=2 --> a = 3
		//5. 3<=5 ���Ǹ���
		//6. 3 ���
		//7. a+=2 --> a = 5
		//8. 5<=5 ���Ǹ���
		//9. 5���
		//10.a+=2 --> 7
		//11.7<=5 ���ǺҸ���
		//12.for����������
		 * 
		 */
		
		/*
		int a = 1;
		for(; a<=5;) { //�̷������� for�� ���ٿ� while����!

			System.out.println("�� : "+a);
			a++;
		}
		System.out.println("�� : "+a); 
		*/
		
		
		/*
		//(������ ���� ����)
		int a;
		for(a = 1; ;a++) { //������ ������ ���� ����!!!!

			System.out.println("�� : "+a);
		}
		System.out.println("�� : "+a); 
		*/
		
		
		/* �̷��� �ҹٿ� while��!
		int a;
		for(a = 1; ;a++) { 

			System.out.println("�� : "+a);
			if(a>=5) break;
		}
		System.out.println("�� : "+a); 
		*/
	}
}
