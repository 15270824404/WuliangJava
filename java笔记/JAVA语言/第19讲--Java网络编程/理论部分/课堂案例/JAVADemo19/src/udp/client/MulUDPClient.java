package udp.client;

import java.net.DatagramSocket;

public class MulUDPClient {
	public static void main(String[] args) {
		DatagramSocket ds = null;// ���Ӷ���

		try {
			System.out.println("�ͻ���׼����ɣ�");
			for (int i = 0; i < 30; i++) {
				ds = new DatagramSocket();
				new LogicThreadClient(ds, i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ds.close();
		}
	}
}
