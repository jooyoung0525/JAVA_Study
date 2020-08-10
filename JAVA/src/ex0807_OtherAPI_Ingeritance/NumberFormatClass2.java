package ex0807_OtherAPI_Ingeritance;

import java.text.NumberFormat;


public class NumberFormatClass2 {
	public static void main(String[] args) {
		
		try {
			NumberFormat nf = NumberFormat.getInstance();
			String s1,s2;
			Number n1 = nf.parse("1000"); //wrapperclass의 최상위 ->NumberClass
			System.out.println(n1);
			//System.out.println(n1+20); //컴파일 오류 -> 연산못함
			
			//Double d = (Double)nf.parse("2000"); 컴파일 오류
			Double d = (Double)nf.parse("2000.1");
			 //parse() 메소드의 리턴 타입은 Number
			 //Double은 Number를 상속 받음
			 //다운캐스팅을 하지 않으면 Double 객체로 반환 불가
			
			System.out.println(d);
			System.out.println(d+20); 
			
			Long l = (Long)nf.parse("2000");
			//Double l = (Double)nf.parse("2000");//런타임오류
			//Integer i = (Integer)nf.parse("2000"); //런타임오류
			System.out.println(l);
			
			s1 ="1,234";
			s2 ="3,500";
			//long x = Long.parseLong(s1); //런타임오류 -> 콤마있으면 숫자로 못바꿈
			
			Long x = (Long)nf.parse(s1);
			Long y = (Long)nf.parse(s2);
			System.out.println(x+y);
			
			s1 = s1.replaceAll(",", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
