package ex0813_Collection_Array_List_Set;

//import java.util.List;
import java.util.Vector;

public class Vector_ex1 {
	public static void main(String[] args) {
		
//		<<List ���� Ŭ����>>
//		   Vector(����ȭ ����, ��Ƽ�����忡�� ����)
//		   ArrayList(����ȭ ���� ����, Vector���� ����)
//		   LinkedList(��뷮���� ���� ����)
		
		
		//List<String> list = new Vector<String>();
		
		
		Vector<String>list = new Vector<>(); //vector�� list���� �������̽� ������ �� ����
		System.out.println("�ʱ�뷮:"+list.capacity());//10 >> (�ʱ⿡ 10�� ���尡��)
		
		list.add("����"); 
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("����"); 
		list.add("���");
		list.add("��û");
		list.add("���");
		list.add("����");
		list.add("����");
		System.out.println("ũ��:"+list.size()); // 14
		System.out.println("�뷮:"+list.capacity());// 20 
		
		
		list.add(0,"�ѱ�");
		System.out.println(list);
		
		System.out.println("ó��:"+list.firstElement()); //ó��
		System.out.println("ó��:"+list.get(0)); //ó��
		
		System.out.println("������:"+list.lastElement());
		System.out.println("������:"+list.get(list.size()-1));
		
		list.set(0, "���ѹα�");
		System.out.println(list);
		
		for(String s: list)
			System.out.print(s+" ");
		System.out.println();
		
		
		//5 index ��һ���
		list.remove(5);
		
		list.clear();
		System.out.println("ũ�� : "+list.size());
		System.out.println("�뷮 : "+list.capacity());
		
		
		//�뷮�� size��ŭ ���̱�
		list.trimToSize();
		System.out.println("ũ�� : "+list.size());
		System.out.println("�뷮 : "+list.capacity());
		
	}
}
