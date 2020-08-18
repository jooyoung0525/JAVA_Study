package ex0818_Input_Output_File_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_MakeFiles {
	public static void main(String[] args) {
		String pathname = "test.txt";
		FileOutputStream fos = null;
		int data;

		try {
			// FileOutputStream : 파일 byte출력 스트림
			// 파일이 없으면 파일을 만들고, 있으면 지우고 만듦
			fos = new FileOutputStream(pathname);

			System.out.println("문자열 입력[종료:ctrl+z] ? ");
			while ((data = System.in.read()) != -1) {
				fos.write(data); // 파일에 저장
			}
			fos.flush();
			System.out.println("파일 저장 완료...");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close(); //꼭 객체 ㅆ느다음 닫아줘야함
				} catch (Exception e2) {

				}
			}
		}

	}
}
