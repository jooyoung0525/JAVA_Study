package ex0818_Input_Output_File_Stream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_ex1 {
	public static void main(String[] args) {
		 byte[] b = {65,66,67,68,69,70};
		 
		 try {
			//OutputStream : ��� byte ��Ʈ��
			//PrintStream �� �ٸ�!
			OutputStream os = System.out;
			
			os.write(b);  // ABCDEF
			System.out.println();
			
			os.write(b,2,3); //CDE (index:2 ~ 3��)
			System.out.println();
			
			os.write(b,0,b.length); //ABCDEF
			//write�� flush�� ���ص� buffer�� ������ ���� �ְ� �ƴѰ��� �־ �׳� flush�ϴ� ���� ����!
			
			os.close();
			
			System.out.println("end...."); //��� �ȵ�! ==> ��� stream close �ع�����!
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
