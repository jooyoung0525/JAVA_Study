package ex0730_Array2D;

public class Bubblesort_Asc {
	public static void main(String[] args) {

		//�������� 
		//�����ѰŸ� �����ϹǷ� ���� �� ���� ���ĵ� ���� ����.
		
		int[] a = new int[] { 30, 27, 15, 60, 7, 21 };
		int t;

		System.out.print("Source data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		//Bubble Sort
		for(int i = 1; i<a.length; i++)
		{
			for(int j = 0; j<a.length-i; j++){
				
				if(a[j]>a[j+1]) {
					t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
		}
		

		System.out.print("Sort data : ");
		for(int n : a)
			System.out.print(n+" ");
		System.out.println();
		
	}
}
