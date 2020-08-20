package ex0819;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataOutputStream_Ex2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			
			dis.close();
			fis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
