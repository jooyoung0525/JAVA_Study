package ex0721_Scanner;

import java.util.Scanner;

public class Scanner_blank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //실무에서는 Scanner로 입력받지 않음
		
		String name,birth,tel;
		int age;
		
		System.out.print("이름? : ");
		name = sc.nextLine(); //공백 입력 허옹하지만 잘못하면 원하는 결과가 나오지 않을 수 있음
	
		System.out.print("나이? : ");
		age = sc.nextInt();
		sc.nextLine(); //이거 안해줬을 때, age의 엔터는 birth에 저장되어서 건너뜀.
		               //sc.nextLine() 해줬을 때 -> 버퍼에 남은 엔터 읽고 버림
		
		/*
		 next -> 엔터 : 구분자 --> 모든 입력완료라는 뜻  //엔터 읽어내지 못함
		 nextLine -> 엔터까지 읽을 수 있음
		*/
		
		System.out.print("생년월일? : ");
		birth = sc.nextLine();
		
		System.out.print("전화번호? : ");
		tel = sc.nextLine();
		
		System.out.println(name+","+age+","+birth+","+tel);
		
		sc.close();
		
	}
}
 