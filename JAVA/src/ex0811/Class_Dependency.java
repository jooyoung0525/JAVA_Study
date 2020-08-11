package ex0811;

public class Class_Dependency {
	/*
	 * (방법1) : 강한형태의 의존관계 => Apple1이나 Orange1의 클래스가 없으면 절대 안됨. 
	 *          ==> 강한의존관계를 약한의존관계로 고쳐야함(인터페이스) // 상속을 받으면 불필요한 코드가 들어감
	 *          
	public static void packing(Apple1 apple) {
		System.out.println(apple.getName()+" : "+ apple.getPrice());
	}
	
	//위(5~8)와 아래(12~11)는 오버로딩! -> 실질적으로 하는 일은 비슷
	 
	public static void packing(Orange1 orange) {
		System.out.println(orange.getName()+" : "+ orange.getPrice());
	}
	*/
	
	
	/*
	 * (틀린 방법 1)
	public static void packing(Object obj) { //Object객체는 사과와 오렌지의 아버지! //업캐스팅
		/*
		 // Orange1 객체 처리시 런타임 오류!
		Apple1 apple = (Apple1)obj;
		System.out.println(apple.getName()+" : "+ apple.getPrice());
		
	}*/

	public static void packing(Object obj) { //Object객체는 사과와 오렌지의 아버지! //업캐스팅
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
		return "사과";
	}
}

class Orange1 {
	public int getPrice() {
		return 500;
	}

	public String getName() {
		return "오렌지";
	}
}