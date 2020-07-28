package ex0728;

public class For_Quiz3_040312pdf3 {
	public static void main(String[] args) {
		
		
		for(int a = 1; a < 10; a++){
			for(int b = 1; b<10; b++){
				for(int c = 1; c<10; c++){
					if(a+b+c == 25)
					{
						System.out.printf("%d+%d+%d=%d\n",a,b,c,a+b+c);
					}
				}
			}
		}
		
		
	}
}
