package ex0804;

public class Constructor_Error {
	public static void main(String[] args) {

		//Demo2 ob = new Demo2(); //컴파일 오류. 인자없는 생성자가 없어서 에러발생
		Demo2 ob = new Demo2(10);
		
		
		ob.write(); //인자있는 생성자...  
		            //10
	}
}


class Demo2{
	int a;
	
	//인자가 있는 생성자
	//생성자가 존재하면 컴파일러는 디폴트 생성자를 만들지 않는다
	public Demo2(int x) {
		System.out.println("인자있는 생성자...");
		a = x;
	}
	
	public void write()
	{
		System.out.println(a);
	}
}