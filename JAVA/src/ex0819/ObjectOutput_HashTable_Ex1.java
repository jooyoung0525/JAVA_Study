package ex0819;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class ObjectOutput_HashTable_Ex1 {

	public static void main(String[] args) {
		Hashtable<String, String> ht= new Hashtable<>();
		ht.put("자바", "프로그래밍");
		ht.put("HTLML", "웹프로그래밍");
		ht.put("오라클", "데이터베이스");
		
		String pathname = "demo.txt";
		try {
			FileOutputStream fos = new FileOutputStream(pathname);
			//ObjectOutputStream : 객체를 저장할 수 잇는 스트림
			//객체를 저장하면 파일 선두에 객체명이 저장된다.
			//객체로 저장되기 때문에 내용은 확인 못한다.
			//내용 확인은 ObjectInputStream 사용한다.
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ht);
			oos.close();
			fos.close();
			System.out.println("저장완료");
			// 객체로
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
