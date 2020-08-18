package ex0818_Input_Output_File_Stream;

public class OutputStream_write_ex2 {	
	public static void main(String[] args) {
		
		int data;
		
		try {
			//입출력 스트림은 앞에 글자가 나가지 않으면 뒤에 글자가 나갈 수 없음. FIFO
			//컴퓨터 기억장치 중 가장 빠른거 -> 레지스터
			System.out.print("ABCDEF 입력후 엔터: ");
			
			data = System.in.read(); // 65 
			System.out.write(data); // A
			
			System.in.skip(2); // B,C랑 읽어서 버리고 싶을때. 
			                   // skip : 읽어서 버리는거
			 
			data = System.in.read(); // 68
			System.out.write(data); // D
			
			System.in.skip(4); // 엔터까지 합쳐서 4byte버림! ==> E F 13 10 
			System.out.flush(); // 버퍼가 차지 않으면 임시기억장치에 있는 글자 출력안함!
			                    // 버퍼의 내용을 출력 장치로...
			
			
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
