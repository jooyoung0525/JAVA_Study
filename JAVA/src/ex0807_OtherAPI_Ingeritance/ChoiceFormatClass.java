package ex0807_OtherAPI_Ingeritance;

import java.text.MessageFormat;

public class ChoiceFormatClass {
	public static void main(String[] args) {
		String s = "이름 :{0}\t전화:{1}\t나이:{2}";
		Object[] objs = {"자바","010",20};
		
		String result = MessageFormat.format(s, objs); 
		System.out.println(result);
	}
}
