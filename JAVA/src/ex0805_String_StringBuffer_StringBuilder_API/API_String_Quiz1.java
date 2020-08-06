package ex0805_String_StringBuffer_StringBuilder_API;

import java.util.Scanner;

public class API_String_Quiz1 {
	public static void main(String[] args) {
		/*
		 * ���� ? 52-10 //�߰��� +,-,/,*�� ����
		 * 52-10 = 42
		 * */
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		System.out.println("����[��:3+5]?");
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
		
		for(String op : new String[] {"+","-","/","*"}) { //������ �ϳ��� op�� �Ѿ
			int pos = s.indexOf(op); //-1
			if(pos > 0) { //�ι�° �̻���� �����ϴ� ���(������)
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
