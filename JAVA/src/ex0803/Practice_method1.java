package ex0803;

public class Practice_method1 {
	public static void main(String[] args) {

		// ��ü ����
		User1 u = new User1();
		// �����ڴ� new�������� ȣ�Ⱑ��
		// �����ڴ� ��ü �����Ҷ����� ȣ���Ѵ�
		// �����ھȿ����� �ʵ带 �ʱ�ȭ�ϴ� �ڵ带 ����Ѵ�

		int a;
		// a=u.sum(10);
		// System.out.println(a);

		// a = u.sum2(10, 1);
		// System.out.println(a);

		 a = u.odd(10);
		 System.out.println(a);

		System.out.println(u.isUpper('a')); // false
		System.out.println(u.isUpper('D')); // true
		System.out.println();

		System.out.println(u.lower('D'));
		System.out.println();
		
		System.out.println(u.ascii('c'));
		System.out.println();
		
		System.out.println(u.ascii_to_char(65));
		System.out.println();
		
		// void�޼ҵ�� ����� �ǵ��� ���� �ʴ´�.
		u.gugu(3);
		System.out.println();
		
		u.triangle(5);
		System.out.println();
		
		System.out.println(u.grade(101));
		System.out.println();
		
		int []ss = u.random(10);
		System.out.print("\n����: ");
		for(int i = 0; i<ss.length; i++)
			System.out.print(ss[i]+" ");
		System.out.println();
		
		System.out.println(u.hak(86));
		System.out.println();
	}
}

//�޼ҵ� �ۼ� ����!
class User1 { // class ���� �̸��� �빮��

	public int sum(int n) { // �޼ҵ� �����̸��� �ҹ���
							// n:�Ű�����(���μ� -> �޴� �Ű�����)

		int s = 0; // ��������. �޼ҵ带 ȣ���� �� �޸� �Ҵ��� �ް�, �޼ҵ带 ���������� �����.

		for (int i = 1; i < n; i++) {
			s += i;
		}

		return s;
	}

	// �Ű������� 2���� ��� : ������ �ڷ����̶� ������ ���� �ڷ��� ���
	public int sum2(int a, int b) { // ���������� ū�������� ��
		int s = 0;

		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}

		for (int i = a; i <= b; i++) {
			s += i;
		}

		return s;
	}

	// 1~n���� Ȧ���� ���ϴ� �޼ҵ� �ۼ�(odd)
	public int odd(int n) {
		int s = 0;
		for (int i = 1; i <= n; i += 2)
			s += i;
		return s;
	}

	// � ���ڰ� �빮���̸� true, �׷��� ������ false (isUpper)
	public boolean isUpper(char ch) {

		return ch >= 'A' && ch <= 'Z';
		// if(ch <= 'A' && ch>='Z') return true;
		// else return false;
	}

	// � ���ڰ� �빮���̸� �ҹ��ڷ� ��ȯ�ϰ� �׷��� ������ ���޹��� ���ڸ� �׷��� ��ȯ : lower
	public char lower(char ch) {
		return ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;
	}

	// �� ���ڸ� �μ��� �Ѱܹ޾� ������ ascii�ڵ� ��ȯ (ascii)
	public int ascii(char ch) {
		return ch;
	}

	// ascii�ڵ带 �μ��� �Ѱ� �޾� �ڵ忡 ���� ���ڹ�ȯ
	public char ascii_to_char(int a) {
		return (char) a;
	}

	// 1~9������ ���ڸ� �μ��� �Ѱܹ޾� �ش��ϴ� �������� ���
	// ��, ���� 1~9���̰� �ƴ϶�� �ƹ��͵� ������� �ʴ´�.
	public void gugu(int n) {

		if (n < 1 || n > 9)
			return; // �޼ҵ� ���� Ÿ���� void�� ��� ��������

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", i, n, (i * n));

		}
	}

	public void triangle(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
		
   //������ ���� ���� (95~100 : 4.5, 90~94 : 4.0 , ..., 0~ 59 : 0 , ������ :-1)
		//grade (double��)
		
	public double grade(int s)
	{
		double a = -1;
		
		if(s < 0 || s>100) return a;
		
		if(s>=95) a = 4.5;
		else if(s>=90) a = 4.0;
		else if (s >= 85) a = 3.5;
		else if(s >= 80)a = 3.0;
		else if(s >= 75) a = 2.5;
		else if(s >= 70) a = 2.0;
		else if(s >= 65) a = 1.5;
		else if(s >= 60) a = 1.0;
		else if(s>=0) a = 0;
		
		return a; //��ȯ �ϳ�
	}
	
	
	// ������ �Ű������� �Ѱ� �޾� 1~100 ������ 
    // ������ �Ű�����������ŭ ��ȯ --> **��ȯ ������ ������ �� ��!!!!!** --> �迭!!!
	public int[] random(int n) {
		int [] nn = null; //�޸� �Ҵ��ؾ���

		nn = new int[n];
		
		for(int i = 0; i<n; i++)
			nn[i] = (int)(Math.random()*100)+1;
		
		return nn; //�迭�� ����!!! --> �迭�� �ּҸ� ���Ͻ�Ŵ
	}
	
	
	//������ ���� ���� 
	//95~100 : A+ , 90~94 : A, .....0~59 : F
	public String hak (int n) {
		
		String h = null;
		
		if(n>= 95 && n<=100) h="A+";
		else if(n>= 90 && n<95)h="A";
		else if(n>= 85 && n<90)h="B+";
		else if(n>= 80 && n<85)h="B";
		else if(n>=75 && n<80)h="C+";
		else if(n>=70 && n<75)h="C";
		else if(n>=65 && n<70)h="D+";
		else if(n>=65 && n<60)h="D";
		else if(n<60) h="F";		

		return h;
	}
	
}
