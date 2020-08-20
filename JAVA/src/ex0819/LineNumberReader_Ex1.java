package ex0819;

import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class LineNumberReader_Ex1 {

	public static void main(String[] args) {
		LineNumberReader br = new LineNumberReader(new InputStreamReader(System.in));
		String s;
		StringBuilder sb = new StringBuilder();
		
		try {
			while(true) {
				System.out.print((br.getLineNumber()+1)+":");
				s=br.readLine();
				if(s==null) {
					break;
				}
				sb.append(br.getLineNumber()+":"+s+"\n");
			}
			System.out.println("\n입력내용..");
			System.out.println(sb.toString());
			
//			1:aa
//			2:bb
//			3:cc
//			4:dd
//			5:ee
//			6:ff
//			7:
//			입력내용..
//			1:aa
//			2:bb
//			3:cc
//			4:dd
//			5:ee
//			6:ff
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
