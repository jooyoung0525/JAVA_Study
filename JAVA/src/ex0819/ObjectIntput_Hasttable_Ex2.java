package ex0819;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class ObjectIntput_Hasttable_Ex2 {

	public static void main(String[] args) {
		String pathname = "demo.txt";
		try {
			FileInputStream fis = new FileInputStream(pathname);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			@SuppressWarnings("unchecked") // 제네릭 다운캐스팅한 것에 대한 경고 메세지를 무시하겠다는 문장
			// 제네릭은 다운 캐스팅하게되면 경고메세지가 나온다.
			Hashtable<String, String> ht = (Hashtable<String, String>)ois.readObject();
			ois.close();
			Iterator<String> it = ht.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				String value = ht.get(key);
				System.out.println(key+":"+value);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
