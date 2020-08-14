package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Shuffle {
	public static void main(String[] args) {
		String[] ss = new String[] {"java","css","html","javascript","jsp"};
		
		//배열값을 문자열로 변환하여 반환
		String s = Arrays.toString(ss);
		System.out.println(s);
		
		//배열을 리스트로 변환
		//Integer[](클래스자료형)은 가능하지만 int[](기본자료형)는 불가
		List<String>list = new ArrayList<String>(Arrays.asList(ss));
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}
