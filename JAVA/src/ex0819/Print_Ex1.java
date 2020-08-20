package ex0819;

import java.io.PrintStream;
import java.util.Calendar;

public class Print_Ex1 {

	public static void main(String[] args) {
		try {
			PrintStream ps = new PrintStream("test.txt");
			ps.printf("%1$tF %1$tA %1$tT\n", Calendar.getInstance());
			ps.println("대한민국");
			ps.print("서울");
			ps.print("부산");
			ps.println("경기");
			
			ps.close();
			System.out.println("저장완료...");
//			2020-08-19 수요일 11:18:01
//			대한민국
//			서울부산경기

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
