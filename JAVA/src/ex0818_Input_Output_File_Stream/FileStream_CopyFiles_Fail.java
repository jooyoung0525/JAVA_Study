package ex0818_Input_Output_File_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStream_CopyFiles_Fail {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String source = null, dest = null;
		
		// Inputstream���� �о outputstream�� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			System.out.print("�������ϸ� ? ");
			source = br.readLine();
			System.out.print("������ ���ϸ� ?");
			dest = br.readLine();
			
			fis = new FileInputStream(source); //�Է�����
			fos = new FileOutputStream(dest); //�������
			
			//fis�о fos�� ���常�ϸ� ��
			
			
			//�߸� �ڵ��� ��� �� - �ʹ� �ð��� ���� �ɸ���. 
			//1byte�� �����ؼ� �ð��� �ʹ��ʹ��ʹ� �����ɸ�
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data); //1byte�� ����
			}
			fos.flush();
			
			
			
		} catch(FileNotFoundException e) {
			System.out.println(source + " ������ �����ϴ�.");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fis!=null) {
				try {
					fis.close();
				} catch (Exception e2) {
					
				}
			}
			
			if(fos!=null) {
				try {
					fos.close();
				} catch (Exception e2) {
					
				}
			}
		}
	}
}
