package ex0825;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Stream_ex1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�ڹ�", "����Ŭ", "��");
		
		//�÷��� ��
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		
		//��Ʈ�� ��
		Stream<String> st = list.stream();
		//st.forEach(s->System.out.println(s)); //���ٽ�
		st.forEach(System.out::print); //static �޼ҵ� ����
		System.out.println();
		
	
	}
}
