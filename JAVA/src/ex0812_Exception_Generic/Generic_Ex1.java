package ex0812_Exception_Generic;

import java.util.Arrays;

public class Generic_Ex1 {
	public static void main(String[] args) {
		Object[] objs = {"seoul","busan",1000,500,"korea"};
		//Object : 모든 타입형을 저장가능
		
		Arrays.sort(objs);// 런타임 오류 발생 : 배열 안에 숫자 때문에 
		// Arrays : 같은 자료형만 가능하다.
//		System.out.println(Arrays.toString(objs));
		
		System.out.println(((String)objs[0]).length());
		// objs를 string으로 다운캐스팅해야 문자열의 길이를 구할 수 있다.
		
//		System.out.println(((String)objs[2]).length());
		// 런타임오류 : String이 아니고 int형 이기 때문에 발생
		
		
	}
}
