package ex0807_OtherAPI_Ingeritance;

import java.text.NumberFormat;


public class NumberFormatClass2 {
	public static void main(String[] args) {
		
		try {
			NumberFormat nf = NumberFormat.getInstance();
			String s1,s2;
			Number n1 = nf.parse("1000"); //wrapperclass�� �ֻ��� ->NumberClass
			System.out.println(n1);
			//System.out.println(n1+20); //������ ���� -> �������
			
			//Double d = (Double)nf.parse("2000"); ������ ����
			Double d = (Double)nf.parse("2000.1");
			 //parse() �޼ҵ��� ���� Ÿ���� Number
			 //Double�� Number�� ��� ����
			 //�ٿ�ĳ������ ���� ������ Double ��ü�� ��ȯ �Ұ�
			
			System.out.println(d);
			System.out.println(d+20); 
			
			Long l = (Long)nf.parse("2000");
			//Double l = (Double)nf.parse("2000");//��Ÿ�ӿ���
			//Integer i = (Integer)nf.parse("2000"); //��Ÿ�ӿ���
			System.out.println(l);
			
			s1 ="1,234";
			s2 ="3,500";
			//long x = Long.parseLong(s1); //��Ÿ�ӿ��� -> �޸������� ���ڷ� ���ٲ�
			
			Long x = (Long)nf.parse(s1);
			Long y = (Long)nf.parse(s2);
			System.out.println(x+y);
			
			s1 = s1.replaceAll(",", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
