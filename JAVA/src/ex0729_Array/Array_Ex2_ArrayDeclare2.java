package ex0729_Array;

public class Array_Ex2_ArrayDeclare2 {
	public static void main(String[] args) {
	
		//�迭 ���� �� �޸� �Ҵ�.
		int a[] = new int[5];
		
		int n = 1;
		for(int i = 0; i<5; i++) {
			a[i] = n;
			n+=2; // 1,3,5,7,9
		}
		
		//System.out.println(a[0]+","+a[1]);
		
		System.out.println("�迭�� ���� : "+ a.length);
		
		for(int i = 0; i<a.length; i++) { 
			System.out.println(a[i]);
		}
		

		//��Ÿ�� ����. ÷�ڴ� "�迭�� �� ��Ҽ�-1" ���� ū ���� ���Ұ�.
		  // ArrayIndexOutOfBoundsException ���� �߻� --> ÷�� ������ �Ѿ �����߻�
		//System.out.println(a[5]);
		
		
		
		//���� for --> jdk5.0���� ��� ����.
		
		for(int x : a) // for(�ڷ��� ���� : �迭) { --> �캯�� ����(ex.�迭)�� ��
			System.out.println(x);				
		
	
	}
}
