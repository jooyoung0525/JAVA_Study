package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String {
	public static void main(String[] args) {
		
		// �ڹٿ����� ���ڿ��� ��ü�̴�.
		// ���ڿ� �񱳴� == ���뾲������!!! -> �ּҺ��ϱ� ����!!!
		
		// ���� ���ڿ��� �Է¹����� ���� �ּҸ� �Ҵ����!! -> �ڹٰ� �Ҵ��Ҷ� ���ڿ��� ������ Ȯ���ϰ� ���ڿ��� ������ 
		//                                     ���� �ּ� �Ҵ�, ���ڿ��� �ٸ��� �ٸ� �ּ� �Ҵ�.
		
			String s1 = "seoul"; //s1���� �ּҰ� ���� -> �������̵����� ���ڿ�����ϰ� ������
			String s2 = "seoul"; //�޸��Ҵ��� �ѹ����� -> s1,s2 ���� �ּ� ����
			
			String s3 = new String("seoul"); //new������ ��ü ���� -> �ּҰ� �ٲ�
			
			System.out.println(s1+":"+s2+":"+s3);
			
			//���ڿ������� == : �ּ� ��
			System.out.println(s1==s2); //true
			System.out.println(s1==s3); //false
			
			//String������ equals() : ���� �� --> �������̵� 
			//Object�� equals()�� �ٸ�!
			System.out.println(s1.equals(s2)); //true
			System.out.println(s1.equals(s3)); //true
			
			System.out.println(s1.hashCode()); //109324212
			System.out.println(s2.hashCode()); //109324212
			System.out.println(s3.hashCode()); //109324212
			
			
			
			
			
			//<<�Һ��� ��Ģ! ����� ��Ʈ���� ���� �ٲ� �� ����>>
			
			s1+="Korea"; // ����� �� ������ ������ �ݺ��ϸ� �ȵ�!
						 // ������ s1: seoul �ּҸ� ���� ���ڿ��� ���ϴ°� �ƴ϶�
                         // �ٸ� ���ڰ� �߰��Ǹ� �ٽÿ����� �޸𸮸� �Ҵ�޾Ƽ� �ּҰ� ����!
			             // ���� �ּ��� ���ڿ��� �ٲ� �� ����!!!!
			
			System.out.println(s1); //seoulKorea
			System.out.println(s2); //seoul
			System.out.println(s1==s2); //false
			
			
	}
}
