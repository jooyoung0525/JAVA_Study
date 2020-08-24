package ex0824_NetWork_Reflect;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * - DatagramSocket : UDP �������� �����ͱ׷� ��Ŷ�� �����ϰų� ����
 * - DatagramPacket : UDP�� ���ؼ� ���۵� �� �ִ� ������
 * - MulticastSocket :�ѹ��� �ټ��� Ŭ���̾�Ʈ�� ������ �׷��� ���� ==> ������ ������ �Ǵ°��� ���� �� ����.
 * - �׷� ���� : D Class
 *   224.0.0.0~239.255.255.255
 *   */
public class UDP_MulticastSocket extends JFrame implements ActionListener, Runnable {
	private static final long serialVersionUID = 1L;

	private JTextField tf = new JTextField();
	private JTextArea ta = new JTextArea();

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.0.0.1";
	private int port = 5555;
	private String nick = "�ֿ�";

	public UDP_MulticastSocket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x ��ư���� ����
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		add(sp, BorderLayout.CENTER);

		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);

		setTitle("ä��-��Ƽĳ����");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}

	public void setup() {
		try {

			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);

			// Ư�� �׷쿡 ����
			ms.joinGroup(xGroup);

			Thread t = new Thread(this);
			t.start();

		} catch (Exception e) {

		}
	}

	public void disConn() {
		try {
			// Ư�� �׷쿡�� ���� ����
			ms.leaveGroup(xGroup);
			ms.close();
		} catch (Exception e) {
		}
		ms = null;
	}

	public static void main(String[] args) {
		new UDP_MulticastSocket().setup();
	}

	@Override
	public void run() {
		if (ms == null)
			return;

		try {

			while (true) {
				byte[] b = new byte[256];

				// ���� ���� ��Ŷ
				DatagramPacket p = new DatagramPacket(b, b.length);

				// ���� ����
				ms.receive(p);
				String s = new String(p.getData()).trim();
				ta.append(s + "\n");
			}
		} catch (Exception e) {
			disConn();
			System.out.println(e.toString());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == tf) {
			String s = tf.getText().trim();
			if (s.length() == 0) {
				return;
			}

			try {

				if (ms == null)
					return;
				byte[] b = (nick + "] " + s).getBytes();

				// ������ ��Ŷ
				DatagramPacket p = new DatagramPacket(b, b.length, xGroup, port);

				/// ����
				ms.send(p);

				tf.setText("");
				tf.requestFocus();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
