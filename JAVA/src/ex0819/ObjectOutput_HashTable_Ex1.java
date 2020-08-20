package ex0819;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

public class ObjectOutput_HashTable_Ex1 {

	public static void main(String[] args) {
		Hashtable<String, String> ht= new Hashtable<>();
		ht.put("�ڹ�", "���α׷���");
		ht.put("HTLML", "�����α׷���");
		ht.put("����Ŭ", "�����ͺ��̽�");
		
		String pathname = "demo.txt";
		try {
			FileOutputStream fos = new FileOutputStream(pathname);
			//ObjectOutputStream : ��ü�� ������ �� �մ� ��Ʈ��
			//��ü�� �����ϸ� ���� ���ο� ��ü���� ����ȴ�.
			//��ü�� ����Ǳ� ������ ������ Ȯ�� ���Ѵ�.
			//���� Ȯ���� ObjectInputStream ����Ѵ�.
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ht);
			oos.close();
			fos.close();
			System.out.println("����Ϸ�");
			// ��ü��
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
