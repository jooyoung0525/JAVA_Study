package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException_Ex2 {
	public static void main(String[] args) throws IOException {
		//main에도 예외를 넘길수 잇지만 프로그램이 꺼지기때문에 하면 안됨.
		//main => JVM이 호출함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int age;
		
		System.out.print("이름?");
		name = br.readLine();
		
		System.out.println("나이?");
		age=Integer.parseInt(br.readLine());
		
		System.out.println(name+":"+age);
		
	}
}
class User12{
}
