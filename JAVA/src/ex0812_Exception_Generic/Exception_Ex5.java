package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Ex5 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b,c;
//		try {
//			System.out.print("ù��° ��?");
//			a=Integer.parseInt(br.readLine());
//			System.out.print("�ι�° ��?");
//			b=Integer.parseInt(br.readLine());
//			c=a/b;
//			System.out.println("���: "+c);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}catch(NumberFormatException e) {
//			System.out.println("�����Է� �����մϴ�....");
//		}catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����..");
//		} catch (Exception e) { 
		// ū ������ exception�� �Ʒ��� catch ���� �ۼ��ؾ���
//		// exception : ��� ���ܸ� catch �Ѵ�.
//		System.out.println(e.getMessage());
//	} // �� �ۼ��� �ڵ� : �߻������� ���ܸ� ��� catch������ exception�� ������ catch�Ѵ�.
//		
		try {
			System.out.print("ù��° ��?");
			a=Integer.parseInt(br.readLine());
			System.out.print("�ι�° ��?");
			b=Integer.parseInt(br.readLine());
			c=a/b;
			System.out.println("���: "+c);
		} catch (Exception e) {
			// exception : ��� ���ܸ� catch �Ѵ�.
			System.out.println(e.getMessage());
		}
	}
}
