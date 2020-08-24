package ex0824_NetWork_Reflect;

import java.util.Enumeration;
import java.util.Properties;

public class System_ex1 {
	public static void main(String[] args) {
		 Properties p = System.getProperties();
		 Enumeration<?> e = p.propertyNames();
		 while(e.hasMoreElements()) {
			 String key = (String)e.nextElement();
			 String value = p.getProperty(key);
			 System.out.println("Key:"+key+"=>"+"value:"+value);
			 
		 }
		 
		 System.out.println("운영체제 : "+System.getProperty("os.name"));
		 System.out.println("작업경로 : "+System.getProperty("user.dir"));
	}
}
