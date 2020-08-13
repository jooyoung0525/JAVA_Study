package ex0812_Exception_Generic;

public class Finally_Ex2 {
	public static void main(String[] args) {
		User10 uu = new User10();
		int s;
		try {
			s=uu.sum(-5); // throws  해서 에러 생김
			System.out.println(s);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class User10 {
	public int sum(int n) throws Exception {
		//throws : 호출하는 곳에서 예외를 캐치하는 것
		//반드시 호출부에서 예외처리해야함
		int s = 0;
		if(n<0) {
			//예외를 명시적을 발생시킴 checked exception
			throw new Exception("수는 0보다 적을 수 없습니다.");
		}
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}
}