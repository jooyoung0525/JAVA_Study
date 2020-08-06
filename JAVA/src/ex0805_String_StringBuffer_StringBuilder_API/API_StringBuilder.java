package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuilder {
	public static void main(String[] args) {
	
		
		StringBuilder sb1 = new StringBuilder("korea");
		StringBuilder sb2 = new StringBuilder("korea");
		
		System.out.println(sb1==sb2); // �ּҺ�. false
		System.out.println(sb1.equals(sb2)); // �ּҺ�. false --> String Ŭ���������� equals�� �� ��!!
		
		
		//�� �񱳴� String���� ��ȯ�Ŀ�
		//toString() : String���� ��ȯ
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		
		
		StringBuilder sb = new StringBuilder();
		
		//���ڿ� �߰�(���� �ڿ�)
		sb.append("korea");
		sb.append("seoul");
		System.out.println(sb); //koreaseoul
		
		//String���� ��ȯ
		String s = sb.toString();
		System.out.println(s);//koreaseoul
		
		//���ڿ� ����
		System.out.println(sb.length()); //10
		
	}	
}
