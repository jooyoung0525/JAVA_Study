package ex0731;

public class Array_Copy_Ex1 {
	public static void main(String[] args) {
		
		//String �迭�� �ʱ�ȭ ���� ������ null�� �ʱ�ȭ
		String []s1 = new String[] {"java","oracle","spring"};
		String []s2 = new String[s1.length+3]; //��6��
		
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		
		
		System.out.print("a �迭: ");
		for(String n :s1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.print("b �迭: ");
		for(String n : s2) {
			System.out.print(n+" ");
		}
	}
}
