package ex0807;

import java.util.Random;
import java.util.Scanner;

public class MathClass_Quiz1 {
	public static void main(String[] args) {
			//1~100 사이의 난수를 발생하여 20번안에 맞추기
		    Random r = new Random();
			Scanner sc = new Scanner(System.in);
			
			boolean flag = false;
		    int com = r.nextInt(101)+1;
			int myNum=0;
			System.out.println("난수 : "+com);
			
			for(int i = 0; i<10; i++) {
				System.out.print("수 ?");
				myNum = sc.nextInt();
				
				if(com > myNum) {
					System.out.println(com+":"+myNum+"보다 큰수입니다.");
				}
				else if(com < myNum) {
					System.out.println(com+":"+myNum+"보다 작은수입니다.");
				}
				else {
					System.out.println("정답입니다.");
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				System.out.println("정담은 : "+com+"입니다.");
			}
			
			sc.close();
	}
}
