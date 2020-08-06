package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

public class WrapperClass_Ex1 {
	public static void main(String[] args) {
		int a = 10,b;
		Integer ob;
		String str;
		double d;
		
		ob = a; // 기본 자료형인 int가 Integer로 자동 변환
		        // 실제로는 컴파일 할 때, ob=new Integer(a);로 변환되어 처리
		        // Autoboxing
		
		b = ob; // Integer가 기본자료형인 int로 자동변환
		        // 실제로는 컴파일 할 때, b = ob.intValue();로 변환되어 처리
		        // Auto-unboxing
		
		
		System.out.println(ob+b); //20
		
		str="101";
		a = Integer.parseInt(str); //10진수로 변환
		System.out.println(a);     //101
		
		a = Integer.parseInt(str,2); //2진수로 변환
		System.out.println(a);       //5
		
		/*
		//런타임오류
		str ="a1";
		a = Integer.parseInt(str);
		System.out.println(a); */
		
		str ="a1";
		a = Integer.parseInt(str,16); //16진수
		System.out.println(a);        //161
		
		
		str =Integer.toHexString(356); //16진수
		System.out.println(str);       //164

		
		System.out.println("최대 : "+Integer.MAX_VALUE);
		System.out.println("최소 : "+Integer.MIN_VALUE);
		System.out.println("bits : "+Integer.SIZE);
		System.out.println("bytes : "+Integer.BYTES);
		System.out.println("type : "+Integer.TYPE);
		
		
		//a = Integer.parseInt("10.5"); //런타임오류. "."있기 때문
		
		d = Double.parseDouble("10.5");
		System.out.println(d);
		
		// double를 문자열로 
		str = Double.toString(d);
		System.out.println(str);
	} 
}
