package ex0731;

import java.util.Scanner;

// " . : 점 " --> 객체에 대한 속성으로 접근하는 연산자 (우선순위 TOP!!)
// 사용 할 클래스가 동일한 위치에 없으면 import해야함


public class Class_Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//방법1)
		// 레퍼런스변수 선언
		Class_Score ob1;
		// 객체 생성
		ob1 = new Class_Score(); 
		
		//방법2)
		//객체 선언 및 메모리 할당
		//Class_Score ob2 = new Class_Score();
		
		
		//System.out.println(ob1.name + ":"+ ob1.tot()); //null:0
		
		System.out.print("이름은 ? ");
		ob1.name = sc.next();
		System.out.print("국어점수 ? ");
		ob1.Kor = sc.nextInt();
		System.out.print("수학점수 ? ");
		ob1.Eng = sc.nextInt();
		
		System.out.println(ob1.name + " 총점: "+ ob1.tot()+" 평균: "+ob1.ave()); //입력한 이름 : 총점

		sc.close();
	}
}

