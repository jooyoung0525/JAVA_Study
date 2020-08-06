package ex0729_Array;

public class Array_Ex5_Initialize {
	public static void main(String[] args) {
		
		//int a[] = new int[5];
		// 0으로 초기화
		
		
		// 1차원 배열의 초기화 (선언과 동시에 초기화)
		// 초기화할때는 []안에 크기를 명시하지 않는다.
		//int[]a = new int[] {2,4,6,8,10};
		
		//선언과 초기화 따로
		int []a;
		// a = {2,4,6,8,10}; //오류 -->new int를 생략해서는 안됨
		a = new int[] {2,4,6,8,10}; 
		
		// 초기화 할 때, new int[]생략가능
		// int []a = {2,4,6,8,10};
		
		int total = 0;
		for(int n : a) {
			total += n;
			System.out.print(n+" ");
		}
		System.out.println("합:"+total);
		
		
	}
}
