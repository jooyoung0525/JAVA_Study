package ex0729_Array;

public class Array_Quiz3_Cntnum {
	public static void main(String[] args) {
		
		//������ 100�� �����ϰ�, �� ���� ��� ���Դ��� ī��Ʈ�ϴ� ����
		
		int n;
		int cnt[] =new int[10];
		
		for(int i = 1; i<=100; i++) { //���� 100�� ����
			n=(int)(Math.random()*10)+1;
			System.out.printf("%5d",n);
			if(i%10 == 0)
				System.out.println();
			
			
			cnt[n-1]++; //�� ���� � ���Դ��� ī��Ʈ
		}
		
		System.out.println();
		
		//���� ���
		for(int i = 0; i<cnt.length; i++)
		{
			System.out.println((i+1)+":"+cnt[i]);
		}
	}
}
