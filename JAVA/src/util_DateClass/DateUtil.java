package util_DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	
	/**
	 * ���� ��¥�� ����° �Ǵ� ���� ���ϴ� �޼ҵ�
	 * @param strDate ���س�¥
	 * @param days ����° �Ǵ� ���� ����� ����
	 * @return     �������� ��¥
	 */
	public String toDaysLater(String strDate, int days) {
		String result = null;
		
		try {
			strDate = strDate.replaceAll("(\\.|\\-|/)", "");
			int y = Integer.parseInt(strDate.substring(0,4));
			int m = Integer.parseInt(strDate.substring(4,6));
			int d = Integer.parseInt(strDate.substring(6,8));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y,m-1,d);
			
			cal.add(Calendar.DATE, days);
			
			//���1
			result = String.format("%tF", cal);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * Ư�� ��¥�� ���� ��¥�� ���ϴ� �޼ҵ�
	 * @param strDate Ư����¥ //2020-12-31 
	 * @return Ư����¥�� ������¥ //2021-1-1
	 */
	public String afterDays(String strDate) {
		String result = null;
		
		result = toDaysLater(strDate,1);
		return result;
	}
	
	
	public String beforeDays(String strDate) {
		String result = null;
		
		result = toDaysLater(strDate,-1);
		return result;
	}
	
	
	
	/*//�ֹι�ȣ �˻�
	 * 234567 892345
	 * 950525-222399 9
	 * tot = 2*9 + 3*5 +....
	 * n = 11 - tot%11 >> 1~11
	 * n = n%10; //0~9
	 *
	 *��������ȣ��, n�� ������ �´¹�ȣ
	 * */
	
	/**
	 * �ֹι�ȣ üũ
	 * @param rrn �ֹι�ȣ
	 * @return �ֹι�ȣ�� �´��� Ʋ���� true,false�� ����
	 */
	public boolean isRrnCheck(String rrn) {
		boolean result = false;
		
		int[] check = new int[] {2,3,4,5,6,7,8,9,2,3,4,5};
		int tot,n,lastNum,chkNum;
		
		rrn=rrn.replaceAll("\\-","");
		if(rrn.length()!=13) return result;
		
		
		tot = 0;
		for(int i = 0; i<12; i++) {
			n = Integer.parseInt(rrn.substring(i,i+1));
			tot += (n*check[i]);
		}
		
		lastNum = Integer.parseInt(rrn.substring(12));
		chkNum = 11-tot%11;
		chkNum = chkNum%10;
		
		result = lastNum == chkNum;
		
		return result;
	}
	
	
	/**
	 * ��¥������ �ùٸ��� üũ�ϴ� �޼ҵ�
	 * @param strDate
	 * @return
	 */
	public boolean isDateCheck(String strDate) {
		boolean result = false;
		Calendar sdf = Calendar.getInstance();
	
		try {
			strDate = strDate.replaceAll("(\\.|\\-|/)", "");
			int y = Integer.parseInt(strDate.substring(0,4));
			int m = Integer.parseInt(strDate.substring(4,6));
			int d = Integer.parseInt(strDate.substring(6,8));
			
			if(strDate.length()!=8)return result;
			if(y>=00&&y<=99) {
				if(m>=1 && m<=12) {
					int lastd = sdf.getActualMaximum(Calendar.DATE);
					if(d>=1 && d<=lastd) {
						result = true;
						return result;
					}
				}
			}
			
			
			/*
			 * �Է¹��� ���� Ķ������ �ְ� �ٽ� �������� ��, �Է¹������� ������ ������¥
			 * sdf.set(y,m-1,d);
			 * result = cal.get(Calendar.YEAR)==y && cal.get(Calendar.MONTH)+1 ==m && cal.get(Calendar.DATE)==d
			 * 
			 * */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
