package ex0825;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_ex3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a","c", "x","a","t","m","x","c","e","f");
		Stream<String>st = list.stream();
		
		//���������� ����Ǳ� �� �߰� ������ �������� ����
		st.distinct() //�߰�����
		  .limit(5)   //�߰�����
		  .sorted()   //�߰�����
		  .forEach(System.out::println); //���� ����
		
		//���������� ��� ��Ҹ� �Ҹ��ϹǷ� �ѹ��� ����
		//st.forEach(System.out::println); //��Ÿ�ӿ���
	
	
	}
}
