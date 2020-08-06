package ex0728_Break_Continue_Return;

public class For_Quiz4_040312pdf4 {
	public static void main(String[] args) {
		
		int hap = 0;
		for(int i = 1; i<=10; i++)
		{
			if(i%2==0) {
				hap-=i;
				System.out.printf("- %d ",i);
			}
			else {
				hap+=i;
				if(i>1)
					System.out.printf("+ %d ",i);
				else
					System.out.printf(" %d ",i);
			}
		}
		
		System.out.printf("= %d",hap);
	}
}
