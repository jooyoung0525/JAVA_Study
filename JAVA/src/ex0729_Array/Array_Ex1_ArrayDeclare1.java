package ex0729_Array;

public class Array_Ex1_ArrayDeclare1 {
	public static void main(String[] args) {
	
		//int x; --> x : �⺻�ڷ���
		//���� -> ���۷�������, �⺻�ڷ��� --> ���� �޸𸮰� �ٸ��� ��ġ�� �ٸ�!
	
		// �迭 ���� --> �� ���� �迭 �����!
		// a : �迭��, ���۷�������
		int a[]; // (= int a[]; ==> �̷��� �ص� ��������� �ڹٴ� []�� ������ ��)
		
		//�޸� �Ҵ� : 5��
		a = new int[5];  // (= int []a = new int[5];)
		// a[0] ~ a[����-1]���� ��� ����!
		
		a[0]=1;
		a[1]=2;
		
		System.out.println(a[0]+","+a[1]);
		System.out.println(a[2]); //�迭�� Heap�޸𸮿� ����Ǳ� ������ �ڵ����� 0���� �ʱ�ȭ 
	}
}
