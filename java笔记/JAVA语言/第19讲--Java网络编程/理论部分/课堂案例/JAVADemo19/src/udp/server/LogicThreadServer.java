package udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * �����������ݰ�������߳�
 */
public class LogicThreadServer extends Thread {
	DatagramSocket ds;
	DatagramPacket dp;

	public LogicThreadServer(DatagramSocket ds, DatagramPacket dp) {
		this.ds = ds;
		this.dp = dp;
		start();// �����߳�
	}

	public void run() {
		try {
			// ��ý��յ�������
			byte[] data = dp.getData();
			// �����Ч���ݳ���
			int len = dp.getLength();
			// ��ÿͻ��˵�ַ��Ϣ
			InetAddress clentAddress = dp.getAddress();
			// ��ÿͻ��˶˿�
			int clientPort = dp.getPort();
			System.out.println("�ͻ���IP��" + clentAddress.getHostAddress());
			System.out.println("�ͻ��˶˿ڣ�" + clientPort);
			System.out.println("�ͻ��˷������ݣ�" + new String(data, 0, len));
			// �������ͻ���
			String content = "OK";
			byte[] b = content.getBytes();
			DatagramPacket sendDp = new DatagramPacket(b, b.length,
					clentAddress, clientPort);
			// ����
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}