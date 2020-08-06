package ex0805_String_StringBuffer_StringBuilder_API;

import java.util.Scanner;

public class API_String_Quiz1 {
	public static void main(String[] args) {
		/*
		 * 수식 ? 52-10 //중간은 +,-,/,*만 가능
		 * 52-10 = 42
		 * */
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("수식[예:3+5]?");
		s = sc.next();
		s = s.replaceAll("\\s","");
		
		/*
		int oper;
		oper = s.indexOf("+");
		String s1 = s.substring(0,oper);
		String s2 = s.substring(oper+1);
		System.out.println(s1+":"+s2);
		
		int a1 = Integer.parseInt(s1);
		int a2 = Integer.parseInt(s2);
		*/
		
		for(String op : new String[] {"+","-","/","*"}) { //연산자 하나씩 op로 넘어감
			int pos = s.indexOf(op); //-1
			if(pos > 0) { //두번째 이상부터 존재하는 경우(연산자)
				int n1 = Integer.parseInt(s.substring(0,pos));
				int n2 = Integer.parseInt(s.substring(pos+1));
				
				int result = 0;
				switch(op) {
					case "+" : result = n1+n2; break;
					case "-" : result = n1-n2; break;
					case "/" : result = n1/n2; break;
					case "*" : result = n1*n2; break;
				}
				System.out.println(s +"="+ result);
				break;
			}
		}
		
		sc.close();
	}
}
