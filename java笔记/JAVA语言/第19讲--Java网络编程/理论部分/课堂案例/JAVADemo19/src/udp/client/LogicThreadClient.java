package udp.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/*
 * �ͻ������ݰ�������߳�
 */
public class LogicThreadClient extends Thread {
	DatagramSocket ds;
	DatagramPacket dp;// ���յ����ݰ�����
	String serverHost = "127.0.0.1";// ������IP
	int serverPort = 10010;// �������˿ں�
	int i = 0;

	public LogicThreadClient(DatagramSocket ds, int i) {
		byte[] b = new byte[1024];
		dp = new DatagramPacket(b, b.length);
		this.ds = ds;
		this.i = i;
		start();// �����߳�
	}

	public void run() {
		try {
			InetAddress address = InetAddress.getByName(serverHost);
			Date d = new Date();// ��ǰʱ��
			String content = d.toString();
			byte[] data = content.getBytes();
			// ��װҪ���͵�����
			DatagramPacket sendDp = new DatagramPacket(data, data.length,
					address, serverPort);
			// ����
			ds.send(sendDp);
			// ����
			ds.receive(dp);
			// ��ȡ���յ�������
			byte[] response = dp.getData();
			int len = dp.getLength();
			String s = new String(response, 0, len);
			System.out.println("��" + i + "�η������˷���Ϊ��" + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
