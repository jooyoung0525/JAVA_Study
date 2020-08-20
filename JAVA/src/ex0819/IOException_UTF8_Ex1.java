package ex0819;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOException_UTF8_Ex1 {

	public static void main(String[] args) {
		String source = "test.txt";
		String dest = "ex.txt";
		
		try {
			Reader rd = new InputStreamReader(new FileInputStream(source), "utf-8");
			Writer wt = new OutputStreamWriter(new FileOutputStream(dest), "MS949");
			
			int data;
			
			while((data=rd.read())!=-1) {
				wt.write(data);
			}
			wt.flush();
			
			rd.close();
			wt.close();
			System.out.println("변환완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
