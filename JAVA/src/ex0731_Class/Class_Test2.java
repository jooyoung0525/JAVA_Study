package ex0731_Class;

public class Class_Test2 {
	public static void main(String[] args) {

		//<<������ ����>>
		
		Bank bb; //�ʱ�ȭ �ȵ�
		
		//bb.name ="ȫ�浿"; 
		   //������ ����. �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�� ��ü�� ������ ��츸 ȣ�� ����
		   //may not have been initialized
		
		
		
		//<<��Ÿ�ӿ���>>
		
		Bank bb2 = null; //��ü�� null�� �ʱ�ȭ -> ��ü�� �ʱ�ȭ��Ű�� ����� null�ۿ� ����
		   // null�� ��ü�� �������� ���� �ƹ��͵� ���� ����
		
		//bb2.name ="ȫ�浿";
		  //��Ÿ�� ����. ��ü�� �������� ���� ���¿��� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ� ���� �Ұ�.
		  // NullPointerException
		
		
		
		
		//��ü ���� : new ������([�μ�])
		bb = new Bank();  
		bb2 = new Bank();
		
		//bb.money = 100; //private ����� class�ȿ��� ������ class�ۿ��� ���� �Ұ��� 
		                  //������ ����.
		         
		
		bb.name = "ȫ�浿";
		System.out.println(bb.name+":"+bb.getMoney()); //ȫ�浿:1000
		
		
		System.out.println(bb2.name+":"+bb2.getMoney()); //null:1000
	}
}


// public > protected > �⺻(default) > private
//  public : ������ ��밡��
//  default  :������ ��Ű��(����) �ȿ��� ��밡��


class Bank{ //Bank��� Ŭ�����̸��� �� ����� �� ���� >>> �������ϸ� -> class���� ����
 	
	//�ν��Ͻ� ���� : ��ü�� �����ؾ� ȣ���� �� �ִ� ����
	//private : Ŭ������������ ���� ����.
	//    Ŭ���� �ۿ����� ���� �Ұ�
	
	private int money = 1000; //���常��� ������ 1000���� �ʱ�ȭ��
	String name; //������ ��Ű���� Ŭ���������� ����
	
	
	
	//�ν��Ͻ� �޼ҵ� :  ��ü�� �����ؾ� ȣ���� �� �ִ� �޼ҵ�
 	public int getMoney() {
		return money;
	}
 	
 	
 	//���� : �ν��Ͻ� �޼ҵ� 
 	public int draw (int m) {
 		if(m>money) {
 			return -1;
 		}
 		money -= m;
 		return m;
 	}
 	
 	
 	//�Ա� : �ν��Ͻ� �޼ҵ� 
 	public int saving(int m) {
 	 	
 		money += m;
 		return m;
 	}
}