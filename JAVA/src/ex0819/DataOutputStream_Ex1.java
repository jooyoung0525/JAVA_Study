package ex0819;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStream_Ex1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("����");
			dos.writeByte(10);
			dos.writeChar('A');
			dos.writeInt(50);
			dos.writeUTF("����");
			
			dos.close();
			fos.close();
			System.out.println("����Ϸ�");
			// ���Ͽ� ����ɶ��� ������ ���� : ���� �ڷ�����  ������
			// �ҷ��ö��� �ݵ�� ������� �ҷ��;��Ѵ�.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
