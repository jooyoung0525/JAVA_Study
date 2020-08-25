package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass_FindLiveDate {
	public static void main(String[] args) {
		//���� �ý����� ��¥�� ��ü ����
		Date date = new Date();
		System.out.println(date); //�̱���
		
		//1970.1.1 0:0:0 ���ĺ��� �ð��� ms�� ȯ��
		System.out.println(date.getTime());
		
		
		
		/* <<����� �������� ����>>
		//getYear: �ٸ��� ����� �ڹٿ��� ���!!
		int y = date.getYear()+1900;
		int m = date.getMonth()+1;
		int d = date.getDate();
		System.out.println(y+"-"+m+"-"+d); //120-7-6 (�⵵+1900)
		*/
		
		//1970.1.1 0:0:0�ʸ� �������� �и��� ����Ͽ� �� ����� ��¥�� ȯ��
		Date date2 = new Date(11250340568L);
		System.out.println(date2);
		
		
		//date�� date2���� ���� ��¥�̸� true
		System.out.println(date.after(date2));
		
		
		//Date ��ü�� ���� String���� ��ȯ�Ͽ� ����ϱ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss");
		String s;
		s = sdf.format(date2); // Date -> String
		System.out.println(s);
		
		try {
			//1993-04-25���ڿ��� Date������ ��ȯ
			String ss ="1992-01-10";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			//parse :  String -> Date�� ��ȯ
			Date date3 = sdf2.parse(ss); //������ ����. -> parse�� �ݵ�� ����ó���ʿ�
			//System.out.println(date3); // Sun Apr 25 00:00:00 KST 1993
			
			Date sdate = new Date(); //���� ��¥
			long diff = sdate.getTime()- date3.getTime();
			diff = diff / (24*60*60*1000); //�Ϸ�,��,��,�� ����
			System.out.println("���찡 ���ñ��� �� ��¥: "+diff);
			
			
			
		}catch (Exception e) {
			//���ܰ� �߻��ϴ� ��� �� �� ���� ������ ����
			e.printStackTrace();
		}
	}
}
