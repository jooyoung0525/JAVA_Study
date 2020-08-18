package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.util.Calendar;

public class File_Rename {
	public static void main(String[] args) {
		String appDir= System.getProperty("user.dir");
		String pathname = appDir +File.separator+"ex.txt";
		
		File f = new File(pathname);
		if(!f.exists()) {
			System.out.println(pathname +"�������� ����....");
			return;
		}
		
		// Ȯ����
		String fileExt = pathname.substring(pathname.lastIndexOf(".")); // .txt
		
		String newName = String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", Calendar.getInstance());
		// tY : Ķ�������� ���� , tm : Ķ�������� �� , td : Ķ�������� ��
		// tH : �� , tM : ��  , tS : ��                                                                     
		//System.out.println(newName); //20200818113612
		
		newName +=System.nanoTime()+fileExt;
		//System.out.println(newName); //20200818113642356203697505100.txt --> �ٲ� ���ο� �̸�
		
		
		try {
			String newPath = appDir +File.separator+newName;
			File dest = new File(newPath);
			f.renameTo(dest);
			System.out.println("���ϸ� ���� �Ϸ�..."); //���ϸ� ����Ϸ�... ������ �ι��ٽ� ����Ұ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
