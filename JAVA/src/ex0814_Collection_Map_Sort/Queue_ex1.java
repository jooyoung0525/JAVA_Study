package ex0814_Collection_Map_Sort;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex1 {
	public static void main(String[] args) {
		//Queue : FIFO
		
		Queue<String>q = new LinkedList<>();
		
		q.offer("서울"); //큐의 마지막에 데이터를 삽입
		q.offer("부산");
		q.offer("대구");
		
		while(q.peek()!=null) {
			System.out.println(q.poll());
		}
		
		// peek() : 큐의 head 요소를 반환하고 삭제 안함. 없으면 null
		// poll() : 큐의 head 요소를 반환하고 삭제. 없으면 null
	}
}
