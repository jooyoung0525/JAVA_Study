package ex0731;

public class Array2d_Copy_Ex1 {
	public static void main(String[] args) {
		
		int [][]a = {{10,20,30},{40,50,60}};
		int [][]b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, a.length);
		//2�����迭���� arraycopy�� �ϸ� �ּ�(2��)�� �����.
		
		
		
		//���
		System.out.print("a �迭: ");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
		}
		System.out.println();
		
		System.out.print("b �迭: ");
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++)
				System.out.print(b[i][j]+" ");
		}
		System.out.println();
		
		
		
		
		b[1][1] = 200;
		System.out.println(a[1][1]+","+b[1][1]); //200,200
		//2���� �迭�� ����� ���� ���簡 �ȴ�.
		
	}
}
