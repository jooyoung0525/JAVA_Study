package ex0811;

public class Class_Dependency {
	/*
	 * (���1) : ���������� �������� => Apple1�̳� Orange1�� Ŭ������ ������ ���� �ȵ�. 
	 *          ==> �����������踦 ������������� ���ľ���(�������̽�) // ����� ������ ���ʿ��� �ڵ尡 ��
	 *          
	public static void packing(Apple1 apple) {
		System.out.println(apple.getName()+" : "+ apple.getPrice());
	}
	
	//��(5~8)�� �Ʒ�(12~11)�� �����ε�! -> ���������� �ϴ� ���� ���
	 
	public static void packing(Orange1 orange) {
		System.out.println(orange.getName()+" : "+ orange.getPrice());
	}
	*/
	
	
	/*
	 * (Ʋ�� ��� 1)
	public static void packing(Object obj) { //Object��ü�� ����� �������� �ƹ���! //��ĳ����
		/*
		 // Orange1 ��ü ó���� ��Ÿ�� ����!
		Apple1 apple = (Apple1)obj;
		System.out.println(apple.getName()+" : "+ apple.getPrice());
		
	}*/

	public static void packing(Object obj) { //Object��ü�� ����� �������� �ƹ���! //��ĳ����
		if(obj instanceof Apple1) {
			Apple1 apple = (Apple1)obj;
			System.out.println(apple.getName()+" : "+ apple.getPrice());
		}else if(obj instanceof Orange1) {
			Orange1 orange = (Orange1)obj;
			System.out.println(orange.getName()+" : "+ orange.getPrice());
		}
	}
	
	public static void main(String[] args) {
		Apple1 obj = new Apple1();
		packing(obj);
		
		Orange1 obj2 = new Orange1();
		packing(obj2);
		
		
		
	}
}

class Apple1 {
	public int getPrice() {
		return 1000;
	}

	public String getName() {
		return "���";
	}
}

class Orange1 {
	public int getPrice() {
		return 500;
	}

	public String getName() {
		return "������";
	}
}