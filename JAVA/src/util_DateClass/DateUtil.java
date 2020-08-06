package util_DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

//����ó���� ��� �� �����ؾ���.
public class DateUtil {
	
	/**
	 * ���ڿ��� ��¥�� Date������ ��ȯ�ϴ� �޼ҵ�
	 * @param strDate Date������ ������ ���ڿ��� ��¥
	 * @return ���ڿ��� Date��ü�� ����� ��ü
	 */
	public Date toDate(String strDate) {
		Date date = null;
		
		try {
			strDate = strDate.replaceAll("(\\-|\\.|/)",""); //���Խ� �ȿ� ���� ����� . - �̱� ������ ���ڶ�� ���
			
			if(strDate.length()!=8) {
				return null;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			date = sdf.parse(strDate);
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return date;
	}
	
	
	
	/**
	 * Date���� String ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ
	 * @param date ���ڿ��� ��ȯ��  Date��ü
	 * @return ���ڿ��� ��ȯ�� ��¥
	 */
	public String toString(Date date) {
		String s = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s = sdf.format(date);
		
		return s;
	}
	
	
	/**
	 * �� ��¥ ������ ����(endDate-startDate)�� ���ڷ� ��ȯ
	 * @param startDate
	 * @param endDate
	 * @return ��¥������ ����
	 */
	public int toDiffDays(String startDate, String endDate) {
		int diff = 0;
		
		try {
			startDate = startDate.replaceAll("(\\-|\\.|/)", "");
			endDate = endDate.replaceAll("(\\-|\\.|/)", "");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date begin = sdf.parse(startDate);
			Date end = sdf.parse(endDate);
			
			//��ü�� ����ȯ�ϴ� ������ 50��/(1000*60*60*24)�ϸ� ũ�Ⱑ Ȯ �پ ������ ����
			diff = (int)((end.getTime()-begin.getTime()) / (1000*60*60*24));
			
			/*
			diff = ((int)(end.getTime()-begin.getTime()) / (1000*60*60*24));
			==> �������� ����
			    end.getTime()-begin.getTime() ==> 50 ���̶�� �ϸ� int������ �ѱ⶧���� ©������
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return diff;
	}
}
