package ex0818_Input_Output_File_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_ReadFiles {
	public static void main(String[] args) {
		String pathname = "test.txt";
		int data;
		FileInputStream fis = null;
		
		try {
		     System.out.println("파일 내용...");
			//FileInputStream :  file 입력 byte 스트림
			// 파일이 없으면 FileNotFoundException 발생
			fis = new FileInputStream(pathname);
			while((data = fis.read())!=-1) {
				System.out.write(data); //파일에서 읽음(키보드가 아니라!)
			}
			System.out.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e2) {
					
				}
			}
		}
		
	}
}
