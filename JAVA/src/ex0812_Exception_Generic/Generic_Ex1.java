package ex0812_Exception_Generic;

import java.util.Arrays;

public class Generic_Ex1 {
	public static void main(String[] args) {
		Object[] objs = {"seoul","busan",1000,500,"korea"};
		//Object : ��� Ÿ������ ���尡��
		
		Arrays.sort(objs);// ��Ÿ�� ���� �߻� : �迭 �ȿ� ���� ������ 
		// Arrays : ���� �ڷ����� �����ϴ�.
//		System.out.println(Arrays.toString(objs));
		
		System.out.println(((String)objs[0]).length());
		// objs�� string���� �ٿ�ĳ�����ؾ� ���ڿ��� ���̸� ���� �� �ִ�.
		
//		System.out.println(((String)objs[2]).length());
		// ��Ÿ�ӿ��� : String�� �ƴϰ� int�� �̱� ������ �߻�
		
		
	}
}
