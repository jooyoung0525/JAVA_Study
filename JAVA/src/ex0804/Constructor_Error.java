package ex0804;

public class Constructor_Error {
	public static void main(String[] args) {

		//Demo2 ob = new Demo2(); //������ ����. ���ھ��� �����ڰ� ��� �����߻�
		Demo2 ob = new Demo2(10);
		
		
		ob.write(); //�����ִ� ������...  
		            //10
	}
}


class Demo2{
	int a;
	
	//���ڰ� �ִ� ������
	//�����ڰ� �����ϸ� �����Ϸ��� ����Ʈ �����ڸ� ������ �ʴ´�
	public Demo2(int x) {
		System.out.println("�����ִ� ������...");
		a = x;
	}
	
	public void write()
	{
		System.out.println(a);
	}
}