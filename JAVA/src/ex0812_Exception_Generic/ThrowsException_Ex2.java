package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException_Ex2 {
	public static void main(String[] args) throws IOException {
		//main���� ���ܸ� �ѱ�� ������ ���α׷��� �����⶧���� �ϸ� �ȵ�.
		//main => JVM�� ȣ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		
		System.out.print("�̸�?");
		name = br.readLine();
		
		System.out.println("����?");
		age=Integer.parseInt(br.readLine());
		
		System.out.println(name+":"+age);
		
	}
}
class User12{
}
