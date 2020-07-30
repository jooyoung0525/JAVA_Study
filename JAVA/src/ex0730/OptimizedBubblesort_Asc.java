package ex0730;

public class OptimizedBubblesort_Asc {
	public static void main(String[] args) {

		//�������� 
		//�����ѰŸ� �����ϹǷ� ���� �� ���� ���ĵ� ���� ����.
		
		int[] a = new int[] { 30, 27, 15, 60, 7, 21 };
		int t,pass;
		boolean flag;
		
		
		System.out.print("Source data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

		
		/*
		//Optimize Bubble Sort (���� §��)
		for(int i = 1; i<a.length; i++)
		{
			for(int j = 0; j<a.length-i; j++){
				
				if(a[j]>a[j+1]) {
					flag = true;
					t = a[j+1];
					a[j+1] = a[j];
					a[j] = t;
				}
			}
			if(!flag) break;
			else flag = false;
		}
		*/
		
		//�������� §��
		pass = 1;
		do {
			flag = false;
			for(int i = 0; i<a.length-pass; i++) {
				if(a[i]>a[i+1]) {
					t = a[i]; a[i] = a[i+1]; a[i+1]=t;
					flag = true;
				}
			}
			pass++;
		}while(flag);
		

		System.out.print("Sort data : ");
		for(int n : a)
			System.out.print(n+" ");
		System.out.println();
		
	}
}
