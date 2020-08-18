package ex0818_Input_Output_File_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_MakeFiles2 {
	public static void main(String[] args) {
		String pathname = "test.txt";
		int data;

		//JDK7.0부터 가능. 자동으로 close();
		try(FileOutputStream fos = new FileOutputStream(pathname)) {

			System.out.println("문자열 입력[종료:ctrl+z] ? ");
			while ((data = System.in.read()) != -1) {
				fos.write(data); // 파일에 저장
			}
			fos.flush();
			System.out.println("파일 저장 완료...");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
