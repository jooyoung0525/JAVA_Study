package ex0818_Input_Output_File_Stream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Reader_ex2 {
	public static void main(String[] args) {
		int data;
		
		try {
			
			 Reader rd = new InputStreamReader(System.in); 
			 Writer wt = new OutputStreamWriter(System.out); 
			 
			 System.out.print("문자열 [ctrl+z:종료] ?");
			 while((data = rd.read())!=-1){
				wt.write(data); // 문자 (하위 2byte) 출력
			 }
			 wt.flush();
			 
			 // 출력하게 나오게하려면 엔터치고 ctrl+z 반드시 눌러야함!! (버퍼가 차지 않았기 때문에)
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
