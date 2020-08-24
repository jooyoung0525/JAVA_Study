package ex0821_Thread2_Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Network_Source_Ex1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String site, s;
		try {
			System.out.print("¿•¡÷º“[http://www.naver.com]?");
			site = br.readLine();
			
			URL url = new URL(site);
			InputStream is = url.openStream();
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			while((s=br2.readLine())!=null) {
				System.out.println(s);
			}
			br2.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
