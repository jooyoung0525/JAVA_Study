package ex0724;

public class While2 {
	public static void main(String[] args) {
		
		/*
		 * ¦�� �� 
		 * 
		    int s,n;
			s = 0; n = 0;
			
			while(n<100) {
				n+=2;
				s+=n;
			}
			
			System.out.println("¦�� ��: "+s); //2550
		
		*/
		
		/* 
		 * Ȧ�� �� 1) 
		 
		//Ȧ�� : 1 3 ... 97 99
		    
		    int s,n;
			s = 1; n = 1;
			
			while(n<99) {
				n+=2;
				s+=n;
			}
			
			System.out.println("Ȧ�� ��: "+s); //2500
		*/
		
		
		/*
		 * Ȧ�� �� 2)
		
		    int s,n;
			s = 0; n = 1;
			
			while(n<100) {
				s+=n;
				n+=2;
			}
			
			System.out.println("Ȧ�� ��: "+s); //2500
		*/
		 
		
		int n = 0;
		while(true) {
			n++;
			System.out.println(n);
			if(n>=10) break; //while���� ��������
		}
	}
}
