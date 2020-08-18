package ex0818_Input_Output_File_Stream;

import java.io.File;


public class File_Make_directory {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"user"+File.separator+"ex";
		
		try {
			File f = new File(pathname);
			
			if(!f.exists()) {
				// ���� �����
				// f.mkdir(); // ���������� ������ ��������� �ʴ´� ==> user��� ������ ���� ������ �������� ����.
				f.mkdirs(); // ���� ������ ������ ���������� ����
				System.out.println("������ �����߽��ϴ�.");
			}
			System.out.println(pathname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
