package ex0814_Collection_Map_Sort;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;

public class Properties_ex2 {
	public static void main(String[] args) {
		String pathname = "ex.properties";
		
		Properties p = new Properties();
	
		p.setProperty("web", "�����α׷���");
		p.setProperty("subject", "�ڹٽ�ũ��Ʈ");
		p.setProperty("oracle", "�����ͺ��̽�");
		p.setProperty("title", "�ڹ��÷���");
		
		Iterator<Object> it = p.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			String value = p.getProperty(key);
			System.out.println(key+" : "+value);
		}
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(pathname);
			
			
			p.store(fos, "������Ƽ����");//���Ͽ� ����
			System.out.println("���� ���� �Ϸ�...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (Exception e2) {
					
				}
			}
		}
	}

	
}
