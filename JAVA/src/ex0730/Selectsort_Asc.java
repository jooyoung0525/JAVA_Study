package ex0730;

public class Selectsort_Asc {
	public static void main(String[] args) {

		//�������� 
		//ó������ �������� ���� ��~�� ��� Ž���ϸ� ���� ������ ����
		//�״��� �� ���� ���������� ��~�� ��� Ž���ϸ� ���� ������ ����...�ݺ�
		
		int[] a = new int[] { 30, 27, 15, 60, 7, 21 };
		int t;

		System.out.print("Source data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		//Selection Sort
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i]; a[i] = a[j]; a[j] = t;
				}
			}
		}

		System.out.print("Sort data : ");
		for(int n : a)
			System.out.print(n+" ");
		System.out.println();
		
	}
}
