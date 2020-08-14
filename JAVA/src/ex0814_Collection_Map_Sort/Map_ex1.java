package ex0814_Collection_Map_Sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map_ex1 {
	public static void main(String[] args) {
		/*
		  - Map<K,V> :키와 값
		       키는 중복을 허용하지 않는다.
		       기본적으로 입력 순서를 유지하지 않는다. 
		    Iterator가 존재하지 않는다. (반복자 없음 -> 향상된 for문 사용불가)
		       구현클래스 : Hashtable(동시성 지원), Hashmap(동시성 지원 안함)
		       데이터 추가 : put(키, 값)
		       데이터 반환 : get(키)
		       데이터 삭제 :remove(키)
		 */
		
		Map<String,Integer>map = new HashMap<>();
		map.put("서울",1000);//데이터를 추가
		map.put("부산",350);
		map.put("인천",250);
		map.put("대구",300);
		map.put("광주",10);
		map.put("대전",160);
		map.put("울산",160);
		map.put("세종",100);
		map.put("서울",950); 
		//키는 중복을 허용하지 않으므로 키가 같으면 값을 덮는다.
		
		System.out.println(map);
		
		Integer a = map.get("부산");
		System.out.println(a); //없으면 null
		
		System.out.println(map.containsKey("서울"));//해당 키값이 있으면 true,없으면 false 
		
		//Map의 Value를 LinkedList로
		List<Integer>list = new LinkedList<>(map.values()); //map의 key값은 가져오지 않고, value값만 가져옴
		System.out.println(list);
		
		//Map의 Key를 Set으로
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println("전체 출력 (1번) : ");//map의 key값을 set객체로 만든 후, set에있는 iterator사용해서 출력		
		Set<String> set = map.keySet(); //Map의 키에 대한 Set객체 -> Set은 반복자 있음
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String key =it.next();
			Integer value = map.get(key);
			System.out.println(key+"->"+value);
		}
		
		
		/*
		 * Map.Entry : 맵의 앤트리(키와 값의 한쌍 <페어> 값을 하나로 합친거)
		*/
		System.out.println("전체 출력 (2번) : ");
		Set<Map.Entry<String,Integer>> set2 = map.entrySet();
		System.out.println(set2);
		
		Iterator<Map.Entry<String, Integer>> it2 = set2.iterator();
		while(it2.hasNext()) {
			Map.Entry<String,Integer>e = it2.next();
			String key = e.getKey();
			Integer value = e.getValue();
			System.out.println(key +"->"+value);
		}
		
	}
}
