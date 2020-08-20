package ex0819;

import java.io.PrintWriter;

public class PrintWriter_Ex1 {

	public static void main(String[] args) {
//	PrintWriter pw = new PrintWriter(System.out);
//	pw.print("abc");
//	pw.print("xyz");
//	pw.flush(); // flush()를 호출해야 출력이 된다.
		
	// true 옵션을 주면 flush() 를 호출하거나 println() 을 호출하면 출력	
	PrintWriter pw = new PrintWriter(System.out,true); 
	pw.print("abc");
	pw.print("xyz");
	pw.flush(); 
	}

}
