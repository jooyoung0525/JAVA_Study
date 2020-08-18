package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_Info_Print {
	public static void main(String[] args) {
		String appDir = System.getProperty("user.dir"); //���� ���α׷��� �����ϰ� �ִ� ��ġ
		System.out.println("�� �۾� ��� : "+appDir); //�� �۾� ��� : C:\study\work\JAVA -> ������ �� �� ��ġ�� ����.
		
		String pathname = appDir+File.separator+"ex.txt"; // seperator: ������ (os������ ���ӵ��� �ʱ� ����)
		                                                  //-> window : \n , ������\ , mac \\
		
		File f = new File(pathname);
		
		//exists() : ���� �Ǵ� ������ �����ϸ� true
		if(!f.exists()) {
			System.out.println(pathname + " ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		try {
			System.out.println("��������...");
			System.out.println("���ϸ� : "+f.getName()); // ex.txt -> ���ϸ�.Ȯ���� (������ �̸��� ������)
			System.out.println("��θ� : "+f.getPath()); // C:\���\���ϸ�.Ȯ����
			System.out.println("�����θ� : "+f.getAbsolutePath());    // C:\���\���ϸ�.Ȯ����
			System.out.println("ǥ�ذ�θ� : "+f.getCanonicalPath());   // C:\���\���ϸ�.Ȯ����
			System.out.println("�θ��� : " + f.getParent());         // C:\���
			System.out.println("���ϱ���(long��) : " + f.length());    // 162
			System.out.println("���ϻ����� : " + new Date(f.lastModified())); // ���ϻ����� : Tue Aug 18 10:48:09 KST 2020
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String s = sdf.format(new Date(f.lastModified()));             
			System.out.println("���ϻ����� : "+s);           // ���ϻ����� : 2020-48-18 10:48:09
			System.out.println("�б� �Ӽ� : "+f.canRead());  // �б� �Ӽ� : true
			System.out.println("���� �Ӽ� : "+f.canWrite()); // ���� �Ӽ� : true
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
