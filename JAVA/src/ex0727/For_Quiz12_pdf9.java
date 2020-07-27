package ex0727;

public class For_Quiz12_pdf9 {
	public static void main(String[] args) {
		
		int beforei = 1;
		int hap = 0;
		
		for(int i = 1; i<=100; i++)
		{	
			hap+=i;
			if(i%10 == 0)
			{
				System.out.println(beforei + " ~ "+ i+" 까지의 합 : "+hap);
				hap = 0;
				beforei = i+1;
			}
		}
	}
}
