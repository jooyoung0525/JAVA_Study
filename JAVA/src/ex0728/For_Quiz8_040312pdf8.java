package ex0728;

public class For_Quiz8_040312pdf8 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		for(int a = 1; a<=10; a++)
		{
			for(int b = 1; b<=10; b++)
			{
				for(int c = 1; c<=10; c++)
				{
					if((a*a) + (b*b)  == (c*c))
					{
						cnt++;
						System.out.println("a="+a+", b="+b+", c="+c);
					}
				}
			}
		}
		
		System.out.println("전체개수 : "+cnt);
	}
}
