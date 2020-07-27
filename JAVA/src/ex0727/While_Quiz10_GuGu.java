package ex0727;

public class While_Quiz10_GuGu {
	public static void main(String[] args) {
		
		int dan , num;
		
		dan = 2;
		num = 1;
		
		while(num <= 9) {
			
			while(dan <= 9) {
				
				System.out.printf("%d*%d=%2d\t",dan,num,dan*num);
				dan++;
			}
			dan = 2;
			num++;
			System.out.println();
		} 
	}
}
