package ex0727_For_DoWhile_While_Random;
/*
 	double a = 0;
 	a+=4.7;
 	a+=0.4;
 	System.out.println(a); //5.1000000000000005
 */
public class For_Quiz2 {
	public static void main(String[] args) {
		
		int s = 2000000000;
		int count = 0;
		
		// float���� for���� ������ ����ϸ� 
		// ����� �޶��� �� �����Ƿ� ������� �ʴ´�.
		for(float f = s; f<s+50; f++)
			count++;
		System.out.println(count); // 0
		
		
		
	}
}
