package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Collections {
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("����");
		list.add("��õ");
		list.add("�λ�");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		System.out.println(list);
		
		//Collections :�÷��� ���� ������ �޼ҵ尡 ���ǵ� Ŭ����
		//����
		Collections.sort(list);
		System.out.println(list);
		
		
		//���� ����
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
