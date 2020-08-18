package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStream_append {
	public static void main(String[] args) {

		String pathname = "test.txt";
		FileOutputStream fos = null;

		try {

			File f = new File(pathname);

			// ������ �����ϸ� ����� ������ �����.
			//fos = new FileOutputStream(f);

			//������ ������ append������
			fos = new FileOutputStream(f,true);
			int data;
			System.out.println("����[ctrl+z]...");
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
