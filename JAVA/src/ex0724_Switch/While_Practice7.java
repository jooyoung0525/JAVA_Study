package ex0724_Switch;

public class While_Practice7 {
	public static void main(String[] args) {
		
		/*
		//1~100까지 합을 출력하되 수가 10의 배수가 될때마다 합을 출력
		//1~10:55
		//1~20:210
		
		int n = 0;
		int s = 0;
		
		while(n<100) {
			n++;
			s+=n;
			if(n%10 == 0)System.out.println("1~"+n+":"+s);
		}*/
		
		int n = 1;
		int s = 0;
		int cnt = 0;
		
		while(n<100) {
			s+=n;
			n+=2;
			System.out.print(n+" ");
			
			cnt++;
			if(cnt % 5== 0) {
				System.out.println();
			}
			
		}
		System.out.println("홀수 합: "+s);

	}
}
