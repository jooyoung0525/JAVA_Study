package ex0813_Collection_Array_List_Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Lotto {
	public static void main(String[] args) {
		
		//Set을 이용한 로또 만들기
		
		Set<Integer> set = new TreeSet<>(); //사전순대로 중복허용안하고 출력!
	
		while(set.size()<6) {
			set.add((int)(Math.random()*45) + 1);
		}
		
		System.out.println(set);
	}
}
