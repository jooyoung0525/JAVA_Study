package ex0727;

public class While_Quiz4_Avg {
	public static void main(String[] args) {
		
		int num, hap, avg, cnt;
		
		num = 0;
		hap = avg = cnt = 0;
		
		while(num < 101) {
			num++;
			if(num % 3 == 0 || num % 5 == 0) {
				hap+=num;
				cnt++;
			}
		}
		
		avg = hap / cnt;
			
		System.out.println("Че : "+hap);
		System.out.println("ЦђБе : "+ avg);
	}
}
