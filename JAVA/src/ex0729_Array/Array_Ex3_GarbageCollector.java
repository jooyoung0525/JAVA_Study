package ex0729_Array;

public class Array_Ex3_GarbageCollector {
	public static void main(String[] args) {
	
		int a[] = new int[3]; //Heap����
		a[0] = 10; a[1]=20; a[2]=30;
		
		
		System.out.println("�迭�� ũ�Ⱑ 3�� ���");
		
		for(int i = 0; i<a.length; i++) { 
			System.out.print(a[i]+" ");
		}
		System.out.println();		
		
		
		
		// �迭�� �迭�� ũ�⸦ ������ �� ����.
		// �迭�� ũ�⸦ �����ϸ� �����迭�� 
		// garbage collector(�޸�ȸ��)�� ����� �ȴ�. 
		
		a = new int[5]; //Heap����
		System.out.println("�迭�� ũ�Ⱑ 5�� ���");
		for(int i = 0; i<a.length; i++) { 
			System.out.print(a[i]+" ");
		}
		
		
	}
}
