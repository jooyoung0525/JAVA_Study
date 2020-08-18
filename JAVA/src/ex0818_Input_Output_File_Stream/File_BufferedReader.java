package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class File_BufferedReader {
	public static void main(String[] args) {
		String pathname = "user.txt";
		File f = new File(pathname);
		
		if(!f.exists()) {
			System.out.println(pathname+" ������ �����ϴ�.");
			return;
		}
		
		String s;
		String hak,name;
		int kor,eng,mat,tot;
		//������ �� �پ� �а������.
		
		
		BufferedReader br = null;
		
		
		try {
			// FileReader :���� ���� �Է� ��Ʈ��.
			// BufferedReader : ���� ��Ʈ��. ���پ� �Է°���.
			br= new BufferedReader(new FileReader(f));
			while((s = br.readLine())!=null) {
				String[] ss= s.split("\\s"); // \\s:����
				if(ss.length!=5) {
					continue;
				}
				
				hak = ss[0];
				name = ss[1];
				kor = Integer.parseInt(ss[2]);
				eng = Integer.parseInt(ss[3]);
				mat = Integer.parseInt(ss[4]);
				tot = kor+eng+mat;
				System.out.println(hak+":"+name+":"+kor+":"+eng+":"+mat+":"+tot);
			}
		} catch (Exception e){
			e.printStackTrace();
			
			
			
		} finally {
			if(br!=null) {
				try {
					br.close();
				} catch (Exception e2) {
				
				}
			}
		}
	}
}
