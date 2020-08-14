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
		  - Map<K,V> :Ű�� ��
		       Ű�� �ߺ��� ������� �ʴ´�.
		       �⺻������ �Է� ������ �������� �ʴ´�. 
		    Iterator�� �������� �ʴ´�. (�ݺ��� ���� -> ���� for�� ���Ұ�)
		       ����Ŭ���� : Hashtable(���ü� ����), Hashmap(���ü� ���� ����)
		       ������ �߰� : put(Ű, ��)
		       ������ ��ȯ : get(Ű)
		       ������ ���� :remove(Ű)
		 */
		
		Map<String,Integer>map = new HashMap<>();
		map.put("����",1000);//�����͸� �߰�
		map.put("�λ�",350);
		map.put("��õ",250);
		map.put("�뱸",300);
		map.put("����",10);
		map.put("����",160);
		map.put("���",160);
		map.put("����",100);
		map.put("����",950); 
		//Ű�� �ߺ��� ������� �����Ƿ� Ű�� ������ ���� ���´�.
		
		System.out.println(map);
		
		Integer a = map.get("�λ�");
		System.out.println(a); //������ null
		
		System.out.println(map.containsKey("����"));//�ش� Ű���� ������ true,������ false 
		
		//Map�� Value�� LinkedList��
		List<Integer>list = new LinkedList<>(map.values()); //map�� key���� �������� �ʰ�, value���� ������
		System.out.println(list);
		
		//Map�� Key�� Set����
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println("��ü ��� (1��) : ");//map�� key���� set��ü�� ���� ��, set���ִ� iterator����ؼ� ���		
		Set<String> set = map.keySet(); //Map�� Ű�� ���� Set��ü -> Set�� �ݺ��� ����
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String key =it.next();
			Integer value = map.get(key);
			System.out.println(key+"->"+value);
		}
		
		
		/*
		 * Map.Entry : ���� ��Ʈ��(Ű�� ���� �ѽ� <���> ���� �ϳ��� ��ģ��)
		*/
		System.out.println("��ü ��� (2��) : ");
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
