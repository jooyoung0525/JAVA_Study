package ex0818_Input_Output_File_Stream;

import java.io.IOException;

public class InputStream_read_ex1 {	
	public static void main(String[] args) {
		
		int n,data;
		
		//123 ���� =? 49 50 51 (13 10)->����
		n=0;
		try {
			System.out.print("��?");
			while((data=System.in.read())!=13) { //����ġ�� ������� ��! 
				data = data-48;
				n = n*10+data;
			}
			
			int s = 0;
			for(int i = 1; i<=n; i++)
			{
				s+=i;
			}
			System.out.println("��� : "+ s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
