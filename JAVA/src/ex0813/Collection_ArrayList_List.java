package ex0813;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList_List {
	public static void main(String[] args) {
		
		//String ��ü�� ������ ArrayList��ü ����
		//ArrayList<String> list = new ArrayList<>();
		
		//ArrayList : List�������̽��� ������ Ŭ����
		List<String> list = new ArrayList<>();
		//List : ����O, �ߺ�O
		
		
		list.add("����"); //���峡�� ������ �߰� ==> ������ ����� �ּҸ� �����ϴ°� �÷���
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		System.out.println(list); //��ü�� �ѹ��� ���
		System.out.println("����:" +list.size());
		
		//ù��� ���
		System.out.println(list.get(0));
		
		//��������� ���
		System.out.println(list.get(list.size()-1));
		
		//���ϴ� ��ġ�� ������ �߰�
		list.add(0, "����");
		System.out.println(list);
		
		//���ϴ� ��ġ�� ������ ����
		list.set(0, "���");
		System.out.println(list);
		
		//�������翩��
		System.out.println(list.indexOf("����"));//������ -1
		System.out.println(list.contains("����"));//������ false
		
		//�����ͻ���
		list.remove("���");
		list.remove(list.size()-1);
		System.out.println(list);
		
		
		
		
		//�⺻ for��
		//<<��ü��� -> �տ���>>
		System.out.println("��ü ���_1��");
		for(int i = 0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		System.out.println();
		
		//<<��ü��� -> ����>>
		System.out.println("��ü ��� : ����");
		for(int i = list.size()-1; i>0; i--)
			System.out.print(list.get(i)+" ");
		System.out.println();	
		
		
		
		
		
		//���� for��
		System.out.println("��ü ���_2��");
		for(String s : list ) //���� �ڷ���:����Ʈ �� list
			System.out.print(s+" ");
		System.out.println();
		
		
		
		
		
		//iterator
		//�ݺ���:�����͸� �ϳ��� �����ü��ֵ��� �ϴ� �����������--> : �����⸸ ����
		System.out.println("��ü ���_3��");
		Iterator<String> it = list.iterator(); 
		while(it.hasNext()) { //hasNext�� �����Ͱ� �����ϸ� true
			String s = it.next(); //������ġ�� �����͸� ��ȯ�ϰ� �������� �̵�
			System.out.print(s+" ");
		}
		System.out.println();
		
		
		
		
		
		//ListIterator
		
		//<<1.������>>
		System.out.println("��ü ���_4��"); //������ ������ ��ΰ���
		ListIterator<String> it2 = list.listIterator();//ó����ġ
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.print(s+" "); 
		}// while������ ������ ������ġ
		System.out.println();
		
		
		//<<2.������ �� ������ ���>>
		System.out.println("������");
		while(it2.hasPrevious())
		{
			String s = it2.previous();
			System.out.print(s+" ");
		}
		System.out.println();
		 
		
		//<<3.ó������ ������>>
		System.out.println("ó������ ������");
		ListIterator<String> it3 = list.listIterator(list.size());//������ ������ġ
		while(it3.hasPrevious()) {
			String s = it3.previous();
			System.out.print(s+" "); 
		}
		System.out.println();
		
			
	}
}
