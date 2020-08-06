package ex0729_Array;

public class Array_Quiz3_Cntnum {
	public static void main(String[] args) {
		
		//난수를 100개 생성하고, 각 수가 몇번 나왔는지 카운트하는 문제
		
		int n;
		int cnt[] =new int[10];
		
		for(int i = 1; i<=100; i++) { //난수 100개 생성
			n=(int)(Math.random()*10)+1;
			System.out.printf("%5d",n);
			if(i%10 == 0)
				System.out.println();
			
			
			cnt[n-1]++; //각 수가 몇개 나왔는지 카운트
		}
		
		System.out.println();
		
		//정답 출력
		for(int i = 0; i<cnt.length; i++)
		{
			System.out.println((i+1)+":"+cnt[i]);
		}
	}
}
