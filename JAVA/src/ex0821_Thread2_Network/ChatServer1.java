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
//1��1 ���
public class ChatServer1 extends JFrame implements ActionListener, Runnable{
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField();
	private JTextArea ta = new JTextArea();
	
	private ServerSocket ss = null;
	private int port =8000;
	private Socket sc = null;
	
	public ChatServer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//x ��ư���� ����
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		add(sp, BorderLayout.CENTER);
		
		tf.addActionListener(this);
		add(tf,BorderLayout.SOUTH);
		
		setTitle("ä��-");
		setSize(500,500);
		setResizable(false);
		setVisible(true);
	}
	public void serverStart() {
		try {
			ss=new ServerSocket(port);
			ta.setText("��������\n");
			
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
			//������ Ŭ���̾�Ʈ�� �Է� ��Ʈ��
			BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
			
			//������ Ŭ���̾�Ʈ ip �ּ�
			ip = sc.getInetAddress().getHostAddress();
			ta.append("["+ip+"] ����!\n");
			
			//Ŭ���̾�Ʈ�� ���� ���� �б�
			while((s=br.readLine())!=null) {
				ta.append(s+"\n");
			}
		} catch (Exception e) {
			//Ŭ���̾�Ʈ�� ���� �����ϸ� IOException �߻�
			s="["+ip+"] �������� ";
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
					//  Ŭ���̾�Ʈ���� ���ڿ� ����
					PrintWriter pw = new PrintWriter(sc.getOutputStream(),true);
					pw.println("����|"+s);
					
					
					ta.append("����|"+s+"\n");
					
					tf.setText("");
					tf.requestFocus();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}

}
