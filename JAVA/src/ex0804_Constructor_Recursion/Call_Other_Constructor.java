package ex0804_Constructor_Recursion;

public class Call_Other_Constructor {
	public static void main(String[] args) {

		
	}
}


class Demo7{
	private String name;
	private String tel;
	private int age;
	
	public Demo7() {
		System.out.println("���� ���� ������");
	}
	
	public Demo7(String name, int age) {
		this(name,"010",age);
		System.out.println("���� 2���� ������...");
	}
	
	public Demo7(String name, String tel, int age) {
		this.name = name;
		this.tel =tel;
		this.age = age;
		System.out.println("���� 3���� ������...");
	}
	
	public void write()
	{
		System.out.println(name+":"+tel+":"+age);
	}
	
}