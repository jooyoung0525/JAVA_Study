package ex0814_Collection_Map_Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_Shuffle {
	public static void main(String[] args) {
		String[] ss = new String[] {"java","css","html","javascript","jsp"};
		
		//�迭���� ���ڿ��� ��ȯ�Ͽ� ��ȯ
		String s = Arrays.toString(ss);
		System.out.println(s);
		
		//�迭�� ����Ʈ�� ��ȯ
		//Integer[](Ŭ�����ڷ���)�� ���������� int[](�⺻�ڷ���)�� �Ұ�
		List<String>list = new ArrayList<String>(Arrays.asList(ss));
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}
