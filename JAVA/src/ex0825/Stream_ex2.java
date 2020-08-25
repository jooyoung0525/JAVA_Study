package ex0825;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_ex2 {
	public static void main(String[] args) {
		
//		Stream<String> st = Stream.of("a","b","c");
	Stream<String>st = Stream.of(new String[] {"a","b","c"});
	st.forEach(System.out::print); //배열안에 모든요소 다 사용.
	System.out.println();
	
	
	IntStream st2 = IntStream.range(1, 10); //1~9
	st2.forEach(System.out::print);
	System.out.println();
	
	
	//무한스트림
	IntStream st3 = new Random().ints();
	st3.limit(5).forEach(System.out::println); 
	System.out.println();
	
	//5개
	IntStream st4 = new Random().ints(5); 
	st4.forEach(System.out::println); 
	System.out.println();
	
	}
}
