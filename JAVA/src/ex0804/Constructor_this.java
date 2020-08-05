package ex0804;

public class Constructor_this {
	public static void main(String[] args) {

		Demo4 ob1 = new Demo4();
		Demo4 ob2 = new Demo4();
		
		ob1.set1(10);
		ob1.write(); //0:1
		
		
		System.out.println(ob1); //패키지명.클래스명@해시코드
		ob1.set2(20); //ob1이 호출하면 (this == ob1)
		ob1.write(); 
		System.out.println("------------------------");
		System.out.println(ob2); //패키지명.클래스명@해시코드
		ob2.set2(5); //ob2가 호출하면 (this == ob2)
		ob2.write(); 
	}
}


class Demo4{
	int a;
	int b;
	
	public void set1(int a) {
		//지역변수와 인스턴스 변수의 이름이 같으면
		//지역변수가 우선순위가 높다.(지역변수>전역변수)
		
		a = a+10; //a는 매개변수(지역)이기 때문에 객체 a값이 변하지 않음
		b=1; //b:인스턴스 변수 , this 생략된 형태
	}
	
	public void set2(int a) {
		
		System.out.println(this); //this : 호출한 객체
		this.a = a+10;
		this.b=1;
	}
	
	
	public void write() {
		System.out.println(a+":"+b);
		System.out.println(this.a+":"+this.b);
	} 
}