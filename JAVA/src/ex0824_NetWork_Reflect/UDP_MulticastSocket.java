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
 * - DatagramSocket : UDP 소켓으로 데이터그램 패킷을 전송하거나 수신
 * - DatagramPacket : UDP를 통해서 전송될 수 있는 데이터
 * - MulticastSocket :한번에 다수의 클라이언트에 데이터 그램을 전송 ==> 무조건 전송이 되는것을 보장 못 받음.
 * - 그룹 지정 : D Class
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
	private String nick = "주영";

	public UDP_MulticastSocket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x 버튼으로 종료
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta);
		add(sp, BorderLayout.CENTER);

		tf.addActionListener(this);
		add(tf, BorderLayout.SOUTH);

		setTitle("채팅-멀티캐스팅");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
	}

	public void setup() {
		try {

			xGroup = InetAddress.getByName(host);
			ms = new MulticastSocket(port);

			// 특정 그룹에 포함
			ms.joinGroup(xGroup);

			Thread t = new Thread(this);
			t.start();

		} catch (Exception e) {

		}
	}

	public void disConn() {
		try {
			// 특정 그룹에서 빠져 나옴
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

				// 전송 받을 패킷
				DatagramPacket p = new DatagramPacket(b, b.length);

				// 전송 받음
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

				// 전송할 패킷
				DatagramPacket p = new DatagramPacket(b, b.length, xGroup, port);

				/// 전송
				ms.send(p);

				tf.setText("");
				tf.requestFocus();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
