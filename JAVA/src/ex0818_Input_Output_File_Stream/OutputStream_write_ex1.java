package ex0818_Input_Output_File_Stream;

public class OutputStream_write_ex1 {	
	public static void main(String[] args) {
		
		// System.out : PrintStream
		// PrintStream : �پ��� ����� ������ ��� ��Ʈ��(����)
		// IOException�� �߻����� �ʴ´�.
		System.out.write(65); //���� 1byte�� ��� ���۷�
		System.out.write(66);
		System.out.write(67);
	
		System.out.write(180);
		System.out.write(235); // 180+235 : ��
		
		System.out.write(199);
		System.out.write(209); // 199+209 : ��
		
		System.out.flush(); 
		// ��¹��۰� ���� ������ �����ġ�� ������ �����Ƿ� 
		// flush()�� ���� ��� ��ġ�� ����
		// System.out.write(10); �� ����ص� ��µ�.
	}
}
