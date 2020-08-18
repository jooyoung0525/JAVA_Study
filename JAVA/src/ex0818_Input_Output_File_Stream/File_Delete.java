package ex0818_Input_Output_File_Stream;

import java.io.File;


public class File_Delete {
	public static void main(String[] args) {
		
		String pathname = "C:" +File.separator+"user"+File.separator+"ex.txt";
		
		try {
			File f = new File(pathname);
			if(!f.exists()) {
				System.out.println(pathname +"�������� ����....");
			}
			
			
			// �����̳� ������ �ѹ��� �ϳ��� ���� ����.
			// ������ ������� ������ ���� �Ұ�.
			boolean b = f.delete();
			if(b) {
				System.out.println("���� �Ϸ�...");
			}else{
				System.out.println("���� ����...");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
