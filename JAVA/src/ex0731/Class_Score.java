package ex0731;

/* 1. 추상화
 * 
 *  - 성적처리  CLASS
 * 
 *  - 속성 (멤버 변수 or 필드)
 *    이름, 국어, 영어
 *   
 *  - 기능(메소드) 
 *    1. 총점을 계산한다.
 *    2. 평균을 계산한다
 *    
 * 2. 클래스 만들기
 * 3. 객체생성
 * */

public class Class_Score {
	
	//속성(필드, 인스턴스 변수)
	String name;
	int Kor, Eng;

	//기능(인스턴스메소드)
	public int tot() {
		return Kor+Eng;
	}
	
	public int ave() {
		return tot()/2;
	}
}

//public class는 하나만생성!!!!!!
//class {}는 한 파일에 계속 생성할 수 있지만 이렇게 생성하면 어지러움!!