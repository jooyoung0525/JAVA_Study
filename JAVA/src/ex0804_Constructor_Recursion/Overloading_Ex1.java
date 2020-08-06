package ex0804_Constructor_Recursion;

public class Overloading_Ex1 {
	public static void main(String[] args) {

		
		User4 u = new User4();
		int a;
		double b;
		
		a = u.area(10, 5);
		u.write(a);
		u.write("사각형",a); //doubled은 8byte이기 때문에 int형 찾을 수 있음
		
		b = u.area(10);
		u.write(b);
		u.write("원",b);
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
		System.out.println("사각형 넓이 : "+s);
	}
	
	public void write(double s) {
		System.out.println("원 넓이 : "+s);
	}
	
	
	public void write(String t, double s) {
		System.out.println(t+ ":"+s);
	}
}