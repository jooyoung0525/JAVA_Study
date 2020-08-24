package ex0821_Thread2_Network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//1대1 통신
public class ChatServer1 extends JFrame implements ActionListener, Runnable{
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField();
	private JTextArea ta = new JTextArea();
	
	private ServerSocket ss = null;
	private int port =8000;
	private Socket sc = null;
	
	public ChatServer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//x 버튼으로 종료
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		add(sp, BorderLayout.CENTER);
		
		tf.addActionListener(this);
		add(tf,BorderLayout.SOUTH);
		
		setTitle("채팅-");
		setSize(500,500);
		setResizable(false);
		setVisible(true);
	}
	public void serverStart() {
		try {
			ss=new ServerSocket(port);
			ta.setText("서버시작\n");
			
			sc=ss.accept();
			
			Thread t = new Thread(this);
			t.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		new ChatServer1().serverStart();
	}

	@Override
	public void run() {
		String s ;
		String ip = null;
		
		try {
			if(sc==null) return;
			//접속한 클라이언트의 입력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			
			//접속한 클라이언트 ip 주소
			ip = sc.getInetAddress().getHostAddress();
			ta.append("["+ip+"] 접속!\n");
			
			//클라이언트가 보낸 정보 읽기
			while((s=br.readLine())!=null) {
				ta.append(s+"\n");
			}
		} catch (Exception e) {
			//클라이언트가 접속 헤제하면 IOException 발생
			s="["+ip+"] 연결종료 ";
			ta.append(s+"\n");
			sc=null;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==tf) {
				String s=tf.getText().trim();
				if(s.length()==0) {
					return;
				}
				
				try {
					//  클라이언트에게 문자열 전송
					PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
					pw.println("서버|"+s);
					
					
					ta.append("보냄|"+s+"\n");
					
					tf.setText("");
					tf.requestFocus();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}

}
