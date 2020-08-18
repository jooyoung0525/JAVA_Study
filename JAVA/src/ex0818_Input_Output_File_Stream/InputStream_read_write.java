package ex0818_Input_Output_File_Stream;

import java.io.IOException;

public class InputStream_read_write {	
	public static void main(String[] args) {
		int data;
		char ch;
		
		// System.in : InputStream 객체. byte 스트림
		// InputStream 의 read() : 1byte를 읽어 ascii 코드 반환. ==> 2byte를 읽으려면 2번읽어야함.
		
		try {
			//ABC 엔터 => 3+2번읽어들임. 65-> 영어는 1바이트, 66 67 (13 10) -> 엔터는2바이트
			//대한민국 엔터 => 8+2번읽어들임. 180 235 199 209 185 206 177 185 (13 10)
			
			System.out.print("문자열 [ctrl+Z:종료] ?");
			
			while((data=System.in.read())!=-1) {
				
				//System.out.println(data);
				
				ch = (char)data;// ==> 2byte)
				
				System.out.print(ch); //대한민국 ->´???¹?±¹ ==> 한번깨지면 회복불가능
				                      //한글은 깨짐. 2byte문자를 1byte만 읽어서 2byte로 출력하므로
				
				//System.out.write(ch); //대한민국 
				//한글 깨지지 않음. 2byte중 하위 1byte만 출력.
				
				//System.out.write(data);// -->(ex. write는 4byte를 넣어도 1byte만 읽음.)
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
