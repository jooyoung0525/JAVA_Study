package ex0813;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Lotto {
	public static void main(String[] args) {
		
		//Set�� �̿��� �ζ� �����
		
		Set<Integer> set = new TreeSet<>(); //��������� �ߺ������ϰ� ���!
	
		while(set.size()<6) {
			set.add((int)(Math.random()*45) + 1);
		}
		
		System.out.println(set);
	}
}
