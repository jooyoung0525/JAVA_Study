package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

public class WrapperClass_Ex2 {
	public static void main(String[] args) {
		//WrapperClass는 불변이다-> 값을 변환할 수 없다. 값이 변하면 다른주소에 할당.
		
		int a;
		long b;
		
		b = 10;
		a = (int)b;
		System.out.println(a);
		
		Long ob1;
		//ob1 = 10; //컴파일 오류
		
		ob1 = 10L;
		System.out.println(ob1);
		
		Long ob2 = new Long(10);
		System.out.println(ob2);
		
		Integer ob3;
		//ob3 = (Integer)ob2; //컴파일오류
		        //클래스는 상하관계가 아니면 형변환 불가.
		
		//int x = null; //컴파일 오류
		
		ob3 = null; 
		System.out.println(ob3);
		
		//ob3+=10; //런타임오류 (ob3은 null이므로)
		
		
		ob3 = 10;
		ob3+=5;
		System.out.println(ob3);
	} 
}
