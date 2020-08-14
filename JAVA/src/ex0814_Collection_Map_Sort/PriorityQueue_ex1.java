package ex0814_Collection_Map_Sort;

import java.util.PriorityQueue;


//�켱����ť
public class PriorityQueue_ex1 {
	public static void main(String[] args) {
		// PriorityQueue : �켱���� ť
		// Comparable �������̽� ���� Ŭ������ ����
		PriorityQueue<User11> q = new PriorityQueue<>();
		
		q.offer(new User11("������",20));
		q.offer(new User11("����",15));
		q.offer(new User11("�ʳʳ�",17));
		
		while(q.peek()!= null) {
			User11 u = q.poll();
			System.out.println(u.getName()+" : "+u.getAge());
		}
	}
}

class User11 implements Comparable<User11>{
	private String name;
	private int age;
	
	public User11(){
		
	}
	
	public User11(String name, int age) {
		this.name = name;
		this.age = age;
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
	public int compareTo(User11 o) {
		return name.compareTo(o.getName());
	}
	
}