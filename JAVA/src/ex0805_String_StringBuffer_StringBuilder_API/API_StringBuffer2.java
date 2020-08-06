package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuffer2 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("123456789");
		sb.delete(0, 2).replace(1, 2, "xy").delete(4, 6); // delete까지 :3456789 , replace까지 : 3xy56789,
		System.out.println(sb);

		// 모든 문자열지우기
		// sb = new StringBuffer(); //새로운 객체생성하면 주소값 잃어버림
		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);

	}
}
