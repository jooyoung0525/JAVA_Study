package ex0814_Collection_Map_Sort;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex1 {
	public static void main(String[] args) {
		//Queue : FIFO
		
		Queue<String>q = new LinkedList<>();
		
		q.offer("����"); //ť�� �������� �����͸� ����
		q.offer("�λ�");
		q.offer("�뱸");
		
		while(q.peek()!=null) {
			System.out.println(q.poll());
		}
		
		// peek() : ť�� head ��Ҹ� ��ȯ�ϰ� ���� ����. ������ null
		// poll() : ť�� head ��Ҹ� ��ȯ�ϰ� ����. ������ null
	}
}
