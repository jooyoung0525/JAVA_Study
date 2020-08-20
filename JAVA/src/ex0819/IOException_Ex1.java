package ex0819;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class IOException_Ex1 {
/**
 * MS949 -> utf-8  : �ü�� ȯ�濡 ���� �ٲ���ϴ� ��� �߻�, utf-9 : ������, mac ȯ�� ����
 * @param args
 */
	public static void main(String[] args) {
		//MS949�� �о� �鿩 UTF -8�� ����
		int data;
		String pathname = "test.txt";
		try {
			Reader rd = new InputStreamReader(System.in,"MS949"); // �⺻ ���ڵ� : ms949
			
			Writer wt = new OutputStreamWriter(new FileOutputStream(pathname),"utf-8");
			
			System.out.print("�Է�[���� ctrl+z]?");
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
