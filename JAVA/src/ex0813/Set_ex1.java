package ex0813;

import java.util.HashSet;
import java.util.Set;

public class Set_ex1 {
	public static void main(String[] args) {

		
//		�ߺ� X, ���� X
		Set<String>set = new HashSet<>(); 
		
//		�ߺ� X, ���� O :��� �������
		//Set<String>set = new LinkedHashSet<>(); 
	 
//		�ߺ� X, �������� ���� 
		//Set<String>set =new TreeSet<>();
		
		set.add("����"); 
		set.add("�λ�");
		set.add("�뱸");
		set.add("��õ");
		set.add("����");
		set.add("����");
		set.add("���");
		set.add("����");
		set.add("����"); 
		set.add("���");
		set.add("��û");
		set.add("���");
		set.add("����");
		set.add("����");
		
		System.out.println(set); //���� ����
		
		set.add("����"); //�ߺ��� ������� �����Ƿ� �������� ���������.
		System.out.println(set); //�ߺ� ��� ����
		
		System.out.println("��ü...");
		for(String s : set) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
}
