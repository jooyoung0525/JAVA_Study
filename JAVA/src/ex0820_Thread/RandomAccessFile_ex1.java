package ex0820_Thread;

								 //���ݱ��� ��� ����ó���� ����ó��.
import java.io.RandomAccessFile; //���ϴ� ���� ������ �о �� ����. --> �Է°� ����� ��� �� �� ����.

public class RandomAccessFile_ex1 {
	public static void main(String[] args) {
		 RandomAccessFile raf = null;
		 
		 try {
			 byte b;
			 
			 raf = new RandomAccessFile("ex.txt", "rw"); //rw:����� ���� ���
			 for(int i = 65; i<=90; i++) {
				 raf.write(i);
			 }
			 
			 raf.seek(5); //A,B,C,D,E,F ������ �ִ� ��ġ�� �̵�
			 //b = raf.readByte(); // java.io.EOFException
			 //System.out.write(b); // F
			 
			 System.out.flush(); //write�� ����߱� ������ flush
			 
			 System.out.println();
			 for(int i = 0; i<(int)raf.length(); i++) {
				 raf.seek(i);
				 System.out.print((char)raf.readByte());
			 }
			 System.out.println();
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(raf != null) {
				try {
					raf.close();
				} catch (Exception e2) {
					
				}
			}
		}
	}
}
