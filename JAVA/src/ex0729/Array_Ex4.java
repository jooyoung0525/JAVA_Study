package ex0729;

public class Array_Ex4 {
	public static void main(String[] args) {
	
		int a[] = new int[3]; //Heap����
		a[0] = 10; a[1]=20; a[2]=30;
		
		//�迭�� ���۷��� �������̴�.
		int b[] = a;
		b[1]=100; b[2]=200;
		
		System.out.println("a�迭...");
		for(int n : a) { 
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.println("\nb�迭...");
		for(int n : b) { 
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
