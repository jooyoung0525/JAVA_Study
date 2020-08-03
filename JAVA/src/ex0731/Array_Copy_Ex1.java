package ex0731;

public class Array_Copy_Ex1 {
	public static void main(String[] args) {
		
		//String 배열은 초기화 하지 않으면 null로 초기화
		String []s1 = new String[] {"java","oracle","spring"};
		String []s2 = new String[s1.length+3]; //방6개
		
		System.arraycopy(s1, 0, s2, 1, s1.length-1);
		
		
		System.out.print("a 배열: ");
		for(String n :s1) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.print("b 배열: ");
		for(String n : s2) {
			System.out.print(n+" ");
		}
	}
}
