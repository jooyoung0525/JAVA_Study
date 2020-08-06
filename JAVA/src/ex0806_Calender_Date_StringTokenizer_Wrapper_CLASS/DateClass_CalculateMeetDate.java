package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass_CalculateMeetDate {
	public static void main(String[] args) {
		
		//�����߿��� Ŭ���̾�Ʈ�� string�����ιۿ� �ۼ����ؼ� �ٲܼ� �־����!!
		//SimpleDateFormat��  Date -> String, String -> Date �����ϰ� ��!
		
		// ���¾��� 2019�� 10�� 5�Ͽ� ����ģ���� ������.
		// 2020-12-25���� �����ϱ�???
		
		try {
			String s = "2019-10-05";
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			Date meet = sd.parse(s); //string -> Date
			
			String e = "2020-12-25";
			SimpleDateFormat ed = new SimpleDateFormat("yyyy-MM-dd");
			Date chris = ed.parse(e); //string -> Date
			
			long diff = chris.getTime() - meet.getTime();
			diff /= (24*60*60*1000);
			
			System.out.println("2020�⵵ Ŭ���������� ��͸� �����ϱ�? :"+diff);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
