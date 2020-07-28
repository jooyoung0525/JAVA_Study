package ex0728;

import java.util.Scanner;

public class Break_Ex1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num,s,ch;
		int start,offset;
		
		while(true) {
			
			
			do {
				System.out.print("1.합  2.짝수합  3.홀수합  4.종료");
				ch = sc.nextInt();
			}while(ch<1||ch>4);
			
			if(ch==4)
				break; //while(true){}를 빠져나감
		
			do {
				System.out.print("수 ? ");
				num = sc.nextInt();
			}while(num<1);
			
			s = 0;
			
			switch(ch) {
				case 1: start = 1; offset = 1; break;
				case 2: start = 2; offset = 2; break;
				default: start = 1; offset = 2; break;
			}
		
			for(int i = start; i<=num; i+=offset) {
				s+=i;
			}
			
			System.out.println("결과 : "+s);
		}
		
		sc.close();
	}

}
