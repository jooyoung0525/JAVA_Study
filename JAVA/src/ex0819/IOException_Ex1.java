package ex0819;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOException_Ex1 {
/**
 * MS949 -> utf-8  : 운영체제 환경에 따라 바꿔야하는 경우 발생, utf-9 : 리눅스, mac 환경 지원
 * @param args
 */
	public static void main(String[] args) {
		//MS949로 읽어 들여 UTF -8로 저장
		int data;
		String pathname = "test.txt";
		try {
			Reader rd = new InputStreamReader(System.in,"MS949"); // 기본 인코딩 : ms949
			
			Writer wt = new OutputStreamWriter(new FileOutputStream(pathname),"utf-8");
			
			System.out.print("입력[종료 ctrl+z]?");
			while((data=rd.read())!=-1) {
				wt.write(data);
			}
			wt.flush();
			wt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
