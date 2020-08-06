package ex0804_Constructor_Recursion;

public class Recursion {
	public static void main(String[] args) {
		
		User5 uu = new User5();
		uu.write(5);
	}
}


class User5{
	
	//재귀호출
	//stack에 정보저장 : 5(가장아래) 4 3 2(가장위) (LIFO) -> 1 2 3 4 5 (출력)
	public void write(int n) {
		if(n>1) {
			//System.out.println(n+" ");  // 5 4 3 2
			write(n-1);
		}
		System.out.println(n+" "); 
	}
}