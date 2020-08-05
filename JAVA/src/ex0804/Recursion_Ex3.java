package ex0804;

public class Recursion_Ex3 {
	public static void main(String[] args) {
		
		User9 u = new User9();
		double a;
		
		a = u.pow(2,10); //1024
		System.out.println(a);
		
		
		a = u.pow(2,-2); //0.25
		System.out.println(a);
		
		
		System.out.println((u.gcd(12, 16))); //4
		
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%3d",u.fibo(i));
		}
		System.out.println();
	}
}



class User9{
	
	
	//a�� b�� ���ϱ�	
	/*
	public double pow(int a, int b) {
		return b>1 ? a*pow(a,b-1) : a; //2�� -2���� �ȵ� 
	}*/
	
	public double pow(int a, int b) {
		if(b>=0) {
			return b>0 ? a*pow(a,b-1) : 1;
		}
		else {
			return (1.0/a)*pow(a,b+1); // 1/a�� ����ߴ���
		}
	}
	
	
	
	//�ִ����� ���ϱ�
	public int gcd(int a, int b) {
		return b==0?a:gcd(b,a%b);
	}
	
	
	
	
	//�Ǻ���ġ�������ϱ�
	public int fibo(int n) {
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	
}