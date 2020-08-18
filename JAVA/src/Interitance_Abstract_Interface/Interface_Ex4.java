package Interitance_Abstract_Interface;

public class Interface_Ex4 {
	public static void main(String[] args) {
	
		
		IEx3 obj = new Demo3();
		
		int s = IEx3.sum(10); //static 메소드 : 객체가 없어도 인터페이스만으로 호출가능
		
		obj.write(s) ;
		
		s= obj.max(10, 5);
		obj.write(s);
	}
}


interface IEx3{
	public void write(int n);
	
	//static 메소드 : JDK 1.8부터 가능
	public static int sum(int n) {
		int s = 0;
		for(int i = 1; i<=n; i++) s+=i;
		return s;
	}
	
	//default 메소드 : JDK 1.8부터 가능
	// 인터페이스에 선언되지만, 정의가 된 메소드
	// 구현한 클래스에서 재정의 가능!!!(override)
	public default int max(int m,int n) { 
		return m>n?m:n;
	}
}

class Demo3 implements IEx3{

	@Override
	public void write(int n) {
	System.out.println("결과 : "+n);
	}
	
}