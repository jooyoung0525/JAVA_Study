package ex0818_Input_Output_File_Stream;

public class OutputStream_write_ex2 {	
	public static void main(String[] args) {
		
		int data;
		
		try {
			//����� ��Ʈ���� �տ� ���ڰ� ������ ������ �ڿ� ���ڰ� ���� �� ����. FIFO
			//��ǻ�� �����ġ �� ���� ������ -> ��������
			System.out.print("ABCDEF �Է��� ����: ");
			
			data = System.in.read(); // 65 
			System.out.write(data); // A
			
			System.in.skip(2); // B,C�� �о ������ ������. 
			                   // skip : �о �����°�
			 
			data = System.in.read(); // 68
			System.out.write(data); // D
			
			System.in.skip(4); // ���ͱ��� ���ļ� 4byte����! ==> E F 13 10 
			System.out.flush(); // ���۰� ���� ������ �ӽñ����ġ�� �ִ� ���� ��¾���!
			                    // ������ ������ ��� ��ġ��...
			
			
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}
}
