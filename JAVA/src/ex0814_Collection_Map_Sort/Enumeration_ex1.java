package ex0814_Collection_Map_Sort;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_ex1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("자바");
		v.add("오라클");
		v.add("서블릿");
		
		//서블릿에는 Enumeration만 제공!!!
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s+" ");
		}
		System.out.println();
	}
}
