package ex0811_AnonymousClass_InnerClass;

public class Interface_Dependency {
	public static void packing(Fruit f) { //�������谡 �������̽��� ���� ==> ���յ��� ���� �� �ִ�!!
		                                   // ��ġ�� ������ �Ʒ��� Ŭ������ �����ϸ��.
		System.out.println(f.getName()+":"+f.getPrice());
	}
	public static void main(String[] args) {
		Apple obj1 = new Apple();
		packing(obj1);
		
		Orange obj2 = new Orange();
		packing(obj2);
	}
}


interface Fruit{ //��ɼ��� ==> �������̽��� �ƹ���(����Ŭ����)�� ����� ����
	public String getName();
	public int getPrice();
}


class Apple implements Fruit{

	@Override
	public String getName() {	
		return "[���]";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
}

class Orange implements Fruit{

	@Override
	public String getName() {	
		return "������";
	}

	@Override
	public int getPrice() {
		return 500;
	}
	
}