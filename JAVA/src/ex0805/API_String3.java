package ex0805;

public class API_String3 {
	public static void main(String[] args) {
		
		
			String s = "seoul korea"; 
			String s1;
			
			System.out.println("s:"+s);
			
			int a = s.length();
			System.out.println("���ڿ� ���� : "+a);
		
			
			
			
			//<<substring>>
			s1 = s.substring(6,9); //s.substring(a,b) : a��° �ε������� b-1������ ���ڿ��� ����
								   //�ε����� ������ 0���� ����
			System.out.println(s1); //kor
			
			s1 = s.substring(6,6);
			System.out.println(s1); //�ƹ��͵���¾���
			
			s1 = s.substring(6); // korea : 6��° �ε������� ������
			System.out.println(s1);
			
			//s1 = s.substring(6,5); //��Ÿ�� ����
			
			
			
			
			
			//<<charAt()>>
			char c = s.charAt(6); // k: 6��° �ε����� �ִ� �� ���ڸ� ���
			System.out.println(c);

			
			
			
			//<<equals()>>
			boolean b;
			b = s.equals("seoul korea"); //����
			System.out.println(b);       //true
			
			b = s.equals("Seoul Korea"); 
			System.out.println(b);       //false
			
			
			
			
			//<<equalsIgnoreCase>>
			//��ҹ��� ���� ����
			b = s.equalsIgnoreCase("Seoul KOREA"); 
			System.out.println(b);      //true
			
			System.out.println(s.equals("seoul")); //false
			
			
			
			
			//<<startsWith(), endsWith()>>
			System.out.println(s.startsWith("seoul")); //true --> �տ� ���ڿ��� ��
			System.out.println(s.endsWith("korea")); //true --> �ڿ� ���ڿ��� ��
			
			
			
			
			//<<compareTo()>>
			// "seoul korea" >> "seoul ccatstststs"(������ �迭)
			// System.out.println( s> "seoul ccatstststs"); ������ ����
			// ���ڿ��� ��
			System.out.println(s.compareTo("seoul ccatstststs")); // 8 --> k(107)- c(99)
			                                                      // ���������� 
			
			
			//<<indexOf()>>
			//kor�� ��ġ(�ε���)?
			System.out.println(s.indexOf("kor"));//6
			System.out.println(s.indexOf("abc"));//-1 : ã�� ���ڿ��� ������
			
			System.out.println(s.indexOf("o")); //2 ã�� ���ڰ� ������ ó���� ����
			System.out.println(s.indexOf("o",5)); //5��° �ε��� ���� "o"�ִ��� �˻� --> 7
			
			System.out.println(s.lastIndexOf("o")); //�ڿ��� ���� "o"ã�Ƽ� �ش��ε��� ����
			
			
			
			
			
			//<<replace()>>
			//replace : ���Խ�(����) ���Ұ�
			s = "�츮���� ���ѹα� ���� ���� ����";
			s1 = s.replace("����", "����");
			System.out.println(s1); //�츮���� ���۹α� ���� ���� ����
			
			
			
			//<<replaceAll()>>
			//replaceAll : ���Խ� ���
			s1 = s.replaceAll("����", "����"); 
			System.out.println(s1); //�츮���� ���۹α� ���� ���� ����
			
	
			//�����̶� ���ھ��ֱ�
			s = "���� 123 �α� ���� 5678 ȣȣ";    
			s1 = s.replaceAll("\\d|\\s", ""); // ���ԽĿ��� ����:\\d, �Ǵ�:|, ���Ϳ� ���� ������ ����:\\s
			System.out.println(s1); //���ѹα�����ȣȣ
			
			
			//�ѱ۸� ���ֱ�
			s = "���� 123 �α� ���� 5678 ȣȣ";     
			s1 = s.replaceAll("[��-�R]", ""); // ���ȣ�ϰ� ��~�R����
			System.out.println(s1); // 123   5678 
			
			
			
			
			//<<trim()>>
			//trim():������ʰ� ����������� ��������
			s = "    ��  ��  ";
			System.out.println(":"+s+":");
			System.out.println(":"+s.trim()+":");
			System.out.println(":"+s.replaceAll("\\s","")+":");
			
			
			
			
			//<<format()>>
			//3�ڸ����� , �ϰ� string���� ����
			a=123456;
			s = String.format("%,d", a); //printf�� ����� ����
			System.out.println(s);
			
			
			
			//<<split()>>
			//split
			String tel = "010-1111-2222";
			String[] ss = tel.split("-"); //split�� �迭�� ��ȯ
			for(String x:ss)
				System.out.print(x+" ");
			System.out.println();
			
			
			
			//<<getBytes()>>
			//getBytes
			s = "KOREA";
			byte[] bb = s.getBytes(); //�ش�Ǵ� ������ �ƽ�Ű���� �迭�� ��ȯ
			for(int x : bb)
				System.out.print(x+" ");
			System.out.println();
	}
}
