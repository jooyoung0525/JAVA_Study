package ex0812_Exception_Generic;

public class Finally_Ex1 {
	public static void main(String[] args) {
		
	}
}
class User9{
	public int sum(String num) {
		int s=0;
		try {
			int n = Integer.parseInt(num);
			if(n<0) {
				return -1;
			}
			for(int i =1 ; i<=n; i++) {
				s+=i;
			}
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		}finally {
			//System.exit(0); 일때만 실행되지 않음
			System.out.println("return을 해도 실행됨");
		}
		return s;
	}
}