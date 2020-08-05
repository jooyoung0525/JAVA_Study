package ex0804;

public class Constructor_this {
	public static void main(String[] args) {

		Demo4 ob1 = new Demo4();
		Demo4 ob2 = new Demo4();
		
		ob1.set1(10);
		ob1.write(); //0:1
		
		
		System.out.println(ob1); //��Ű����.Ŭ������@�ؽ��ڵ�
		ob1.set2(20); //ob1�� ȣ���ϸ� (this == ob1)
		ob1.write(); 
		System.out.println("------------------------");
		System.out.println(ob2); //��Ű����.Ŭ������@�ؽ��ڵ�
		ob2.set2(5); //ob2�� ȣ���ϸ� (this == ob2)
		ob2.write(); 
	}
}


class Demo4{
	int a;
	int b;
	
	public void set1(int a) {
		//���������� �ν��Ͻ� ������ �̸��� ������
		//���������� �켱������ ����.(��������>��������)
		
		a = a+10; //a�� �Ű�����(����)�̱� ������ ��ü a���� ������ ����
		b=1; //b:�ν��Ͻ� ���� , this ������ ����
	}
	
	public void set2(int a) {
		
		System.out.println(this); //this : ȣ���� ��ü
		this.a = a+10;
		this.b=1;
	}
	
	
	public void write() {
		System.out.println(a+":"+b);
		System.out.println(this.a+":"+this.b);
	} 
}