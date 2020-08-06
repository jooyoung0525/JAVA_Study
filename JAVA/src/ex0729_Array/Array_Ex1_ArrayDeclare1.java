package ex0729_Array;

public class Array_Ex1_ArrayDeclare1 {
	public static void main(String[] args) {
	
		//int x; --> x : 기본자료형
		//변수 -> 레퍼런스변수, 기본자료형 --> 각각 메모리가 다르고 위치도 다름!
	
		// 배열 선언 --> 나 이제 배열 써야지!
		// a : 배열명, 레퍼런스변수
		int a[]; // (= int a[]; ==> 이렇게 해도 상관없지만 자바는 []를 앞으로 뺌)
		
		//메모리 할당 : 5개
		a = new int[5];  // (= int []a = new int[5];)
		// a[0] ~ a[길이-1]까지 사용 가능!
		
		a[0]=1;
		a[1]=2;
		
		System.out.println(a[0]+","+a[1]);
		System.out.println(a[2]); //배열은 Heap메모리에 저장되기 때문에 자동으로 0으로 초기화 
	}
}
