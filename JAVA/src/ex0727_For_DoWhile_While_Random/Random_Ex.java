package ex0727_For_DoWhile_While_Random;

public class Random_Ex {
	public static void main(String[] args) {
		int n;
		for(int i = 1; i<=100; i++) {
			n = (int) ( Math.random() * 100)+1; //0~1���̿� ���� �Ǽ��� �ϳ��� ���ڸ� ������ �� 
			                                    // int ������ ������ 0~99���� --> +1 : 1~100����
			                                    //100�� 45�� �ٲٸ� 1~45������ ��
			System.out.printf("%5d",n);
			if(i%10 == 0)
				System.out.println();
		}
	}
}
