package ex0721;

public class Printf_type1 {

	public static void main(String[] args) {
		
		// %d: ���� ���
		System.out.printf("%d",400);
		System.out.println();
		System.out.printf("%d\n",-400);
			
		/*	 
		 <������ ����>
		 1. ������ ���� : ���� ���� 
		 2. ��Ÿ�� ���� : �����ϴ� �߻��Ͽ� ���α׷��� ���ᰡ �Ǵ� ���� 
		*/
		
		
		// % : �������� ���ϴ� ������
		//System.out.printf("%d % %d = %d\n",13,5,13%5); //��Ÿ�� ����  
		
		
		System.out.printf("%d %% %d = %d\n",13,5,13%5); // %����ϰ� ������  %�� ���޾� �ι� �ۼ�
		
		//System.out.printf("%d", 'A');  //��Ÿ�� ���� . %d�� ���� ��� �Ұ�
		//�ذ��� 1)
		int a = 'A';
		System.out.printf("%d\n",a);
		//�ذ��� 2)
		System.out.printf("%d\n",(int)'B');
		
		
		//System.out.printf("%d\n",22000000000); --> �����Ͽ���
		System.out.printf("%d\n",22000000000L);
		
		
		System.out.println("0123456789");
		System.out.printf("%5d\n",12);  //%����d: ���ڸ�ŭ �ڸ� �� ���. ���� �տ� ����
		System.out.printf("%05d\n",12); //%0����d: ���°��� 0���� ä��
		System.out.printf("%-5d\n",12); //%-����d: ������ �ڿ� ����
		System.out.printf("%2d\n",12345); //������ �ڸ����� �����ϸ� �ڸ����� ����.
		
		System.out.printf("%d\n",12);
		System.out.printf("%d\n",-12);
		
		System.out.printf("%+d\n",12); //��� �տ� +��ȣ ���
		System.out.printf("%+d\n",-12);
		
		System.out.printf("%(d\n",12);
		System.out.printf("%(d\n",-12); //������ ��ȣ�� ǥ��
		
		System.out.printf("%(d\n",12345);
		System.out.printf("%,d\n",12345); //���ڸ����� ,���
	}

}