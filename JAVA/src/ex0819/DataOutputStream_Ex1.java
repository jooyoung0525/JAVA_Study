package ex0819;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStream_Ex1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("서울");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(50);
			dos.writeUTF("대한");
			
			dos.close();
			fos.close();
			System.out.println("저장완료");
			// 파일에 저장될때는 파일이 깨짐 : 여러 자료형이  섞여서
			// 불러올때는 반드시 순서대로 불러와야한다.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
