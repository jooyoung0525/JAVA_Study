package ex0813;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_ex1 {
	public static void main(String[] args) {
		
		/*
		 * <<LinkedList : List���� Ŭ����>>
		 * 
		 * ArrayList�� ���������� �迭�� ������
		 *     ������ �߰�/������ �ӽù迭�� �����Ͽ� �����͸� ����
		 *     ���� ���� ���� �����͸� �߰�, �����ϸ� ���� ����.
		 *     
		 * LinkedList�� ������ �߰� ������ ���ʿ��� ������ ���簡
		 *     �Ͼ�� �����Ƿ� ArrayList���� ����
		 *     
		 * �˻��� ArrayList�� ����.
		 */
		
		List<String> list = new LinkedList<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		System.out.println(list);
	}
}
