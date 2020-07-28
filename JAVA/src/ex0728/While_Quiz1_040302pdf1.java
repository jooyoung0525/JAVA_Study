package ex0728;



public class While_Quiz1_040302pdf1 {
	public static void main(String[] args) {
		//1-2+3-4..연산에서 연산결과가 100이상이 되는 최소의 수와 그때의 합을 출력하는 프로그램을 작성하시오.
		
		int n, s;
		n = s = 0;
		
		while(true) {
			n++;
			s = n%2==0?s-n:s+n;
			if(s >= 100)break;
		}
		
		System.out.println("n : "+n+", s : "+s);
	}
}
