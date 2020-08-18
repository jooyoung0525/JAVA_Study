package ex0818_Input_Output_File_Stream;

import java.io.IOException;

public class InputStream_read_write {	
	public static void main(String[] args) {
		int data;
		char ch;
		
		// System.in : InputStream ��ü. byte ��Ʈ��
		// InputStream �� read() : 1byte�� �о� ascii �ڵ� ��ȯ. ==> 2byte�� �������� 2���о����.
		
		try {
			//ABC ���� => 3+2���о����. 65-> ����� 1����Ʈ, 66 67 (13 10) -> ���ʹ�2����Ʈ
			//���ѹα� ���� => 8+2���о����. 180 235 199 209 185 206 177 185 (13 10)
			
			System.out.print("���ڿ� [ctrl+Z:����] ?");
			
			while((data=System.in.read())!=-1) {
				
				//System.out.println(data);
				
				ch = (char)data;// ==> 2byte)
				
				System.out.print(ch); //���ѹα� ->��???��?���� ==> �ѹ������� ȸ���Ұ���
				                      //�ѱ��� ����. 2byte���ڸ� 1byte�� �о 2byte�� ����ϹǷ�
				
				//System.out.write(ch); //���ѹα� 
				//�ѱ� ������ ����. 2byte�� ���� 1byte�� ���.
				
				//System.out.write(data);// -->(ex. write�� 4byte�� �־ 1byte�� ����.)
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
