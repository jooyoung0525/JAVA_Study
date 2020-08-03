package ex0731;

public class Array_Copy {
	public static void main(String[] args) {
		
		/*
		 * <<배열의 주소 복사>>
		 * a와 b가 참조하는 위치가 같다.
		 	int []a = {10,20,30};  --> a : a배열의 주소가 저장  ex) a: 0x100
		 	int []b;               --> 메모리할당 받지 않음 b: 쓰레기값 
 		 	b=a;                   --> a배열 주소값을 b에 복사    ex) b: 0x100    
 		 	b[1] =200;             --> a:200,b:200
		  
		  
		  int []a= new int[]{10,20,30}; //배열에서 초기값 생략은 초기값을 설정할 때!
		  int []b;
		  b=a;
 		 */
		
		
		
 		 /*
 		 * <<a배열의 값만 새로운 b배열에 복사>>
 		 * ex) a: 0x100
 		 *     b: 0x200 
		 */
		
		int []a= new int[]{10,20,30}; //배열에서 초기값 생략은 초기값을 설정할 때!
		int []b = new int[a.length];
	
		//a배열의 값을 b배열에 복사
		for(int i = 0; i<a.length; i++)
			b[i]=a[i];
		
		
		System.out.print("a 배열: ");
		for(int n :a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.print("b 배열: ");
		for(int n : b) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
