package ex0813_Collection_Array_List_Set;

//import java.util.List;
import java.util.Vector;

public class Vector_ex1 {
	public static void main(String[] args) {
		
//		<<List 구현 클래스>>
//		   Vector(동기화 지원, 멀티쓰레드에서 안전)
//		   ArrayList(동기화 지원 안함, Vector보다 빠름)
//		   LinkedList(대용량에서 가장 빠름)
		
		
		//List<String> list = new Vector<String>();
		
		
		Vector<String>list = new Vector<>(); //vector가 list보다 인터페이스 갯수가 더 많음
		System.out.println("초기용량:"+list.capacity());//10 >> (초기에 10개 저장가능)
		
		list.add("서울"); 
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		list.add("강원"); 
		list.add("경기");
		list.add("충청");
		list.add("경상");
		list.add("전라");
		list.add("제주");
		System.out.println("크기:"+list.size()); // 14
		System.out.println("용량:"+list.capacity());// 20 
		
		
		list.add(0,"한국");
		System.out.println(list);
		
		System.out.println("처음:"+list.firstElement()); //처음
		System.out.println("처음:"+list.get(0)); //처음
		
		System.out.println("마지막:"+list.lastElement());
		System.out.println("마지막:"+list.get(list.size()-1));
		
		list.set(0, "대한민국");
		System.out.println(list);
		
		for(String s: list)
			System.out.print(s+" ");
		System.out.println();
		
		
		//5 index 요소삭제
		list.remove(5);
		
		list.clear();
		System.out.println("크기 : "+list.size());
		System.out.println("용량 : "+list.capacity());
		
		
		//용량을 size만큼 줄이기
		list.trimToSize();
		System.out.println("크기 : "+list.size());
		System.out.println("용량 : "+list.capacity());
		
	}
}
