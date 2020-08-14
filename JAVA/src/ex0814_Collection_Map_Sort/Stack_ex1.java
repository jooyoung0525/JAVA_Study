package ex0814_Collection_Map_Sort;

import java.util.Stack;

public class Stack_ex1 {
	public static void main(String[] args) {
		//STACK : LIFO
		
		Stack<String> st = new Stack<>(); //리스트를 구현한게 스택
		
		st.push("서울"); //삽입
		st.push("부산");
		st.push("대구");
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
}
