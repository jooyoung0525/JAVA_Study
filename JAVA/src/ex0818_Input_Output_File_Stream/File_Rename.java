package ex0818_Input_Output_File_Stream;

import java.io.File;
import java.util.Calendar;

public class File_Rename {
	public static void main(String[] args) {
		String appDir= System.getProperty("user.dir");
		String pathname = appDir +File.separator+"ex.txt";
		
		File f = new File(pathname);
		if(!f.exists()) {
			System.out.println(pathname +"존재하지 않음....");
			return;
		}
		
		// 확장자
		String fileExt = pathname.substring(pathname.lastIndexOf(".")); // .txt
		
		String newName = String.format("%1$tY%1$tm%1$td%1$tH%1$tM%1$tS", Calendar.getInstance());
		// tY : 캘린더에서 연도 , tm : 캘린더에서 월 , td : 캘린더에서 일
		// tH : 시 , tM : 분  , tS : 초                                                                     
		//System.out.println(newName); //20200818113612
		
		newName +=System.nanoTime()+fileExt;
		//System.out.println(newName); //20200818113642356203697505100.txt --> 바꿀 새로운 이름
		
		
		try {
			String newPath = appDir +File.separator+newName;
			File dest = new File(newPath);
			f.renameTo(dest);
			System.out.println("파일명 변경 완료..."); //파일명 변경완료... 나오면 두번다시 실행불가.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
