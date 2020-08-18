package ex0818_Input_Output_File_Stream;

public class OutputStream_write_ex1 {	
	public static void main(String[] args) {
		
		// System.out : PrintStream
		// PrintStream : 다양한 출력이 가능한 출력 스트림(필터)
		// IOException이 발생하지 않는다.
		System.out.write(65); //하위 1byte를 출력 버퍼로
		System.out.write(66);
		System.out.write(67);
	
		System.out.write(180);
		System.out.write(235); // 180+235 : 대
		
		System.out.write(199);
		System.out.write(209); // 199+209 : 한
		
		System.out.flush(); 
		// 출력버퍼가 차지 않으면 출력장치로 보내지 않으므로 
		// flush()를 통해 출력 장치로 보냄
		// System.out.write(10); 만 출력해도 출력됨.
	}
}
