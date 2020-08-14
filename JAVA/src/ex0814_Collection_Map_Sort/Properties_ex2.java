package ex0814_Collection_Map_Sort;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Properties;

public class Properties_ex2 {
	public static void main(String[] args) {
		String pathname = "ex.properties";
		
		Properties p = new Properties();
	
		p.setProperty("web", "웹프로그래밍");
		p.setProperty("subject", "자바스크립트");
		p.setProperty("oracle", "데이터베이스");
		p.setProperty("title", "자바컬렉션");
		
		Iterator<Object> it = p.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			String value = p.getProperty(key);
			System.out.println(key+" : "+value);
		}
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(pathname);
			
			
			p.store(fos, "프로퍼티예제");//파일에 저장
			System.out.println("파일 저장 완료...");
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
