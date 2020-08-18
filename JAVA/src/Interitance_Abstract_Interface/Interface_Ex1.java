package Interitance_Abstract_Interface;

public class Interface_Ex1 {
	public static void main(String[] args) {
		Test11 tt = new User11();  //��ĳ���� -> �������̽��� �ƺ�
		
		tt.disp();
		
		//tt.print()//����
		((User11)tt).print(); //�ٿ�ĳ�����ؼ� ȣ��
		
		System.out.println(Test11.a);//�ٷ� ���ٰ���
	}
}


//�������̽��� �޼ҵ��� ���� ����
interface Test11{ //�޼ҵ� ���𰡴�, ������������ 
	
	//�������̽��� public�� ����!
	//���������� �Ⱥ��̸� �ڵ����� public
	
	public int a = 10; // public static final int a = 10; �� ����.
	
	public void fun(); //�����Ϸ��� public abstract void fun()���� ������
	void disp(); // public abstract void disp(); -> ����Ʈ�ޙ�
}

class User11 implements Test11 { //�߻�Ŭ������ �߻�޼ҵ� ���� �� ���� ( = abstract class USer11 implements Test11 �ϸ� �����Ȼ���)

	@Override
	public void fun() {

		System.out.println("fun...");
	}

	@Override
	public void disp() { //������ �Ҷ��� ���������� ���� �� ����. Test11�� default 
		System.out.println("disp...");
		
	} 
	
	public void print() {
		System.out.println("print...");
	}
	
}