package ex0803;

public class Ex1 {
	public static void main(String[] args) {

	}
}


class User1{ //class ���� �̸��� �빮��
	
	public int sum(int n) {  //�޼ҵ� �����̸��� �ҹ��� 
	                         //n:�Ű�����(���μ� -> �޴� �Ű�����)
		
		int s=0; //��������. �޼ҵ带 ȣ���� �� �޸� �Ҵ��� �ް�, �޼ҵ带 ���������� �����.
		
		for(int i = 1; i<n; i++) {
			s+=i;
		}
		
		return s;
	}
}