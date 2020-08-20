package ex0819;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class BufferedInputOutput_Ex2 {
	private final static int BUFFER_SIZE = 2048;
	//final 변수 : 대문자 처리
	//기본 버퍼의 크기를 설정한다.
	public static void main(String[] args) {
		String source, dest;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] b = new byte[BUFFER_SIZE];
		int len;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//bufferedReader : 한줄씩 읽기
		//inputstreamreader : 바이트 -> 문자열

		try {
			System.out.print("원본 파일?");
			source = br.readLine();
			System.out.print("복사본 파일");
			dest = br.readLine();
			
			bis = new BufferedInputStream(new FileInputStream(source));
			//FileInputStream : 바이트 형식으로 파일에 입력  //  source : 파일명
			//FileOutputStream : 바이트 형식으로 파일을 출력
//			bos = new BufferedOutputStream(new FileOutputStream(dest));
			bos = new BufferedOutputStream(new FileOutputStream(dest),BUFFER_SIZE);
			//버퍼 사이즈 조절 가능하다.( final 변수로 버퍼의 사이즈를 정한다면)
			while((len=bis.read(b))!=-1) {
				bos.write(b,0,len);
			}
			System.out.println("파일 복사 완료");
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
