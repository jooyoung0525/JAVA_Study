package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuffer2 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("123456789");
		sb.delete(0, 2).replace(1, 2, "xy").delete(4, 6); // delete���� :3456789 , replace���� : 3xy56789,
		System.out.println(sb);

		// ��� ���ڿ������
		// sb = new StringBuffer(); //���ο� ��ü�����ϸ� �ּҰ� �Ҿ����
		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);

	}
}
