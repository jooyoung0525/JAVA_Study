package ex0804;

public class Instance_Init_Block {
	public static void main(String[] args) {

		Demo8 ob = new Demo8(); //�ν��Ͻ� �ʱ�ȭ ��
		                        //������...

		
		//��ü�� ������ �� ���� ������ ����
		/* Demo8 ob = new Demo8();�� �������� ��,
		 * 
		 * 1) ��ü�� �޸� �Ҵ�
		 *    �ν��Ͻ� ���� a�� �޸� �Ҵ�
		 *    
		 * 2) �ν��Ͻ� ������ ����Ʈ ������ �ʱ�ȭ
		 *    a <- 0
		 *    
		 * 3) �ʱ�ȭ ���� �����ϸ� �ʱ�ȭ ���� ����
		 *    �ʱ�ȭ ���� ��ü�� �����ɶ� �ѹ��� ����
		 * 
		 * 4) �������� ��ü�� �����Ѵ�.
		 * 
		 */
		
		ob.write(); //10
	}
}


class Demo8{
	int a; //�ν��Ͻ� ����
	
	//a=10; ������ ����. ����ο����� ���๮ ��� �Ұ�.
	
	{   //instance �ʱ�ȭ ��
		a=10;
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
	}
	
	public Demo8() {
		System.out.println("������...");
	}
	
	public void write() {
		System.out.println(a);
	}
}