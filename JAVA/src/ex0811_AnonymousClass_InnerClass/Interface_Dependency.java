package ex0811_AnonymousClass_InnerClass;

public class Interface_Dependency {
	public static void packing(Fruit f) { //의존관계가 인터페이스에 있음 ==> 결합도를 낮출 수 있다!!
		                                   // 고치고 싶으면 아래의 클래스를 수정하면됨.
		System.out.println(f.getName()+":"+f.getPrice());
	}
	public static void main(String[] args) {
		Apple obj1 = new Apple();
		packing(obj1);
		
		Orange obj2 = new Orange();
		packing(obj2);
	}
}


interface Fruit{ //기능설계 ==> 인터페이스는 아버지(상위클래스)와 비슷한 개념
	public String getName();
	public int getPrice();
}


class Apple implements Fruit{

	@Override
	public String getName() {	
		return "[사과]";
	}

	@Override
	public int getPrice() {
		return 1000;
	}
}

class Orange implements Fruit{

	@Override
	public String getName() {	
		return "오렌지";
	}

	@Override
	public int getPrice() {
		return 500;
	}
	
}