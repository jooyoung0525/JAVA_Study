package ex0814_Collection_Map_Sort;

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_ex1 {
	public static void main(String[] args) {
		String pathname = "test.properties";
		
		//Hashtable을 상속 받음
		Properties p = new Properties();
		
		try(FileInputStream fis = new FileInputStream(pathname)){
			p.load(fis);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		p.list(System.out);
		
		String s = p.getProperty("java");
		System.out.println(s);
	}

	
}
