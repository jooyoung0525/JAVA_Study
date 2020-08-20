package ex0819;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class BufferedInputOutput_Ex2 {
	private final static int BUFFER_SIZE = 2048;
	//final ���� : �빮�� ó��
	//�⺻ ������ ũ�⸦ �����Ѵ�.
	public static void main(String[] args) {
		String source, dest;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] b = new byte[BUFFER_SIZE];
		int len;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//bufferedReader : ���پ� �б�
		//inputstreamreader : ����Ʈ -> ���ڿ�

		try {
			System.out.print("���� ����?");
			source = br.readLine();
			System.out.print("���纻 ����");
			dest = br.readLine();
			
			bis = new BufferedInputStream(new FileInputStream(source));
			//FileInputStream : ����Ʈ �������� ���Ͽ� �Է�  //  source : ���ϸ�
			//FileOutputStream : ����Ʈ �������� ������ ���
//			bos = new BufferedOutputStream(new FileOutputStream(dest));
			bos = new BufferedOutputStream(new FileOutputStream(dest),BUFFER_SIZE);
			//���� ������ ���� �����ϴ�.( final ������ ������ ����� ���Ѵٸ�)
			while((len=bis.read(b))!=-1) {
				bos.write(b,0,len);
			}
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception e2) {
				}
				if (bos != null) {
					try {
						bos.close();
					} catch (Exception e2) {
					}
				}
			}
		}
	}

}
