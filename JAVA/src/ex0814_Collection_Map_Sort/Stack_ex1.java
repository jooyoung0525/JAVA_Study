package ex0814_Collection_Map_Sort;

import java.util.Stack;

public class Stack_ex1 {
	public static void main(String[] args) {
		//STACK : LIFO
		
		Stack<String> st = new Stack<>(); //����Ʈ�� �����Ѱ� ����
		
		st.push("����"); //����
		st.push("�λ�");
		st.push("�뱸");
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
