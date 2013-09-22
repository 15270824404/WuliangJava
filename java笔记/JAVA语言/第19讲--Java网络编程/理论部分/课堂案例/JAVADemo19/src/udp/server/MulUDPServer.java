package udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class MulUDPServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket receiveDp = null;
		final int PORT = 10010;
		byte[] b = new byte[1024];
		receiveDp = new DatagramPacket(b, b.length);
		try {
			ds = new DatagramSocket(PORT);
			System.out.println("����������������");
			while (true) {
				// ��������
				ds.receive(receiveDp);
				// �����߳̽��д���
				new LogicThreadServer(ds, receiveDp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}

	}

}
