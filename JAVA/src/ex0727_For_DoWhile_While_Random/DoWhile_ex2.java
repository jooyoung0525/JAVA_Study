package ex0727_For_DoWhile_While_Random;

public class DoWhile_ex2 {
	public static void main(String[] args) {
		
		 	/*
			int n,s;
			n = s = 0;
			while(n<10) {
				n++;
				s+=n;
			}
			System.out.println("���: " +s);
			*/
		
		 	//���� ����� ���� �ڵ带  do~while��
			int n, s;
			n = s = 0;
			do {
				n++;
				s+=n;
			}while(n<10);
			System.out.println("���:"+s);
			
			//���׿����� �̿�
			s += (n%2==1?n:-n);
			
	}
}
