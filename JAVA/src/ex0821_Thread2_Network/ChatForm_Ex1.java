package ex0821_Thread2_Network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatForm_Ex1 extends JFrame implements ActionListener, Runnable{
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField();
	private JTextArea ta = new JTextArea();
	
	public ChatForm_Ex1() {
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
	public static void main(String[] args) {
		new ChatForm_Ex1();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==tf) {
				String s=tf.getText().trim();
				if(s.length()==0) {
					return;
				}
				
				try {
					// ������ ä�� ���ڿ� ����
					ta.append("����|"+s+"\n");
					
					tf.setText("");
					tf.requestFocus();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
	}

}
