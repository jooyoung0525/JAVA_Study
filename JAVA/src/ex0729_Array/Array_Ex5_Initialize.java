package ex0729_Array;

public class Array_Ex5_Initialize {
	public static void main(String[] args) {
		
		//int a[] = new int[5];
		// 0���� �ʱ�ȭ
		
		
		// 1���� �迭�� �ʱ�ȭ (����� ���ÿ� �ʱ�ȭ)
		// �ʱ�ȭ�Ҷ��� []�ȿ� ũ�⸦ ������� �ʴ´�.
		//int[]a = new int[] {2,4,6,8,10};
		
		//����� �ʱ�ȭ ����
		int []a;
		// a = {2,4,6,8,10}; //���� -->new int�� �����ؼ��� �ȵ�
		a = new int[] {2,4,6,8,10}; 
		
		// �ʱ�ȭ �� ��, new int[]��������
		// int []a = {2,4,6,8,10};
		
		int total = 0;
		for(int n : a) {
			total += n;
			System.out.print(n+" ");
		}
		System.out.println("��:"+total);
		
		
	}
}
