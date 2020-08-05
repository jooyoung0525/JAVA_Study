package ex0804;

public class Instance_Init_Block {
	public static void main(String[] args) {

		Demo8 ob = new Demo8(); //인스턴스 초기화 블럭
		                        //생성자...

		
		//객체를 생성할 때 마다 다음을 실행
		/* Demo8 ob = new Demo8();을 실행했을 때,
		 * 
		 * 1) 객체의 메모리 할당
		 *    인스턴스 변수 a의 메모리 할당
		 *    
		 * 2) 인스턴스 변수는 디폴트 값으로 초기화
		 *    a <- 0
		 *    
		 * 3) 초기화 블럭이 존재하면 초기화 블럭을 실행
		 *    초기화 블럭은 객체가 생성될때 한번만 실행
		 * 
		 * 4) 생성자의 몸체를 실행한다.
		 * 
		 */
		
		ob.write(); //10
	}
}


class Demo8{
	int a; //인스턴스 변수
	
	//a=10; 컴파일 오류. 실행부에서는 실행문 사용 불가.
	
	{   //instance 초기화 블럭
		a=10;
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public Demo8() {
		System.out.println("생성자...");
	}
	
	public void write() {
		System.out.println(a);
	}
}