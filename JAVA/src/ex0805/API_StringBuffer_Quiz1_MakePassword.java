package ex0805;

public class API_StringBuffer_Quiz1_MakePassword {
	public static void main(String[] args) {
		
		//<<�ӽ� �н����� ����>>
		
		// �����ڼ���Ư�����ڸ� �����Ͽ� 10���� ���ڿ���
		// ��ȯ�ϴ� �޼ҵ� �����
		// ��, ȣ���Ҷ����� �ٸ� ��ȯ
		
		String s = generatePwd(); //generatePwd�� Ŭ�����޼ҵ�� �ν��Ͻ��������ص���
		System.out.println(s);
		
	}
	
	public static String generatePwd() {
		StringBuilder sb = new StringBuilder(); //�������ڿ� ����
		
		String s ="!@#$%^&*()-+/ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		//���߿��� 10�� ����
		
		int n;
		
		//(int)(Math.random()*10) => 0~9
		for(int i = 0; i<10; i++) {
			n = (int)(Math.random()*s.length()); //-1�����൵��
			sb.append(s.substring(n,n+1));
		}
		
		return sb.toString();
	}
}
