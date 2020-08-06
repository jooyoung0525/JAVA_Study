package ex0729_Array;

public class Array_Ex2_ArrayDeclare2 {
	public static void main(String[] args) {
	
		//배열 선언 및 메모리 할당.
		int a[] = new int[5];
		
		int n = 1;
		for(int i = 0; i<5; i++) {
			a[i] = n;
			n+=2; // 1,3,5,7,9
		}
		
		//System.out.println(a[0]+","+a[1]);
		
		System.out.println("배열의 길이 : "+ a.length);
		
		for(int i = 0; i<a.length; i++) { 
			System.out.println(a[i]);
		}
		

		//런타임 오류. 첨자는 "배열의 총 요소수-1" 보다 큰 수는 사용불가.
		  // ArrayIndexOutOfBoundsException 오류 발생 --> 첨자 범위를 넘어서 오류발생
		//System.out.println(a[5]);
		
		
		
		//향상된 for --> jdk5.0부터 사용 가능.
		
		for(int x : a) // for(자료형 변수 : 배열) { --> 우변은 집합(ex.배열)만 옴
			System.out.println(x);				
		
	
	}
}
