package ex0818_Input_Output_File_Stream;

import java.io.File;


public class File_Make_directory {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"user"+File.separator+"ex";
		
		try {
			File f = new File(pathname);
			
			if(!f.exists()) {
				// 폴더 만들기
				// f.mkdir(); // 상위폴더가 없으면 만들어지지 않는다 ==> user라는 폴더가 없기 때문에 생성되지 않음.
				f.mkdirs(); // 상위 폴더가 없으면 상위폴더도 생성
				System.out.println("폴더를 생성했습니다.");
			}
			System.out.println(pathname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
