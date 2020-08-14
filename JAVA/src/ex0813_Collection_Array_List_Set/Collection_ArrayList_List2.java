package ex0813_Collection_Array_List_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Collection_ArrayList_List2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("����"); 
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		

		List<String> list2 = new ArrayList<>();
		list2.add("����"); 
		list2.add("���");
		list2.add("��û");
		list2.add("���");
		list2.add("����");
		list2.add("����");
	
		
		// list2�� list�� ��� ������ �߰�
		list2.addAll(list);//[����, ���, ��û, ���, ����, ����, ����, �λ�, �뱸, ��õ, ����, ����, ���, ����]
		System.out.println(list2);
		
				
		//List -> [] :List.toArray
		String[] ss = list.toArray(new String[list.size()]); // ��ȣ�ӿ� ���ʸ� ��ü
		System.out.println("�迭�� ��ȯ��...");
		for(String a : ss)
			System.out.print(a+" ");
		System.out.println();
		
		
		//[] -> List : Arrays.asList (���1)
		//List<String> list3 = new ArrayList<>(Arrays.asList(ss)); --> ArrayList��ü (���2)
		List<String> list3 = Arrays.asList(ss);
		System.out.println("����Ʈ�� ��ȯ ��...");
		for(String a : list3)
			System.out.print(a+" ");
		System.out.println();
		
		
		//subList(fromIndex,toIndex) : forIndex ~ toIndex-1
		List<String> list4 = list2.subList(1, 4); // 1~3�� �ε������� ����ϰ� ���� ��!
		System.out.println(list4); //[���, ��û, ���]
		
		//Ư���κл���
		list2.subList(1,4).clear();
		System.out.println(list2);//[����, ����, ����, ����, �λ�, �뱸, ��õ, ����, ����, ���, ����]
		
		//��� �����
		list2.clear();
		System.out.println(list2);//[]
		System.out.println(list2.size());//0
		System.out.println(list2.isEmpty()); //true
	}
}
