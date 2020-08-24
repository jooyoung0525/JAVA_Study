package ex0820_Thread;

								 //지금까지 모든 파일처리는 순차처리.
import java.io.RandomAccessFile; //원하는 파일 정보를 읽어낼 수 있음. --> 입력과 출력을 모두 할 수 있음.

public class RandomAccessFile_ex1 {
	public static void main(String[] args) {
		 RandomAccessFile raf = null;
		 
		 try {
			 byte b;
			 
			 raf = new RandomAccessFile("ex.txt", "rw"); //rw:입출력 전용 모드
			 for(int i = 65; i<=90; i++) {
				 raf.write(i);
			 }
			 
			 raf.seek(5); //A,B,C,D,E,F 읽을수 있는 위치로 이동
			 //b = raf.readByte(); // java.io.EOFException
			 //System.out.write(b); // F
			 
			 System.out.flush(); //write로 출력했기 때문에 flush
			 
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
