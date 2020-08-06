package ex0805_String_StringBuffer_StringBuilder_API;

public class Object_Class_API {
	public static void main(String[] args) {
		User1 u1 = new User1();
		User1 u2 = new User1();

		if (u1 == u2) { // == : 객체에서는 주소를 비교
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}

		// Object 클래스의 equals() : 객체의 주소 비교
		if (u1.equals(u2)) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		//Object 클래스의 toString() : 패키지명. 클래스명@해시코드
		System.out.println(u1.toString()); 
		System.out.println(u2.toString());
		System.out.println(u1); //toString() 생략가능
		System.out.println(u2);
		
		//Object 클래스의 hashCode() : 해시코드값 반환
		// 해시코드란 ? : JVM이 객체를 빠르게 검색하기 위해 사용
		// 해시코드가 다르면 다른객체이지만, 해시코드가 같다고 같은객체는 아니다.
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}


class User1{ //equals 존재하지 않지만 main에서 사용할 수 있으면 Object클래스
	int a;
}