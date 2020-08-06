package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz6_FindZodiac_pdf1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] animal = new String[] {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
		//원숭이가 12의 배수! -> 0번으로 시작	
		int y;
	
		do {
			System.out.print("년도?");
			y=sc.nextInt();
		}while(y<1900);
	
		System.out.println(y+"년도는 "+animal[y%12]+"띠의 해 입니다.");
	
		
		sc.close();
	}
}
