package ex0728;

import java.util.Scanner;

public class Quiz1_RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*3)+1; //1:가위 2:바위 3:보
			int user;
			
			do {
				System.out.print("1.가위  2.바위  3.보  4.게임종료  =>");
				user = sc.nextInt();
			}while(user<1 || user>4);
			
			if(user == 4)
			{
				System.out.println("게임종료...");
				break;
			}
			
			System.out.println("당신 : " + ((user == 1)?"가위":(user == 2?"바위":"보")));
			System.out.println("컴퓨터 : " + ((com == 1)?"가위":(com == 2?"바위":"보")));
			
			if(user == 1)
				System.out.println(com == 1?"비겼습니다.":(com==2?"당신이 졌습니다.":"당신이 이겼습니다."));
			
			else if(user == 2)
				System.out.println(com == 1?"당신이 이겼습니다.":(com==2?"비겼습니다.":"당신이졌습니다."));
	
			else if(user == 3)
				System.out.println(com == 1?"당신이 졌습니다.":(com==2?"당신이 이겼습니다.":"비겼습니다."));
		}
		
		sc.close();
	}
}
