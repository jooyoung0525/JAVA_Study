package ex0825;

public class RegularExpression_StringMatches {
	public static void main(String[] args) {
		String regex,s;
		
		//1~3�ڸ� ����
		regex = "\\d{1,3}";
		s = "100";
		
		/*
		if(Pattern.matches(regex, s)){
			System.out.println(s+" : 1~3�̳��� ����");
		}else {
			System.out.println(s+" : 1~3�̳��� ���ڰ� �ƴմϴ�.");
		}
		*/
		
		/*
		if(s.matches(regex)){
			System.out.println(s+" : 1~3�̳��� ����");
		}else {
			System.out.println(s+" : 1~3�̳��� ���ڰ� �ƴմϴ�.");
		}
		*/
		
		
		/*
		//��ȭ��ȣ
		//regex = "(^010|^017|^016)-(\\d{4}|\\d{3})-\\d{4}$"; //^ :����, \\d{4}: ���� ���ڸ�, $ :������
		
		regex = "^01(?:0|1|[6-9])-\\d{3,4}-\\d{4}$"; //^01(?:0|1|[6-9]) :01�ν���+�״����� 0�Ǵ�1�Ǵ� 6~9 
		                                             //\\d{3,4} : �����ε� 3-4�ڸ�
													 //���ڸ� �̻� :\\d+
		s="017-1234-6566";
		
		if(s.matches(regex)) {
			System.out.println(s+" : �������� ��ȭ��ȣ");
		} else {
			System.out.println(s+ " : �߸��� ��ȭ��ȣ");
		}
		*/
		
		
		/*
		regex ="^[��-�R]+$"; //�����ڵ� : \uac00-\ud7a3 , +:���ڸ��̻�
		s="�ڹ٤�";
		if(s.matches(regex))System.out.println(s+" : ����");
		else System.out.println(s+" : �߸�");
		*/
		
		
		/*
		//�̹������ϰ˻�
		regex ="[^\\s]+(\\.(?i)(jpg|png|gif|bmp))$"; 
		s="a.gif1";
		if(s.matches(regex))System.out.println(s+" : ����");
		else System.out.println(s+" : �߸�");
		*/
		
		
		
		//�����ڿ� ���� �Ǵ� Ư�����ڸ� ������ 5~10���̳�
		regex="^(?=.*[a-zA-Z])(?=.*[~!@#$%^&*()]|.*[0-9]).{5,10}$"; //^$:���۰� ��, .������ ������� , * 0���̻�
		                                                            //a{5,10} --> a�� �ּ� 5�� �ִ�10
		s="abc2def";
		if(s.matches(regex))System.out.println(s+" : ����");
		else System.out.println(s+" : �߸�");
	}
}
