package ex0807_OtherAPI_Ingeritance;

import java.text.MessageFormat;

public class ChoiceFormatClass {
	public static void main(String[] args) {
		String s = "�̸� :{0}\t��ȭ:{1}\t����:{2}";
		Object[] objs = {"�ڹ�","010",20};
		
		String result = MessageFormat.format(s, objs); 
		System.out.println(result);
	}
}
