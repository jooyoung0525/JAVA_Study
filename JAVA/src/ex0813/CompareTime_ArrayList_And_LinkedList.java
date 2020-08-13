package ex0813;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareTime_ArrayList_And_LinkedList {
	public static void main(String[] args) {
		
		List<String>list1 = new ArrayList<>();
		List<String>list2 = new LinkedList<>();
		
		long s,e;
		
		s = System.nanoTime();
		for(int i = 1; i<=100000; i++) {
			list1.add("테스트:"+i);
		}
		e=System.nanoTime();
		System.out.println("ArrayList:"+(e-s)); //ArrayList:14530500
		System.out.println("--------------------------");
		
		
		s = System.nanoTime();
		for(int i = 1; i<=100000; i++) {
			list2.add("테스트:"+i);
		}
		e=System.nanoTime();
		System.out.println("LinkedList:"+(e-s)); //LinkedList:7227600
	}
}
