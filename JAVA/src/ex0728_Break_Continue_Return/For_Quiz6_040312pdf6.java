package ex0728_Break_Continue_Return;

public class For_Quiz6_040312pdf6 {
	public static void main(String[] args) {
		for(int i = 4; i<=1000; i++)
		{
			int hap = 1;
			for(int j = 2; j<i; j++)
			{
				if(i%j == 0)
					hap+=j;
			}
			if(hap==i) System.out.printf("%d ",i);
		}
	}
}
