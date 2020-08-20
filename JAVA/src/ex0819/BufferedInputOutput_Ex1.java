package ex0819;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferedInputOutput_Ex1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"))){
			//한줄씩 작성해서 저장하는 방법
			String s;
			System.out.println("종료 ctrl+Z");
			while((s=br.readLine())!=null) {
				bw.write(s);
				bw.newLine();
			}
			System.out.println("저장완료!");
		} catch (Exception e) {
		}
	}

}
