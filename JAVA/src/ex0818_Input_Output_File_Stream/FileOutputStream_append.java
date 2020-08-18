package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStream_append {
	public static void main(String[] args) {

		String pathname = "test.txt";
		FileOutputStream fos = null;

		try {

			File f = new File(pathname);

			// 파일이 존재하면 지우고 파일을 만든다.
			//fos = new FileOutputStream(f);

			//파일이 있으면 append용으로
			fos = new FileOutputStream(f,true);
			int data;
			System.out.println("종료[ctrl+z]...");
			while ((data = System.in.read()) != -1) {
				fos.write(data);
			}
			fos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {

				}
			}

		}
	}
}
