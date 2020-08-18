package ex0818_Input_Output_File_Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Reader_ex1 {
	public static void main(String[] args) {
		int data;
		//char ch;
		
		try {
			//InputStreamReader : byte stream을 문자 스트림으로 변환(bridge stream)
			 Reader rd = new InputStreamReader(System.in); //System.in은 바이트 스트림
			 
			 System.out.print("입력 [ctrl+z:종료] ?");
			 while((data = rd.read())!=-1){
				
				 // 한글, 영문자 모두 한번에 한문자씩 입력
				System.out.println(data); // 대한민국 -> 32 45824 54620 48124 44397 13 10 --> 2byte출력이라
				                            // ABC  -> 65 66 67 13 10
				 
				//ch = (char)data;
				//System.out.write(ch); // 한글 깨짐. 2byte문자를 1byte만 출력하므로
				
				
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
