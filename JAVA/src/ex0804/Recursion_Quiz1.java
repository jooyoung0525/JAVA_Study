package ex0804;

public class Recursion_Quiz1 {
	public static void main(String[] args) {
		
		User8 uu = new User8();
		uu.print(5);
	}
}


// ���� ������ ��ġ�� 
//   StackOverflowError�� �߻��ϰ� ���α׷� ����
class User8{
	
	public void print(int n) {
		System.out.println("start:"+n);	// 3 2
		print(n-1);
		System.out.println("end:"+n); // 1
	}
	
}