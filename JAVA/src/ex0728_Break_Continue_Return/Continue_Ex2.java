package ex0728_Break_Continue_Return;



public class Continue_Ex2 {
	public static void main(String[] args) {
	
		//2~100까지 수 중 소수를 한줄에 5개씩
		int cnt = 0;
		
		jump:
		for(int n = 2; n<=100; n++) {
			for(int i = 2; i<=(n/2); i++)
			{
				if(n%i==0) continue jump; //소수가 아니면 continue;
			}
			System.out.printf("%5d",n);
			cnt++;
			if(cnt%5==0)System.out.println();
		}
	}
}
