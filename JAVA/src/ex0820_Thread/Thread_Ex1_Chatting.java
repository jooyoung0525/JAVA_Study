package ex0820_Thread;

// << 쓰레드 이용 예시 >>

// 스레드를 사용하지 않으면, 채팅입력과 채팅타이틀 입력시간 띄우는걸 함께 쓸 수 없음.

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame; //채팅화면 구현할때 씀 -> Thread로 만들어져있어서 프로그램이 안죽음.
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Thread_Ex1_Chatting extends JFrame implements ActionListener, Runnable{  //이미 JFrame상속받아서 thread상속못받음.
	   														                            //인터페이스는 여러개 받을수 있음

	// JFrame을 사용하면 자동으로 창틀이 있는 윈도우 화면을 구현할 수 있음.
	
	private static final long serialVersionUID = 1L;
	private JTextField tf = new JTextField();
	private JTextArea ta = new JTextArea();
	
	public Thread_Ex1_Chatting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JScrollPane sp = new JScrollPane(ta);
		add(sp,BorderLayout.CENTER);
		
		tf.addActionListener(this);
		add(tf,BorderLayout.SOUTH);
		
		Thread t = new Thread(this);
		t.start();
		
		setTitle("채팅-");
		setSize(500,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Thread_Ex1_Chatting();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf) {
			String s = tf.getText().trim();
			if(s.length()==0) {
				return;
			}
			
			try {
			
				ta.append(s+"\n");
				tf.setText("");
				tf.requestFocus();
				
			} catch (Exception e2) {
			}
		}
	}


	@Override
	public void run() {
		String s;
		while(true) {
			try {
				Calendar cal = Calendar.getInstance();
				s = String.format("%1$tF %1$tT", cal);
				setTitle("채팅-"+s);
				Thread.sleep(1000);//시간이 대략 1초에 한번씩 바뀜 //1000*60 =>1분에한번
			} catch (Exception e) {
			}
		}
	}
}
