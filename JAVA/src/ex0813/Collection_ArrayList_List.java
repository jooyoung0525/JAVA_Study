package ex0813;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList_List {
	public static void main(String[] args) {
		
		//String 객체를 저장할 ArrayList객체 생성
		//ArrayList<String> list = new ArrayList<>();
		
		//ArrayList : List인터페이스를 구현한 클래스
		List<String> list = new ArrayList<>();
		//List : 순서O, 중복O
		
		
		list.add("서울"); //가장끝에 데이터 추가 ==> 서울이 저장된 주소를 저장하는게 컬렉션
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		System.out.println(list); //전체가 한번에 출력
		System.out.println("개수:" +list.size());
		
		//첫요소 출력
		System.out.println(list.get(0));
		
		//마지막요소 출력
		System.out.println(list.get(list.size()-1));
		
		//원하는 위치에 데이터 추가
		list.add(0, "제주");
		System.out.println(list);
		
		//원하는 위치에 데이터 수정
		list.set(0, "경기");
		System.out.println(list);
		
		//서울존재여부
		System.out.println(list.indexOf("서울"));//없으면 -1
		System.out.println(list.contains("서울"));//없으면 false
		
		//데이터삭제
		list.remove("경기");
		list.remove(list.size()-1);
		System.out.println(list);
		
		
		
		
		//기본 for문
		//<<전체출력 -> 앞에서>>
		System.out.println("전체 출력_1번");
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		
		//<<전체출력 -> 역순>>
		System.out.println("전체 출력 : 역순");
		for(int i = list.size()-1; i>0; i--)
			System.out.print(list.get(i)+" ");
		System.out.println();	
		
		
		
		
		
		//향상된 for문
		System.out.println("전체 출력_2번");
		for(String s : list ) //단위 자료형:프린트 할 list
			System.out.print(s+" ");
		System.out.println();
		
		
		
		
		
		//iterator
		//반복자:데이터를 하나씩 가져올수있도록 하는 기능을가진것--> : 순방향만 가능
		System.out.println("전체 출력_3번");
		Iterator<String> it = list.iterator(); 
		while(it.hasNext()) { //hasNext는 데이터가 존재하면 true
			String s = it.next(); //현재위치의 데이터를 반환하고 다음으로 이동
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
		
		
		//ListIterator
		
		//<<1.순방향>>
		System.out.println("전체 출력_4번"); //순방향 역방향 모두가능
		ListIterator<String> it2 = list.listIterator();//처음위치
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.print(s+" "); 
		}// while끝나면 마지막 다음위치
		System.out.println();
		
		
		//<<2.순방향 후 역방향 출력>>
		System.out.println("역방향");
		while(it2.hasPrevious())
		{
			String s = it2.previous();
			System.out.print(s+" ");
		}
		System.out.println();
		 
		
		//<<3.처음부터 역방향>>
		System.out.println("처음부터 역방향");
		ListIterator<String> it3 = list.listIterator(list.size());//마지막 다음위치
		while(it3.hasPrevious()) {
			String s = it3.previous();
			System.out.print(s+" "); 
		}
		System.out.println();
		
			
	}
}
