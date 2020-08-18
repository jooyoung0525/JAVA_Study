package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File_Info_Print {
	public static void main(String[] args) {
		String appDir = System.getProperty("user.dir"); //현재 프로그램을 개발하고 있는 위치
		System.out.println("현 작업 경로 : "+appDir); //현 작업 경로 : C:\study\work\JAVA -> 파일을 다 이 위치에 저장.
		
		String pathname = appDir+File.separator+"ex.txt"; // seperator: 구분자 (os종류에 종속되지 않기 위해)
		                                                  //-> window : \n , 리눅스\ , mac \\
		
		File f = new File(pathname);
		
		//exists() : 파일 또는 폴더가 존재하면 true
		if(!f.exists()) {
			System.out.println(pathname + " 파일이 존재하지 않습니다.");
			return;
		}
		
		try {
			System.out.println("파일정보...");
			System.out.println("파일명 : "+f.getName()); // ex.txt -> 파일명.확장자 (파일의 이름만 가져옴)
			System.out.println("경로명 : "+f.getPath()); // C:\경로\파일명.확장자
			System.out.println("절대경로명 : "+f.getAbsolutePath());    // C:\경로\파일명.확장자
			System.out.println("표준경로명 : "+f.getCanonicalPath());   // C:\경로\파일명.확장자
			System.out.println("부모경로 : " + f.getParent());         // C:\경로
			System.out.println("파일길이(long형) : " + f.length());    // 162
			System.out.println("파일생성일 : " + new Date(f.lastModified())); // 파일생성일 : Tue Aug 18 10:48:09 KST 2020
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
			String s = sdf.format(new Date(f.lastModified()));             
			System.out.println("파일생성일 : "+s);           // 파일생성일 : 2020-48-18 10:48:09
			System.out.println("읽기 속성 : "+f.canRead());  // 읽기 속성 : true
			System.out.println("쓰기 속성 : "+f.canWrite()); // 쓰기 속성 : true
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
