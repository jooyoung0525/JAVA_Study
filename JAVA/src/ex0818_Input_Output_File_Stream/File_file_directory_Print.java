package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;


public class File_file_directory_Print {
	public static void dirList(String pathname) {
		File f = new File(pathname);
		File[] ff = f.listFiles(); //경로에 존재하는 모든 파일 및 폴더
		
		if(ff==null || ff.length == 0) {
			return;
		}
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String s;
			
			for(File file : ff) {
				s = sdf.format(new Date(f.lastModified()));
				if(file.isFile()) {
					System.out.println(file.getName()+"\t");
					System.out.print(s+"\t");
					System.out.println(file.length());
				}else if(file.isDirectory()){
					System.out.println(file.getName()+"...");
					dirList(file.getCanonicalPath()); // 재귀호출
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		try {
			//C:\windows
			System.out.print("경로 ? ");
			s = br.readLine();
			dirList(s);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
