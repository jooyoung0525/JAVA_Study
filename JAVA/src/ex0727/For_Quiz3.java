package ex0727;

public class For_Quiz3 {
	public static void main(String[] args) {
		//1~100���� �� �� 3�� ��� �հ� ���
		
		int hap,avg,cnt;
		hap = avg= cnt = 0;
		
		for(int i = 3; i<=100; i+=3)
		{
			hap+=i;
			cnt++;
		}
		
		avg = hap/cnt;
		
		System.out.println("�� : "+ hap + ", ��� : "+avg);
		
	}
}
