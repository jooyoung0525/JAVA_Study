package ex0724_Switch;

public class While1 {

	public static void main(String[] args) {
		
		/* 
		int n;
		while(n<10) { //������ ����. -> n�� �ʱ�ȭ �ȵ�
			n++;
			System.out.println(n);
		}
		*/
		
		
		/*
		  int n; n=0; //�ʱ�ȭ �ʿ� 
		  while(n<10) { 
		 	n++; 
			System.out.println(n+" "); //1~10������ �ڿ��� 
		  } 
		  System.out.println("\n��:"+n); //��� ��
		 */	
		
		
		/*
		int n = 0; //����� ���ÿ� �ʱ�ȭ
		while(n++<10) //���ϰ� ����
		{
			//10�� �ݺ�
			System.out.print(n+" ");
		}
		System.out.println("\n��:"+n); // 11
		*/
		
		
		/*
		int n = 0; //����� ���ÿ� �ʱ�ȭ
		while(++n<10) //���� 1�� �����ϰ� ��
		{
			//9�� �ݺ�
			System.out.print(n+" ");
		}
		System.out.println("\n��:"+n); // 10
		*/
		
		
		/*
		int n = 0; //����� ���ÿ� �ʱ�ȭ
		while(++n<=10) //���� 1�� �����ϰ� ��
		{
			//9�� �ݺ�
			System.out.print(n+" ");
		}
		System.out.println("\n��:"+n); // 11
		*/
		
		
		int n = 0;
		while(n<10) {
			n+=2;
			System.out.println(n+" "); // 2 4 6 8 10
		}
		System.out.println("\n��:"+n); //10
		
	}
}
