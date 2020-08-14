package ex0814_Collection_Map_Sort;


import java.util.Set;
import java.util.TreeSet;

public class Sort_Treeset_Comparable {
	public static void main(String[] args) {
		
		//Comparable 인터페이스(정렬기준)가 구현된 클래스만 TreeSet에 추가가능
		Set<User4>set = new TreeSet<>(); //데이터를 넣을때마다 소팅을 하기 때문에 데이터가 많을때는 피해야함.!
		
		set.add(new User4("abc","하하하",20));
		set.add(new User4("abbs","김자반",17));
		set.add(new User4("java","자바",23));
		set.add(new User4("spring","스프링",26));
		set.add(new User4("oracle","오라클",19));
		
		
		for(User4 u :set) {
			System.out.println(u);
		}
		
		
	}
}


//Comparable: compareTo()정렬의 기준을 설정한다.
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
		// 정렬 기준 설정
	
		//return name.compareTo(o.getName());
		//return age-o.getAge();
		return -(age-o.getAge()); //나이역순
	}
	
}