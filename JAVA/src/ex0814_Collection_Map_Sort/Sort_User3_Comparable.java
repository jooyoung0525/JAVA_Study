package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_User3_Comparable {
	public static void main(String[] args) {
		List<User3>list = new ArrayList<>();
		list.add(new User3("abc","������",20));
		list.add(new User3("abbs","���ڹ�",17));
		list.add(new User3("java","�ڹ�",23));
		list.add(new User3("spring","������",26));
		list.add(new User3("oracle","����Ŭ",19));
		
		Collections.sort(list);//���� -> ������ �ؾ��ϴ� ���ذ��� ����.
		
		for(User3 u :list) {
			System.out.println(u);
		}
		
		
	}
}


//Comparable: compareTo()������ ������ �����Ѵ�.
class User3 implements Comparable<User3>{
	private String id;
	private String name;
	private int age;
	
	public User3() {
		
	}
	
	public User3(String id, String name,int age) {
		this.id = id;
		this.name=name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		
		return id+"\t"+name+"\t"+age;
	}

	
	@Override
	public int compareTo(User3 o) {
		// ���� ���� ����
	
		return name.compareTo(o.getName());
		//return age-o.getAge();
		//return -(age-o.getAge()); //���̿���
	}
	
}