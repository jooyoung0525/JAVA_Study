package ex0818_Input_Output_File_Stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Reader_ex1 {
	public static void main(String[] args) {
		int data;
		//char ch;
		
		try {
			//InputStreamReader : byte stream�� ���� ��Ʈ������ ��ȯ(bridge stream)
			 Reader rd = new InputStreamReader(System.in); //System.in�� ����Ʈ ��Ʈ��
			 
			 System.out.print("�Է� [ctrl+z:����] ?");
			 while((data = rd.read())!=-1){
				
				 // �ѱ�, ������ ��� �ѹ��� �ѹ��ھ� �Է�
				System.out.println(data); // ���ѹα� -> 32 45824 54620 48124 44397 13 10 --> 2byte����̶�
				                            // ABC  -> 65 66 67 13 10
				 
				//ch = (char)data;
				//System.out.write(ch); // �ѱ� ����. 2byte���ڸ� 1byte�� ����ϹǷ�
				
				
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
