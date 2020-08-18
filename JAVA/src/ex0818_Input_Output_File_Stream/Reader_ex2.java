package ex0818_Input_Output_File_Stream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Reader_ex2 {
	public static void main(String[] args) {
		int data;
		
		try {
			
			 Reader rd = new InputStreamReader(System.in); 
			 Writer wt = new OutputStreamWriter(System.out); 
			 
			 System.out.print("���ڿ� [ctrl+z:����] ?");
			 while((data = rd.read())!=-1){
				wt.write(data); // ���� (���� 2byte) ���
			 }
			 wt.flush();
			 
			 // ����ϰ� �������Ϸ��� ����ġ�� ctrl+z �ݵ�� ��������!! (���۰� ���� �ʾұ� ������)
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
