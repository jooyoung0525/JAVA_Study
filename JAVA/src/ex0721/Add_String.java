package ex0721;

public class Add_String {
	public static void main(String[] args) {
		
		String s;
		
		//���ڿ� + ���ڿ�  => ���ڿ� ����
		//���ڿ� + �ٸ� �ڷ��� => ���ڿ��� ����
		
		s ="Korea"+"seoul";
		System.out.println(s); // Koreaseoul
		
		s="Korea"+9;
		System.out.println(s); // Korea9
		
		s = 'A'+10+"Korea"; // ���� + ���� => ����
		System.out.println(s); // 75Korea
		
		s = 'A'+"Korea"+10; // ���� + ���ڿ� => ���ڿ� + ���� = ���ڿ� 
		System.out.println(s); // AKorea10
		
		s = "Korea"+'A'+10; // ���ڿ� + ���� => ���ڿ� + ���� = ���ڿ�
		System.out.println(s); // KoreaA10
		
		s = 'A'+'B'+"Korea"; //���� + ���� => ���� + ���ڿ� = ���ڿ�
		System.out.println(s); //131Korea
	}
}