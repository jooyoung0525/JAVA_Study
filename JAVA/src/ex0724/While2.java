package ex0724;

public class While2 {
	public static void main(String[] args) {
		
		/*
		 * Â¦¼ö ÇÕ 
		 * 
		    int s,n;
			s = 0; n = 0;
			
			while(n<100) {
				n+=2;
				s+=n;
			}
			
			System.out.println("Â¦¼ö ÇÕ: "+s); //2550
		
		*/
		
		/* 
		 * È¦¼ö ÇÕ 1) 
		 
		//È¦¼ö : 1 3 ... 97 99
		    
		    int s,n;
			s = 1; n = 1;
			
			while(n<99) {
				n+=2;
				s+=n;
			}
			
			System.out.println("È¦¼ö ÇÕ: "+s); //2500
		*/
		
		
		/*
		 * È¦¼ö ÇÕ 2)
		
		    int s,n;
			s = 0; n = 1;
			
			while(n<100) {
				s+=n;
				n+=2;
			}
			
			System.out.println("È¦¼ö ÇÕ: "+s); //2500
		*/
		 
		
		int n = 0;
		while(true) {
			n++;
			System.out.println(n);
			if(n>=10) break; //while¹®À» ºüÁ®³ª°¨
		}
	}
}
