package ex0731_Class;

public class Class_Test2 {
	public static void main(String[] args) {

		//<<컴파일 오류>>
		
		Bank bb; //초기화 안됨
		
		//bb.name ="홍길동"; 
		   //컴파일 오류. 인스턴스 변수, 인스턴스 메소드는 객체가 생성된 경우만 호출 가능
		   //may not have been initialized
		
		
		
		//<<런타임오류>>
		
		Bank bb2 = null; //객체를 null로 초기화 -> 객체를 초기화시키는 방법은 null밖에 없음
		   // null은 객체가 생성되지 않은 아무것도 없는 상태
		
		//bb2.name ="홍길동";
		  //런타임 오류. 객체가 생성되지 않은 상태에서 인스턴스 변수나 인스턴스 메소드 접근 불가.
		  // NullPointerException
		
		
		
		
		//객체 생성 : new 생성자([인수])
		bb = new Bank();  
		bb2 = new Bank();
		
		//bb.money = 100; //private 멤버는 class안에는 있지만 class밖에서 접근 불가능 
		                  //컴파일 오류.
		         
		
		bb.name = "홍길동";
		System.out.println(bb.name+":"+bb.getMoney()); //홍길동:1000
		
		
		System.out.println(bb2.name+":"+bb2.getMoney()); //null:1000
	}
}


// public > protected > 기본(default) > private
//  public : 누구나 사용가능
//  default  :동일한 패키지(폴더) 안에서 사용가능


class Bank{ //Bank라는 클래스이름을 또 사용할 수 없음 >>> 컴파일하면 -> class파일 생성
 	
	//인스턴스 변수 : 객체를 생성해야 호출할 수 있는 변수
	//private : 클래스내에서만 접근 가능.
	//    클래스 밖에서는 접근 불가
	
	private int money = 1000; //통장만들면 무조건 1000으로 초기화됨
	String name; //동일한 패키지의 클래스에서는 접근
	
	
	
	//인스턴스 메소드 :  객체를 생성해야 호출할 수 있는 메소드
 	public int getMoney() {
		return money;
	}
 	
 	
 	//인출 : 인스턴스 메소드 
 	public int draw (int m) {
 		if(m>money) {
 			return -1;
 		}
 		money -= m;
 		return m;
 	}
 	
 	
 	//입금 : 인스턴스 메소드 
 	public int saving(int m) {
 	 	
 		money += m;
 		return m;
 	}
}