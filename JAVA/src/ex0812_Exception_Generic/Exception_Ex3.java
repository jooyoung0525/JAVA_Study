package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Ex3 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader : ���ڿ��� �Է¹��� �� �ִ� ���� �Է� ��Ʈ�� ����
		
		String name;
		int age;
		
		try {
			System.out.print("�̸�?");
			name = br.readLine();
			System.out.println("����?");
			age=Integer.parseInt(br.readLine());
			System.out.println(name +":"+ age);
		} catch (IOException e) {
			//IOException : ����½� �߻��ϴ� ���ܸ� ��Ÿ���� checked exception
			//�ݵ�� ����ó���ؾ���
			e.printStackTrace();
		} catch(NumberFormatException e) {
			//NumberFormatException : unchecked exception
			//System.out.println("���̴� ���ڸ� �����մϴ�.");
			
			/*
			 * // System.out.println(e.getMessage()); // System.out.println(e.toString());
			 * // �����ڰ� Ȯ���� ����
			 */		
			e.printStackTrace();
	
			}
		System.out.println("����...");
}
}
