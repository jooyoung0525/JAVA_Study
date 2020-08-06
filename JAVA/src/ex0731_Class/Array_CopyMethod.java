package ex0731_Class;

public class Array_CopyMethod {
	public static void main(String[] args) {
		
		
		int []a= new int[]{10,20,30}; //배열에서 초기값 생략은 초기값을 설정할 때!
		int []b = new int[a.length];
	
		//a배열의 값을 b배열에 값 복사
		System.arraycopy(a, 0, b, 0, a.length); //원본,복사하고싶은 시작위치,복사대상,복사대상에 어디서부터 넣을지,몇개복사할건지
		
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
