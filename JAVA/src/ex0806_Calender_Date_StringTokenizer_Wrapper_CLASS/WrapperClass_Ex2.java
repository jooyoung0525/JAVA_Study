package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

public class WrapperClass_Ex2 {
	public static void main(String[] args) {
		//WrapperClass�� �Һ��̴�-> ���� ��ȯ�� �� ����. ���� ���ϸ� �ٸ��ּҿ� �Ҵ�.
		
		int a;
		long b;
		
		b = 10;
		a = (int)b;
		System.out.println(a);
		
		Long ob1;
		//ob1 = 10; //������ ����
		
		ob1 = 10L;
		System.out.println(ob1);
		
		Long ob2 = new Long(10);
		System.out.println(ob2);
		
		Integer ob3;
		//ob3 = (Integer)ob2; //�����Ͽ���
		        //Ŭ������ ���ϰ��谡 �ƴϸ� ����ȯ �Ұ�.
		
		//int x = null; //������ ����
		
		ob3 = null; 
		System.out.println(ob3);
		
		//ob3+=10; //��Ÿ�ӿ��� (ob3�� null�̹Ƿ�)
		
		
		ob3 = 10;
		ob3+=5;
		System.out.println(ob3);
	} 
}
