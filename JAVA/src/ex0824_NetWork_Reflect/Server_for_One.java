package ex0824_NetWork_Reflect;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server_for_One {
	
	private Vector<Socket> client = new Vector<>();
	private ServerSocket ss = null;
	private int port = 8000;
	
	
	public void serverStart() {
		
		try {
			ss = new ServerSocket(port);
			System.out.println("서버 시작...");
			
			while(true) {
				Socket sc = ss.accept();
				WorkerThread wt = new WorkerThread(sc); //클라이언트 소켓 thread에 넘김
				wt.start();
			}
		} catch (Exception e) {
			
		}
		
	}
	
	//내부 멤버 클래스 -> 클래스 안에다가 클래스 생성
	class WorkerThread extends Thread{
		private Socket sc =  null;
		
		public WorkerThread(Socket sc) {
			this.sc = sc; //생성자로 소켓 받음
		}
		
		public void sendMsg(String msg) {
			
			//다른 클라이언트에게 메세지 전송
			for(Socket s : client) {
				try {
					//자기 자신은 제외
					if(s==sc)continue;
					
					//메세지를 전송할 소켓의 출력 스트림.
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true); //출력스트림 : 데이터 보낼때
					
					pw.println(msg);
					
				} catch (Exception e) {
					
				}
			}
		}
		
		@Override
		public void run() { //스레드가 실행되면
			String ip = null;
			String msg = null;
			
			try {
				//연결된 클라이언트의 입력 스트림(수신용)
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				//연결한 클라이언트의 소켓을 벡터에 저장
				client.add(sc);
				
				//연결된 클라이언트의 아이피
				ip=sc.getInetAddress().getHostAddress();
				
				//다른 클라이언트에게 접속 사실 알림
				msg = "["+ip+"] 입장!!!";
				sendMsg(msg);
				
				System.out.println(msg);
				
				//클라이언트가 보낸 정보 받기
				while((msg = br.readLine())!= null) {
					
					//다른 클라이언트에게 보내기
					sendMsg(msg);
					
				}
				
			}catch (Exception e) {
				//클라이언트가 퇴장한 경우
				msg = "["+ip+"] 퇴장 !!!";
				
				//다른 클라이언트에게 알리기
				sendMsg(msg);
				
				//클라이언트 정보 지우기
				client.remove(sc);
				sc = null;
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Server_for_One cs = new Server_for_One();
		cs.serverStart();
	}

}
