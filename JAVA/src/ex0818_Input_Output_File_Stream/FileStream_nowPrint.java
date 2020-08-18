package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileStream_nowPrint {
	public static void main(String[] args) {

		String pathname = "test.txt";
		File f = new File(pathname);
		int data;

		try {

			// ������� ��.��.��Ʈ��!!
			// FileWriter fw = new FileWriter(pathname);
			FileWriter fw = new FileWriter(f);

			System.out.println("���ڿ� :����[ctrl+z]...");
			Reader rd = new InputStreamReader(System.in);
			while ((data = rd.read()) != -1) {
				fw.write(data);
			}

			fw.flush();
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			// ���� �Է� ���� ��Ʈ��
			FileReader fr = new FileReader(f);
			Writer wt = new OutputStreamWriter(System.out);
			System.out.println("\n���ϳ���...");
			while ((data = fr.read()) != -1) {
				wt.write(data);
			}
			wt.flush();
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
