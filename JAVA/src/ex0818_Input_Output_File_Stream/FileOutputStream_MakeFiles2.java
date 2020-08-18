package ex0818_Input_Output_File_Stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_MakeFiles2 {
	public static void main(String[] args) {
		String pathname = "test.txt";
		int data;

		//JDK7.0���� ����. �ڵ����� close();
		try(FileOutputStream fos = new FileOutputStream(pathname)) {

			System.out.println("���ڿ� �Է�[����:ctrl+z] ? ");
			while ((data = System.in.read()) != -1) {
				fos.write(data); // ���Ͽ� ����
			}
			fos.flush();
			System.out.println("���� ���� �Ϸ�...");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
