package ex0727;

public class Quiz5_MinSum {
	public static void main(String[] args) {
		
		int hap, n;
		
		hap = n = 0;
		
		while(hap < 101)
		{
			n++;
			hap+=n;
		}
		
		System.out.println("최소의 n :"+n);
		System.out.println("합 : "+hap);
	}
}
