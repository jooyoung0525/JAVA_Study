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
			System.out.println("���� ����...");
			
			while(true) {
				Socket sc = ss.accept();
				WorkerThread wt = new WorkerThread(sc); //Ŭ���̾�Ʈ ���� thread�� �ѱ�
				wt.start();
			}
		} catch (Exception e) {
			
		}
		
	}
	
	//���� ��� Ŭ���� -> Ŭ���� �ȿ��ٰ� Ŭ���� ����
	class WorkerThread extends Thread{
		private Socket sc =  null;
		
		public WorkerThread(Socket sc) {
			this.sc = sc; //�����ڷ� ���� ����
		}
		
		public void sendMsg(String msg) {
			
			//�ٸ� Ŭ���̾�Ʈ���� �޼��� ����
			for(Socket s : client) {
				try {
					//�ڱ� �ڽ��� ����
					if(s==sc)continue;
					
					//�޼����� ������ ������ ��� ��Ʈ��.
					PrintWriter pw = new PrintWriter(s.getOutputStream(),true); //��½�Ʈ�� : ������ ������
					
					pw.println(msg);
					
				} catch (Exception e) {
					
				}
			}
		}
		
		@Override
		public void run() { //�����尡 ����Ǹ�
			String ip = null;
			String msg = null;
			
			try {
				//����� Ŭ���̾�Ʈ�� �Է� ��Ʈ��(���ſ�)
				BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
				
				//������ Ŭ���̾�Ʈ�� ������ ���Ϳ� ����
				client.add(sc);
				
				//����� Ŭ���̾�Ʈ�� ������
				ip=sc.getInetAddress().getHostAddress();
				
				//�ٸ� Ŭ���̾�Ʈ���� ���� ��� �˸�
				msg = "["+ip+"] ����!!!";
				sendMsg(msg);
				
				System.out.println(msg);
				
				//Ŭ���̾�Ʈ�� ���� ���� �ޱ�
				while((msg = br.readLine())!= null) {
					
					//�ٸ� Ŭ���̾�Ʈ���� ������
					sendMsg(msg);
					
				}
				
			}catch (Exception e) {
				//Ŭ���̾�Ʈ�� ������ ���
				msg = "["+ip+"] ���� !!!";
				
				//�ٸ� Ŭ���̾�Ʈ���� �˸���
				sendMsg(msg);
				
				//Ŭ���̾�Ʈ ���� �����
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
