package ex0818_Input_Output_File_Stream;

import java.io.File;

public class File_Remove_directory {
	
	public static void removeDir(String pathname) {
		try {
			File f = new File(pathname);
			if(f.isDirectory()) {
				removeSubDir(pathname);
			}
			f.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void removeSubDir(String pathname) { //���� �ؿ� �ִ� �ڽı��� ��ͷ� ��� ����
		File[] ff = new File(pathname).listFiles();
		try {
			if(ff.length == 0)return;
			
			for(File f: ff) {
				if(f.isDirectory()) {
					removeSubDir(f.getPath());
				}
				f.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"user";
		
		removeDir(pathname);
		System.out.println("���� �Ϸ�...");
	}
}
