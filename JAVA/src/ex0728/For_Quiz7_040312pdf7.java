package ex0728;

public class For_Quiz7_040312pdf7 {
	public static void main(String[] args) {
		
		
		for(int i = 1; i<=9; i++)
		{
			int cnt = 0;
			for(int j = 2; j<=5; j++)
			{
				cnt++;
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				if(cnt%4 == 0)System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 1; i<=9; i++)
		{
			int cnt = 0;
			for(int j = 6; j<=9; j++)
			{
				cnt++;
				System.out.printf("%d * %d = %d\t",j,i,i*j);
				if(cnt%4 == 0)System.out.println();
			}
			
		}
	}
}
