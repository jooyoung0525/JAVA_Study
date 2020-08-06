package ex0727_For_DoWhile_While_Random;

public class Random_Ex {
	public static void main(String[] args) {
		int n;
		for(int i = 1; i<=100; i++) {
			n = (int) ( Math.random() * 100)+1; //0~1사이에 들은 실수중 하나의 숫자를 끄집어 냄 
			                                    // int 씌웠기 때문에 0~99까지 --> +1 : 1~100까지
			                                    //100을 45로 바꾸면 1~45까지의 수
			System.out.printf("%5d",n);
			if(i%10 == 0)
				System.out.println();
		}
	}
}
