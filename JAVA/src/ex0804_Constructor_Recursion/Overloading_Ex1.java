package ex0804_Constructor_Recursion;

public class Overloading_Ex1 {
	public static void main(String[] args) {

		
		User4 u = new User4();
		int a;
		double b;
		
		a = u.area(10, 5);
		u.write(a);
		u.write("�簢��",a); //doubled�� 8byte�̱� ������ int�� ã�� �� ����
		
		b = u.area(10);
		u.write(b);
		u.write("��",b);
	}
}



class User4{
	public int area(int w, int h) {
		return w*h;
	}
	
	public double area (int r) {
		return r*r*3.14;
	}
	
	public void write(int s) {
		System.out.println("�簢�� ���� : "+s);
	}
	
	public void write(double s) {
		System.out.println("�� ���� : "+s);
	}
	
	
	public void write(String t, double s) {
		System.out.println(t+ ":"+s);
	}
}