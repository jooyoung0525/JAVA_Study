package ex0825;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_ex1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("자바", "오라클", "웹");
		
		//컬렉션 예
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		//스트림 예
		Stream<String> st = list.stream();
		//st.forEach(s->System.out.println(s)); //람다식
		st.forEach(System.out::print); //static 메소드 참조
		System.out.println();
		
	
	}
}
