package ex0727;

public class For_ex2 {
	public static void main(String[] args) {
		
		/*
		int n,s;
		s = 0;
		
		for(n = 1; n<=10; n++) //n=11�̵ǰ� ���ǿ� �������� ���� for���� ��������!
			s+=n;
		
		System.out.println(n+","+s);*/
		
		
		/*
		<<¦�� ��>>
	
				int n,s;
		s = 0;
		
		for(n = 1; n<=10; n+=2) 
			s+=n;
		
		System.out.println(n+","+s);*/
		
		
		
		int n,s;
		for(n = 1, s = 0; n <=10; s+=n, n++) //�̷��� ¥�� ������ �򰥸��� �κ��� ���� ������ �������� ����
			;
		
		System.out.println(n+","+s);
		
		
	}
}
