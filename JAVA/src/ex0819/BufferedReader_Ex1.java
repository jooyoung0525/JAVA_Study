package ex0819;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_Ex1 {

	public static void main(String[] args) {
		String s;
		//���پ� �ҷ��ͼ� �б�
		try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
