package ex0814_Collection_Map_Sort;


import java.util.Set;
import java.util.TreeSet;

public class Sort_Treeset_Comparable {
	public static void main(String[] args) {
		
		//Comparable �������̽�(���ı���)�� ������ Ŭ������ TreeSet�� �߰�����
		Set<User4>set = new TreeSet<>(); //�����͸� ���������� ������ �ϱ� ������ �����Ͱ� �������� ���ؾ���.!
		
		set.add(new User4("abc","������",20));
		set.add(new User4("abbs","���ڹ�",17));
		set.add(new User4("java","�ڹ�",23));
		set.add(new User4("spring","������",26));
		set.add(new User4("oracle","����Ŭ",19));
		
		
		for(User4 u :set) {
			System.out.println(u);
		}
		
		
	}
}


//Comparable: compareTo()������ ������ �����Ѵ�.
class User4 implements Comparable<User4>{
	private String id;
	private String name;
	private int age;
	
	public User4() {
		
	}
	
	public User4(String id, String name,int age) {
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
	public int compareTo(User4 o) {
		// ���� ���� ����
	
		//return name.compareTo(o.getName());
		//return age-o.getAge();
		return -(age-o.getAge()); //���̿���
	}
	
}