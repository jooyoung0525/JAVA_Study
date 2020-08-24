package ex0820_Thread;

// << ������ �̿� ���� >>

// �����带 ������� ������, ä���Է°� ä��Ÿ��Ʋ �Է½ð� ���°� �Բ� �� �� ����.

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JFrame; //ä��ȭ�� �����Ҷ� �� -> Thread�� ��������־ ���α׷��� ������.
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Thread_Ex1_Chatting extends JFrame implements ActionListener, Runnable{  //�̹� JFrame��ӹ޾Ƽ� thread��Ӹ�����.
	   														                            //�������̽��� ������ ������ ����

	// JFrame�� ����ϸ� �ڵ����� âƲ�� �ִ� ������ ȭ���� ������ �� ����.
	
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
		
		setTitle("ä��-");
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
				setTitle("ä��-"+s);
				Thread.sleep(1000);//�ð��� �뷫 1�ʿ� �ѹ��� �ٲ� //1000*60 =>1�п��ѹ�
			} catch (Exception e) {
			}
		}
	}
}
