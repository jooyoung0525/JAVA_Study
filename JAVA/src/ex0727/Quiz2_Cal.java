package ex0727;

public class Quiz2_Cal {
	public static void main(String[] args) {
		
		int num = 10;
		int s,hap;
		
		s=hap=0;
		
		while(s < num) {
			s++;
			if(s % 2 == 0)
				hap-=s;
			else
				hap+=s;
		}
		
		System.out.println(hap);
	}
}
