package ex0819;

import java.io.PrintWriter;

public class PrintWriter_Ex1 {

	public static void main(String[] args) {
//	PrintWriter pw = new PrintWriter(System.out);
//	pw.print("abc");
//	pw.print("xyz");
//	pw.flush(); // flush()�� ȣ���ؾ� ����� �ȴ�.
		
	// true �ɼ��� �ָ� flush() �� ȣ���ϰų� println() �� ȣ���ϸ� ���	
	PrintWriter pw = new PrintWriter(System.out,true); 
	pw.print("abc");
	pw.print("xyz");
	pw.flush(); 
	}

}
