package ex0731;

public class Array_Copy {
	public static void main(String[] args) {
		
		/*
		 * <<�迭�� �ּ� ����>>
		 * a�� b�� �����ϴ� ��ġ�� ����.
		 	int []a = {10,20,30};  --> a : a�迭�� �ּҰ� ����  ex) a: 0x100
		 	int []b;               --> �޸��Ҵ� ���� ���� b: �����Ⱚ 
 		 	b=a;                   --> a�迭 �ּҰ��� b�� ����    ex) b: 0x100    
 		 	b[1] =200;             --> a:200,b:200
		  
		  
		  int []a= new int[]{10,20,30}; //�迭���� �ʱⰪ ������ �ʱⰪ�� ������ ��!
		  int []b;
		  b=a;
 		 */
		
		
		
 		 /*
 		 * <<a�迭�� ���� ���ο� b�迭�� ����>>
 		 * ex) a: 0x100
 		 *     b: 0x200 
		 */
		
		int []a= new int[]{10,20,30}; //�迭���� �ʱⰪ ������ �ʱⰪ�� ������ ��!
		int []b = new int[a.length];
	
		//a�迭�� ���� b�迭�� ����
		for(int i = 0; i<a.length; i++)
			b[i]=a[i];
		
		
		System.out.print("a �迭: ");
		for(int n :a) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.print("b �迭: ");
		for(int n : b) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
}
