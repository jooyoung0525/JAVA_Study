package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Comparator {
	public static void main(String[] args) {
		List<User5>list = new ArrayList<>();
		list.add(new User5("abc","������",20));
		list.add(new User5("abbs","���ڹ�",17));
		list.add(new User5("java","�ڹ�",23));
		list.add(new User5("spring","������",26));
		list.add(new User5("oracle","����Ŭ",19));
		
		
		
		// ���� ���� ����(�̸�)
		Comparator<User5> comp1 = new Comparator<User5>() {

			@Override
			public int compare(User5 o1, User5 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(list,comp1);
		System.out.println("�̸� ����...");
		
		for(User5 u :list) {
			System.out.println(u);
		}
		
		
		// ���� ���� ����(����)
		Comparator<User5> comp2 = new Comparator<User5>() {

			@Override
			public int compare(User5 o1, User5 o2) {
				return o1.getAge()-o2.getAge();
			}
		};
		Collections.sort(list,comp2);
		System.out.println("���� ����...");
		
		for(User5 u :list) {
			System.out.println(u);
		}
		
		
	}
}


class User5{
	private String id;
	private String name;
	private int age;
	
	public User5() {
		
	}
	
	public User5(String id, String name,int age) {
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

}