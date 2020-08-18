package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStream_CopyFiles_Success1 {
	public static void main(String[] args) {
		
		//JDK7.0�̻�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String source = null, dest = null;
		
		byte[] b = new byte[2048]; 
		//1024 -> 86ms / 2048 -> 40ms
		
		int len;
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			
			System.out.print("���� �̸� ? ");
			source = br.readLine();
			System.out.print("���纻 �̸� ? ");
			dest = br.readLine();
			
			
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			long s = System.currentTimeMillis();
			while((len= fis.read(b))!=-1) {
				//len = fis.read(b) => �ִ� ����Ʈ �迭 b���̸�ŭ �о� b�� �����ϰ�, ���� �о���� byte���� ��ȯ.
				fos.write(b,0,len);
			}
			fos.flush();
			long e = System.currentTimeMillis();
			System.out.println("����ð�:"+(e-s)+"ms");
			
		} catch(FileNotFoundException e){
			
			System.out.println(source+" ������ �����ϴ�.");
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {
					
				}
			}
			
		}
	}
}
