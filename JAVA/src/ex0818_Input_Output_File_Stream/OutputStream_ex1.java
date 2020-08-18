package ex0818_Input_Output_File_Stream;

import java.io.IOException;
import java.io.OutputStream;

public class OutputStream_ex1 {
	public static void main(String[] args) {
		 byte[] b = {65,66,67,68,69,70};
		 
		 try {
			//OutputStream : 출력 byte 스트림
			//PrintStream 과 다름!
			OutputStream os = System.out;
			
			os.write(b);  // ABCDEF
			System.out.println();
			
			os.write(b,2,3); //CDE (index:2 ~ 3개)
			System.out.println();
			
			os.write(b,0,b.length); //ABCDEF
			//write가 flush를 안해도 buffer로 보내는 것이 있고 아닌것이 있어서 그냥 flush하는 것이 나음!
			
			os.close();
			
			System.out.println("end...."); //출력 안됨! ==> 출력 stream close 해버려서!
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
