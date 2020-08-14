package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Collections {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("서울");
		list.add("인천");
		list.add("부산");
		list.add("대구");
		list.add("광주");
		list.add("대전");
		System.out.println(list);
		
		//Collections :컬렉션 관련 유용한 메소드가 정의된 클래스
		//정렬
		Collections.sort(list);
		System.out.println(list);
		
		
		//정렬 역순
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
