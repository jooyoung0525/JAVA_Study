package ex0819;

import java.io.PrintStream;
import java.util.Calendar;

public class Print_Ex1 {

	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("test.txt");
			ps.printf("%1$tF %1$tA %1$tT\n", Calendar.getInstance());
			ps.println("���ѹα�");
			ps.print("����");
			ps.print("�λ�");
			ps.println("���");
			
			ps.close();
			System.out.println("����Ϸ�...");
//			2020-08-19 ������ 11:18:01
//			���ѹα�
//			����λ���

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
