package ex0728_Break_Continue_Return;

public class Quiz3_ThreeSixNine {
	
	
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++)
		{
			/*
			if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i/10 == 3 || i/10 == 6 || i/10 == 9)
				System.out.printf("%5c",'*');
			else
				System.out.printf("%5d",i);
			
			if(i%10 == 0)
				System.out.println();
			*/
			
			
			//¼±»ý´Ô ¹æ¹ý
			int cnt = 0;
			
			if(i%10 >=3 && (i%10)%3 == 0)
				cnt++;
			if(i/10 >=3 && (i/10)%3 == 0)
				cnt++;
			
			if(cnt>=1)
				System.out.printf("%5c",'*');
			else 
				System.out.printf("%5d",i);
			
			if(i%10 == 0)
				System.out.println();
			
			
		}
	}
}
