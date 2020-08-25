package ex0825;

public class RegularExpression_StringMatches {
	public static void main(String[] args) {
		String regex,s;
		
		//1~3ÀÚ¸® ¼ıÀÚ
		regex = "\\d{1,3}";
		s = "100";
		
		/*
		if(Pattern.matches(regex, s)){
			System.out.println(s+" : 1~3ÀÌ³»ÀÇ ¼ıÀÚ");
		}else {
			System.out.println(s+" : 1~3ÀÌ³»ÀÇ ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.");
		}
		*/
		
		/*
		if(s.matches(regex)){
			System.out.println(s+" : 1~3ÀÌ³»ÀÇ ¼ıÀÚ");
		}else {
			System.out.println(s+" : 1~3ÀÌ³»ÀÇ ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.");
		}
		*/
		
		
		/*
		//ÀüÈ­¹øÈ£
		//regex = "(^010|^017|^016)-(\\d{4}|\\d{3})-\\d{4}$"; //^ :½ÃÀÛ, \\d{4}: ¼ıÀÚ ³×ÀÚ¸®, $ :¸¶Áö¸·
		
		regex = "^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$"; //^01(?:0|1|[6-9]) :01·Î½ÃÀÛ+±×´ÙÀ½ÀÌ 0¶Ç´Â1¶Ç´Â 6~9 
		                                             //\\d{3,4} : ¼ıÀÚÀÎµ¥ 3-4ÀÚ¸®
													 //ÇÑÀÚ¸® ÀÌ»ó :\\d+
		s="017-1234-6566";
		
		if(s.matches(regex)) {
			System.out.println(s+" : Á¤»óÀûÀÎ ÀüÈ­¹øÈ£");
		} else {
			System.out.println(s+ " : Àß¸øµÈ ÀüÈ­¹øÈ£");
		}
		*/
		
		
		/*
		regex ="^[°¡-ÆR]+$"; //À¯´ÏÄÚµå : \uac00-\ud7a3 , +:ÇÑÀÚ¸®ÀÌ»ó
		s="ÀÚ¹Ù¤±";
		if(s.matches(regex))System.out.println(s+" : Á¤»ó");
		else System.out.println(s+" : Àß¸ø");
		*/
		
		
		/*
		//ÀÌ¹ÌÁöÆÄÀÏ°Ë»ç
		regex ="[^\\s]+(\\.(?i)(jpg|png|gif|bmp))$"; 
		s="a.gif1";
		if(s.matches(regex))System.out.println(s+" : Á¤»ó");
		else System.out.println(s+" : Àß¸ø");
		*/
		
		
		
		//¿µ¹®ÀÚ¿Í ¼ıÀÚ ¶Ç´Â Æ¯¼ö¹®ÀÚ¸¦ Æ÷ÇÔÇÑ 5~10ÀÚÀÌ³»
		regex="^(?=.*[a-zA-Z])(?=.*[~!@#$%^&*()]|.*[0-9]).{5,10}$"; //^$:½ÃÀÛ°ú ³¡, .¹¹µçÁö »ó°ü¾øÀ½ , * 0°³ÀÌ»ó
		                                                            //a{5,10} --> a°¡ ÃÖ¼Ò 5°³ ÃÖ´ë10
		s="abc2def";
		if(s.matches(regex))System.out.println(s+" : Á¤»ó");
		else System.out.println(s+" : Àß¸ø");
	}
}
