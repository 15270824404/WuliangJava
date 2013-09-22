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
		// 生成一个[0~50]的随机数
		int randomNumber = Math.abs(r.nextInt() % 51);

		// 要发送的数据对象
		byte[] data = new byte[2];

		try {
			// 读取客户端发送来的数据
			byte[] b = receiveDp.getData();
			int len = receiveDp.getLength();
			InetAddress address = receiveDp.getAddress();
			int port = receiveDp.getPort();
			// 取出有效数据
			String send = new String(b, 0, len);

			// 对接收到的数据进行解析、判断
			try {
				// 转换接收到的数据为整数
				int num = Integer.parseInt(send);

				// 对接收到的数据进行判断
				if (num > randomNumber) {
					data[0] = 1;
				} else if (num < randomNumber) {
					data[0] = 2;
				} else {
					data[0] = 0;
					// 在猜对的情况下， 再产生一个随机数，以便下次再猜
					randomNumber = Math.abs(r.nextInt() % 51);
				}
				// 将数据发送到客户端
				DatagramPacket sendDp = new DatagramPacket(data, data.length,
						address, port);
				ds.send(sendDp);
			} catch (Exception e) {
				data[0] = 3;
				DatagramPacket sendDp = new DatagramPacket(data, data.length,
						address, port);
				ds.send(sendDp);// 发送异常数据
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
