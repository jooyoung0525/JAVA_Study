package ex0813;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_ex1 {
	public static void main(String[] args) {
		
		/*
		 * <<LinkedList : List구현 클래스>>
		 * 
		 * ArrayList는 내부적으로 배열을 가지며
		 *     데이터 추가/삭제시 임시배열을 생성하여 데이터를 복사
		 *     따라서 많은 양의 데이터를 추가, 삭제하면 성능 저하.
		 *     
		 * LinkedList는 데이터 추가 삭제시 불필요한 데이터 복사가
		 *     일어나지 않으므로 ArrayList보다 빠름
		 *     
		 * 검색은 ArrayList가 빠름.
		 */
		
		List<String> list = new LinkedList<>();
		
		list.add("서울");
		list.add("부산");
		list.add("인천");
		System.out.println(list);
	}
}
