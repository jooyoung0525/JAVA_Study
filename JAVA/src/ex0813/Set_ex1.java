package ex0813;

import java.util.HashSet;
import java.util.Set;

public class Set_ex1 {
	public static void main(String[] args) {

		
//		중복 X, 순서 X
		Set<String>set = new HashSet<>(); 
		
//		중복 X, 순서 O :등록 순서대로
		//Set<String>set = new LinkedHashSet<>(); 
	 
//		중복 X, 오름차순 정렬 
		//Set<String>set =new TreeSet<>();
		
		set.add("서울"); 
		set.add("부산");
		set.add("대구");
		set.add("인천");
		set.add("광주");
		set.add("대전");
		set.add("울산");
		set.add("세종");
		set.add("강원"); 
		set.add("경기");
		set.add("충청");
		set.add("경상");
		set.add("전라");
		set.add("제주");
		
		System.out.println(set); //순서 없음
		
		set.add("서울"); //중복을 허용하지 않으므로 기존것을 덮어버린다.
		System.out.println(set); //중복 허용 안함
		
		System.out.println("전체...");
		for(String s : set) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
