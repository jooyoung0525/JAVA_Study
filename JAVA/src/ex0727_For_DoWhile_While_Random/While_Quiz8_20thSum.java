package ex0727_For_DoWhile_While_Random;

public class While_Quiz8_20thSum {
	public static void main(String[] args) {
		
		//1 2 4 7 11 .... 
		int num,cnt,all;
	
		all = cnt = 0;
		num = 1; //1 2 4 7 11
		
		while(cnt < 20) {
			cnt++; // 1 2 3 4 5 ... 20
			all+=num; // 1+2+4+...
			num+=cnt; //1 + 1 = 2 + 2 = 4 + 3 = 7....
		}
		
		System.out.println("°á°ú : "+all);
	}
}
