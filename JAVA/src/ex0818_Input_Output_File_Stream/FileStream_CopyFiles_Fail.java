package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStream_CopyFiles_Fail {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String source = null, dest = null;
		
		// Inputstream에서 읽어서 outputstream에 복사
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			System.out.print("원본파일명 ? ");
			source = br.readLine();
			System.out.print("복사할 파일명 ?");
			dest = br.readLine();
			
			fis = new FileInputStream(source); //입력파일
			fos = new FileOutputStream(dest); //출력파일
			
			//fis읽어서 fos에 저장만하면 끝
			
			
			//잘못 코딩한 경우 예 - 너무 시간이 많이 걸린다. 
			//1byte씩 복사해서 시간이 너무너무너무 오래걸림
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data); //1byte씩 복사
			}
			fos.flush();
			
			
			
		} catch(FileNotFoundException e) {
			System.out.println(source + " 파일이 없습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e2) {
					
				}
			}
			
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e2) {
					
				}
			}
		}
	}
}
