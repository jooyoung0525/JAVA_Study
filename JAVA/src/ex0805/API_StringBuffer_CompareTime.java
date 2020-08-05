package ex0805;

public class API_StringBuffer_CompareTime {
	public static void stringTime() {
		System.out.println("String...");
		
		long start = System.currentTimeMillis();
		String s = "a";
		for(int i = 0; i<100000; i++) {
			s+="a"; //�������� ���ڿ�
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("���ڿ��Ǳ��� :"+s.length()); //���ڿ��Ǳ��� :100001
		System.out.println("����ð� :"+(end-start)+"ms"); //����ð� :2120ms
	}
	
	
	
	public static void stringBufferTime() {
		System.out.println("StringBuffer...");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i = 0; i<100000; i++) {
			sb.append("a"); //�������� ���ڿ�
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("���ڿ��Ǳ��� :"+sb.length()); //���ڿ��Ǳ��� :100001
		System.out.println("����ð� :"+(end-start)+"ms"); //����ð� :3ms
	}
	
	
	
	public static void main(String[] args) {
		stringTime();
		stringBufferTime();
	}

}
