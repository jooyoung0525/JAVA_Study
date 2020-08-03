package ex0803;

public class Practice_method1 {
	public static void main(String[] args) {

		// 객체 생성
		User1 u = new User1();
		// 생성자는 new다음에만 호출가능
		// 생성자는 객체 생성할때에만 호출한다
		// 생성자안에서는 필드를 초기화하는 코드를 기술한다

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
		
		// void메소드는 결과를 되돌려 받지 않는다.
		u.gugu(3);
		System.out.println();
		
		u.triangle(5);
		System.out.println();
		
		System.out.println(u.grade(101));
		System.out.println();
		
		int []ss = u.random(10);
		System.out.print("\n난수: ");
		for(int i = 0; i<ss.length; i++)
			System.out.print(ss[i]+" ");
		System.out.println();
		
		System.out.println(u.hak(86));
		System.out.println();
	}
}

//메소드 작성 연습!
class User1 { // class 시작 이름은 대문자

	public int sum(int n) { // 메소드 시작이름은 소문자
							// n:매개변수(가인수 -> 받는 매개변수)

		int s = 0; // 지역변수. 메소드를 호출할 때 메모리 할당을 받고, 메소드를 빠져나갈때 사라짐.

		for (int i = 1; i < n; i++) {
			s += i;
		}

		return s;
	}

	// 매개변수가 2개인 경우 : 동일한 자료형이라 할지라도 각각 자료형 기술
	public int sum2(int a, int b) { // 적은수에서 큰수까지의 합
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

	// 1~n까지 홀수합 구하는 메소드 작성(odd)
	public int odd(int n) {
		int s = 0;
		for (int i = 1; i <= n; i += 2)
			s += i;
		return s;
	}

	// 어떤 문자가 대문자이면 true, 그렇지 않으면 false (isUpper)
	public boolean isUpper(char ch) {

		return ch >= 'A' && ch <= 'Z';
		// if(ch <= 'A' && ch>='Z') return true;
		// else return false;
	}

	// 어떤 문자가 대문자이면 소문자로 변환하고 그렇지 않으면 전달받은 문자를 그래도 반환 : lower
	public char lower(char ch) {
		return ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : ch;
	}

	// 한 문자를 인수로 넘겨받아 문자의 ascii코드 반환 (ascii)
	public int ascii(char ch) {
		return ch;
	}

	// ascii코드를 인수로 넘겨 받아 코드에 대한 문자반환
	public char ascii_to_char(int a) {
		return (char) a;
	}

	// 1~9사이의 숫자를 인수로 넘겨받아 해당하는 구구단을 출력
	// 단, 수가 1~9사이가 아니라면 아무것도 출력하지 않는다.
	public void gugu(int n) {

		if (n < 1 || n > 9)
			return; // 메소드 리턴 타입이 void인 경우 생략가능

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
	
		
   //점수에 따른 평점 (95~100 : 4.5, 90~94 : 4.0 , ..., 0~ 59 : 0 , 나머지 :-1)
		//grade (double형)
		
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
		
		return a; //반환 하나
	}
	
	
	// 정수를 매개변수로 넘겨 받아 1~100 까지의 
    // 난수를 매개변수개수만큼 반환 --> **반환 개수가 여러개 일 때!!!!!** --> 배열!!!
	public int[] random(int n) {
		int [] nn = null; //메모리 할당해야함

		nn = new int[n];
		
		for(int i = 0; i<n; i++)
			nn[i] = (int)(Math.random()*100)+1;
		
		return nn; //배열을 리턴!!! --> 배열의 주소를 리턴시킴
	}
	
	
	//점수에 따른 학점 
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
