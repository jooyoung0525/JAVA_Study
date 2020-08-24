package ex0821_Thread2_Network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	private static final long serialVersionUID = 1L;
	
	private JTextField tf=new JTextField();
	private JTextArea ta=new JTextArea();
	
	private Socket sc=null;
	private String host="211.238.142.120";
	private int port=8000;
	private String nickName="��ó�⺸�ó���";
	
	public ChatClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ta.setEditable(false);
		JScrollPane sp=new JScrollPane(ta);
		add(sp, BorderLayout.CENTER);
		
		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);
		
		setTitle("ä��-Ŭ���̾�Ʈ");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}
	
	public void connect() {
		try {
			sc=new Socket(host, port);
			ta.setText("���� ���� !!!\n");
			
			Thread t = new Thread(this);
			t.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatClient().connect();
	}

	@Override
	public void run() {
		String s;
		
		try {
			if(sc==null) return;
			
			// �������� ������ ������ �б� ���� �Է� ��Ʈ��(������ �޴´�)
			BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
			
			// ������ ���� ���� �б�
			while((s=br.readLine())!=null) {
				ta.append(s+"\n");
			}
			
		} catch (Exception e) {
			// ������ ������ ������ ���
			s="������ ���� �Ǿ����ϴ�. !!!!";
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
				// �������� ���ڿ� ����
				PrintWriter pw=new PrintWriter(sc.getOutputStream(), true);
				pw.println(nickName+" | "+s);
				
				ta.append("���� | "+s+"\n");
				
				tf.setText("");
				tf.requestFocus();
				
			} catch (Exception e2) {
			}
			
		}
		
	}
}
