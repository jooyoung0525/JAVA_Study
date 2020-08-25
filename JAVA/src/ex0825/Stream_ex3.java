package ex0825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_ex3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","c", "x","a","t","m","x","c","e","f");
		Stream<String>st = list.stream();
		
		//최종연산이 수행되기 전 중간 연산을 수행하지 않음
		st.distinct() //중간연산
		  .limit(5)   //중간연산
		  .sorted()   //중간연산
		  .forEach(System.out::println); //최종 연산
		
		//최종연산은 모든 요소를 소모하므로 한번만 가능
		//st.forEach(System.out::println); //런타임오류
	
	
	}
}
