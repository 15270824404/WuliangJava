package kewai.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class UDPRandomLogicThread extends Thread {

	DatagramSocket ds;
	DatagramPacket receiveDp;
	static Random r = new Random();

	public UDPRandomLogicThread(DatagramSocket ds, DatagramPacket receiveDp) {
		this.ds = ds;
		this.receiveDp = receiveDp;
		start();
	}

	public void run() {
		// ����һ��[0~50]�������
		int randomNumber = Math.abs(r.nextInt() % 51);

		// Ҫ���͵����ݶ���
		byte[] data = new byte[2];

		try {
			// ��ȡ�ͻ��˷�����������
			byte[] b = receiveDp.getData();
			int len = receiveDp.getLength();
			InetAddress address = receiveDp.getAddress();
			int port = receiveDp.getPort();
			// ȡ����Ч����
			String send = new String(b, 0, len);

			// �Խ��յ������ݽ��н������ж�
			try {
				// ת�����յ�������Ϊ����
				int num = Integer.parseInt(send);

				// �Խ��յ������ݽ����ж�
				if (num > randomNumber) {
					data[0] = 1;
				} else if (num < randomNumber) {
					data[0] = 2;
				} else {
					data[0] = 0;
					// �ڲ¶Ե�����£� �ٲ���һ����������Ա��´��ٲ�
					randomNumber = Math.abs(r.nextInt() % 51);
				}
				// �����ݷ��͵��ͻ���
				DatagramPacket sendDp = new DatagramPacket(data, data.length,
						address, port);
				ds.send(sendDp);
			} catch (Exception e) {
				data[0] = 3;
				DatagramPacket sendDp = new DatagramPacket(data, data.length,
						address, port);
				ds.send(sendDp);// �����쳣����
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ds.close();
			} catch (Exception e) {
			}
		}
	}
}
