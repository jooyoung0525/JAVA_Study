package ex0818_Input_Output_File_Stream;

import java.io.File;


public class File_Delete {
	public static void main(String[] args) {
		
		String pathname = "C:" +File.separator+"user"+File.separator+"ex.txt";
		
		try {
			File f = new File(pathname);
			if(!f.exists()) {
				System.out.println(pathname +"존재하지 않음....");
			}
			
			
			// 파일이나 폴더는 한번에 하나씩 삭제 가능.
			// 폴더는 비어있지 않으면 삭제 불가.
			boolean b = f.delete();
			if(b) {
				System.out.println("삭제 완료...");
			}else{
				System.out.println("삭제 실패...");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
