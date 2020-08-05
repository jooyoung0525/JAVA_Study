package ex0805;

public class API_String3 {
	public static void main(String[] args) {
		
		
			String s = "seoul korea"; 
			String s1;
			
			System.out.println("s:"+s);
			
			int a = s.length();
			System.out.println("¹®ÀÚ¿­ ±æÀÌ : "+a);
		
			
			
			
			//<<substring>>
			s1 = s.substring(6,9); //s.substring(a,b) : a¹øÂ° ÀÎµ¦½º¿¡¼­ b-1±îÁöÀÇ ¹®ÀÚ¿­À» ÃßÃâ
								   //ÀÎµ¦½º´Â ¹«Á¶°Ç 0ºÎÅÍ ½ÃÀÛ
			System.out.println(s1); //kor
			
			s1 = s.substring(6,6);
			System.out.println(s1); //¾Æ¹«°ÍµµÃâ·Â¾ÈÇÔ
			
			s1 = s.substring(6); // korea : 6¹øÂ° ÀÎµ¦½ººÎÅÍ ³¡±îÁö
			System.out.println(s1);
			
			//s1 = s.substring(6,5); //·±Å¸ÀÓ ¿À·ù
			
			
			
			
			
			//<<charAt()>>
			char c = s.charAt(6); // k: 6¹øÂ° ÀÎµ¦½º¿¡ ÀÖ´Â ÇÑ ¹®ÀÚ¸¦ Ãâ·Â
			System.out.println(c);

			
			
			
			//<<equals()>>
			boolean b;
			b = s.equals("seoul korea"); //°ªºñ±³
			System.out.println(b);       //true
			
			b = s.equals("Seoul Korea"); 
			System.out.println(b);       //false
			
			
			
			
			//<<equalsIgnoreCase>>
			//´ë¼Ò¹®ÀÚ ±¸ºĞ ¾ÈÇÔ
			b = s.equalsIgnoreCase("Seoul KOREA"); 
			System.out.println(b);      //true
			
			System.out.println(s.equals("seoul")); //false
			
			
			
			
			//<<startsWith(), endsWith()>>
			System.out.println(s.startsWith("seoul")); //true --> ¾Õ¿¡ ¹®ÀÚ¿­¸¸ ºñ±³
			System.out.println(s.endsWith("korea")); //true --> µÚ¿¡ ¹®ÀÚ¿­¸¸ ºñ±³
			
			
			
			
			//<<compareTo()>>
			// "seoul korea" >> "seoul ccatstststs"(»çÀü½Ä ¹è¿­)
			// System.out.println( s> "seoul ccatstststs"); ÄÄÆÄÀÏ ¿À·ù
			// ¹®ÀÚ¿­ÀÇ ºñ±³
			System.out.println(s.compareTo("seoul ccatstststs")); // 8 --> k(107)- c(99)
			                                                      // »çÀü½ÄÀ¸·Î 
			
			
			//<<indexOf()>>
			//korÀÇ À§Ä¡(ÀÎµ¦½º)?
			System.out.println(s.indexOf("kor"));//6
			System.out.println(s.indexOf("abc"));//-1 : Ã£´Â ¹®ÀÚ¿­ÀÌ ¾øÀ¸¸é
			
			System.out.println(s.indexOf("o")); //2 Ã£´Â ¹®ÀÚ°¡ ¸¹À¸¸é Ã³À½°ª ¸®ÅÏ
			System.out.println(s.indexOf("o",5)); //5¹øÂ° ÀÎµ¦½º ºÎÅÍ "o"ÀÖ´ÂÁö °Ë»ç --> 7
			
			System.out.println(s.lastIndexOf("o")); //µÚ¿¡¼­ ºÎÅÍ "o"Ã£¾Æ¼­ ÇØ´çÀÎµ¦½º ¸®ÅÏ
			
			
			
			
			
			//<<replace()>>
			//replace : Á¤±Ô½Ä(ÆĞÅÏ) »ç¿ëºÒ°¡
			s = "¿ì¸®³ª¶ó ´ëÇÑ¹Î±¹ ´ëÇÑ ´ëÇÑ ÇÏÇÏ";
			s1 = s.replace("´ëÇÑ", "ÓŞùÛ");
			System.out.println(s1); //¿ì¸®³ª¶ó ÓŞùÛ¹Î±¹ ÓŞùÛ ÓŞùÛ ÇÏÇÏ
			
			
			
			//<<replaceAll()>>
			//replaceAll : Á¤±Ô½Ä »ç¿ë
			s1 = s.replaceAll("´ëÇÑ", "ÓŞùÛ"); 
			System.out.println(s1); //¿ì¸®³ª¶ó ÓŞùÛ¹Î±¹ ÓŞùÛ ÓŞùÛ ÇÏÇÏ
			
	
			//°ø¹éÀÌ¶û ¼ıÀÚ¾ø¾Ö±â
			s = "´ëÇÑ 123 ¹Î±¹ ÇÏÇÏ 5678 È£È£";    
			s1 = s.replaceAll("\\d|\\s", ""); // Á¤±Ô½Ä¿¡¼­ ¼ıÀÚ:\\d, ¶Ç´Â:|, ¿£ÅÍ¿Í ÅÇÀ» Æ÷ÇÔÇÑ °ø¹é:\\s
			System.out.println(s1); //´ëÇÑ¹Î±¹ÇÏÇÏÈ£È£
			
			
			//ÇÑ±Û¸¸ ¾ø¾Ö±â
			s = "´ëÇÑ 123 ¹Î±¹ ÇÏÇÏ 5678 È£È£";     
			s1 = s.replaceAll("[°¡-ÆR]", ""); // ´ë°ıÈ£ÇÏ°í °¡~ÆR±îÁö
			System.out.println(s1); // 123   5678 
			
			
			
			
			//<<trim()>>
			//trim():°¡Àå¿ŞÂÊ°ú °¡Àå¿À¸¥ÂÊÀÇ °ø¹éÁ¦°Å
			s = "    »ç  ¶û  ";
			System.out.println(":"+s+":");
			System.out.println(":"+s.trim()+":");
			System.out.println(":"+s.replaceAll("\\s","")+":");
			
			
			
			
			//<<format()>>
			//3ÀÚ¸®¸¶´Ù , ÇÏ°í stringÀ¸·Î º¯°æ
			a=123456;
			s = String.format("%,d", a); //printf¿Í »ç¿ë¹æ¹ı µ¿ÀÏ
			System.out.println(s);
			
			
			
			//<<split()>>
			//split
			String tel = "010-1111-2222";
			String[] ss = tel.split("-"); //splitÀº ¹è¿­·Î ¹İÈ¯
			for(String x:ss)
				System.out.print(x+" ");
			System.out.println();
			
			
			
			//<<getBytes()>>
			//getBytes
			s = "KOREA";
			byte[] bb = s.getBytes(); //ÇØ´çµÇ´Â ¹®ÀÚÀÇ ¾Æ½ºÅ°°ªÀ» ¹è¿­·Î ¹İÈ¯
			for(int x : bb)
				System.out.print(x+" ");
			System.out.println();
	}
}
