package ex0727_For_DoWhile_While_Random;

public class While_Quiz7_Catch {
	public static void main(String[] args) {
		
		int x,y,cnt;
		
		x = 100;
		y = cnt = 0;
		
		while(x > y) {
			cnt++;
			x += 2;
			y += 5;
		}
		
		System.out.println("x : "+ x + ", y : "+y);
		System.out.println("걸린시간 : "+cnt);
	}
}
