package ex0731_Class;

public class Array_CopyMethod {
	public static void main(String[] args) {
		
		
		int []a= new int[]{10,20,30}; //�迭���� �ʱⰪ ������ �ʱⰪ�� ������ ��!
		int []b = new int[a.length];
	
		//a�迭�� ���� b�迭�� �� ����
		System.arraycopy(a, 0, b, 0, a.length); //����,�����ϰ���� ������ġ,������,������ ��𼭺��� ������,������Ұ���
		
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
