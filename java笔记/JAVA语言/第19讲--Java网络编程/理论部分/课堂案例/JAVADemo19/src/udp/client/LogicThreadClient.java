package udp.client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/*
 * 客户端数据包处理的线程
 */
public class LogicThreadClient extends Thread {
	DatagramSocket ds;
	DatagramPacket dp;// 接收的数据包对象
	String serverHost = "127.0.0.1";// 服务器IP
	int serverPort = 10010;// 服务器端口号
	int i = 0;

	public LogicThreadClient(DatagramSocket ds, int i) {
		byte[] b = new byte[1024];
		dp = new DatagramPacket(b, b.length);
		this.ds = ds;
		this.i = i;
		start();// 启动线程
	}

	public void run() {
		try {
			InetAddress address = InetAddress.getByName(serverHost);
			Date d = new Date();// 当前时间
			String content = d.toString();
			byte[] data = content.getBytes();
			// 封装要发送的数据
			DatagramPacket sendDp = new DatagramPacket(data, data.length,
					address, serverPort);
			// 发送
			ds.send(sendDp);
			// 接收
			ds.receive(dp);
			// 读取接收到的数据
			byte[] response = dp.getData();
			int len = dp.getLength();
			String s = new String(response, 0, len);
			System.out.println("第" + i + "次服务器端反馈为：" + s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
