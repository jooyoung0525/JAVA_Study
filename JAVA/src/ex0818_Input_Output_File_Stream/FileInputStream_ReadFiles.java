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
		     System.out.println("���� ����...");
			//FileInputStream :  file �Է� byte ��Ʈ��
			// ������ ������ FileNotFoundException �߻�
			fis = new FileInputStream(pathname);
			while((data = fis.read())!=-1) {
				System.out.write(data); //���Ͽ��� ����(Ű���尡 �ƴ϶�!)
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
