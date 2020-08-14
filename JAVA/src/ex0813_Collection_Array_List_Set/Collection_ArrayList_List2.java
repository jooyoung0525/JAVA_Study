package ex0813_Collection_Array_List_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Collection_ArrayList_List2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("서울"); 
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		

		List<String> list2 = new ArrayList<>();
		list2.add("강원"); 
		list2.add("경기");
		list2.add("충청");
		list2.add("경상");
		list2.add("전라");
		list2.add("제주");
	
		
		// list2에 list의 모든 데이터 추가
		list2.addAll(list);//[강원, 경기, 충청, 경상, 전라, 제주, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 세종]
		System.out.println(list2);
		
				
		//List -> [] :List.toArray
		String[] ss = list.toArray(new String[list.size()]); // 괄호속에 제너릭 객체
		System.out.println("배열로 변환후...");
		for(String a : ss)
			System.out.print(a+" ");
		System.out.println();
		
		
		//[] -> List : Arrays.asList (방법1)
		//List<String> list3 = new ArrayList<>(Arrays.asList(ss)); --> ArrayList객체 (방법2)
		List<String> list3 = Arrays.asList(ss);
		System.out.println("리스트로 변환 후...");
		for(String a : list3)
			System.out.print(a+" ");
		System.out.println();
		
		
		//subList(fromIndex,toIndex) : forIndex ~ toIndex-1
		List<String> list4 = list2.subList(1, 4); // 1~3번 인덱스까지 출력하고 싶을 때!
		System.out.println(list4); //[경기, 충청, 경상]
		
		//특정부분삭제
		list2.subList(1,4).clear();
		System.out.println(list2);//[강원, 전라, 제주, 서울, 부산, 대구, 인천, 광주, 대전, 울산, 세종]
		
		//모두 지우기
		list2.clear();
		System.out.println(list2);//[]
		System.out.println(list2.size());//0
		System.out.println(list2.isEmpty()); //true
	}
}
