package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_User3_Comparable {
	public static void main(String[] args) {
		List<User3>list = new ArrayList<>();
		list.add(new User3("abc","하하하",20));
		list.add(new User3("abbs","김자반",17));
		list.add(new User3("java","자바",23));
		list.add(new User3("spring","스프링",26));
		list.add(new User3("oracle","오라클",19));
		
		Collections.sort(list);//오류 -> 정렬을 해야하는 기준값이 없음.
		
		for(User3 u :list) {
			System.out.println(u);
		}
		
		
	}
}


//Comparable: compareTo()정렬의 기준을 설정한다.
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
		// 정렬 기준 설정
	
		return name.compareTo(o.getName());
		//return age-o.getAge();
		//return -(age-o.getAge()); //나이역순
	}
	
}