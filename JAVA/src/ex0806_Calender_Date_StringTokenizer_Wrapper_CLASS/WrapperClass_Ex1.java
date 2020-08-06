package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

public class WrapperClass_Ex1 {
	public static void main(String[] args) {
		int a = 10,b;
		Integer ob;
		String str;
		double d;
		
		ob = a; // �⺻ �ڷ����� int�� Integer�� �ڵ� ��ȯ
		        // �����δ� ������ �� ��, ob=new Integer(a);�� ��ȯ�Ǿ� ó��
		        // Autoboxing
		
		b = ob; // Integer�� �⺻�ڷ����� int�� �ڵ���ȯ
		        // �����δ� ������ �� ��, b = ob.intValue();�� ��ȯ�Ǿ� ó��
		        // Auto-unboxing
		
		
		System.out.println(ob+b); //20
		
		str="101";
		a = Integer.parseInt(str); //10������ ��ȯ
		System.out.println(a);     //101
		
		a = Integer.parseInt(str,2); //2������ ��ȯ
		System.out.println(a);       //5
		
		/*
		//��Ÿ�ӿ���
		str ="a1";
		a = Integer.parseInt(str);
		System.out.println(a); */
		
		str ="a1";
		a = Integer.parseInt(str,16); //16����
		System.out.println(a);        //161
		
		
		str =Integer.toHexString(356); //16����
		System.out.println(str);       //164

		
		System.out.println("�ִ� : "+Integer.MAX_VALUE);
		System.out.println("�ּ� : "+Integer.MIN_VALUE);
		System.out.println("bits : "+Integer.SIZE);
		System.out.println("bytes : "+Integer.BYTES);
		System.out.println("type : "+Integer.TYPE);
		
		
		//a = Integer.parseInt("10.5"); //��Ÿ�ӿ���. "."�ֱ� ����
		
		d = Double.parseDouble("10.5");
		System.out.println(d);
		
		// double�� ���ڿ��� 
		str = Double.toString(d);
		System.out.println(str);
	} 
}
