package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStream_CopyFiles_Success1 {
	public static void main(String[] args) {
		
		//JDK7.0이상
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String source = null, dest = null;
		
		byte[] b = new byte[2048]; 
		//1024 -> 86ms / 2048 -> 40ms
		
		int len;
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			
			System.out.print("원본 이름 ? ");
			source = br.readLine();
			System.out.print("복사본 이름 ? ");
			dest = br.readLine();
			
			
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);
			
			long s = System.currentTimeMillis();
			while((len= fis.read(b))!=-1) {
				//len = fis.read(b) => 최대 바이트 배열 b길이만큼 읽어 b에 저장하고, 실제 읽어들인 byte수를 반환.
				fos.write(b,0,len);
			}
			fos.flush();
			long e = System.currentTimeMillis();
			System.out.println("복사시간:"+(e-s)+"ms");
			
		} catch(FileNotFoundException e){
			
			System.out.println(source+" 파일이 없습니다.");
			
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
