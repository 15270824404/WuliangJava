package udp.server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 服务器端数据包处理的线程
 */
public class LogicThreadServer extends Thread {
	DatagramSocket ds;
	DatagramPacket dp;

	public LogicThreadServer(DatagramSocket ds, DatagramPacket dp) {
		this.ds = ds;
		this.dp = dp;
		start();// 启动线程
	}

	public void run() {
		try {
			// 获得接收到的数组
			byte[] data = dp.getData();
			// 获得有效数据长度
			int len = dp.getLength();
			// 获得客户端地址信息
			InetAddress clentAddress = dp.getAddress();
			// 获得客户端端口
			int clientPort = dp.getPort();
			System.out.println("客户端IP：" + clentAddress.getHostAddress());
			System.out.println("客户端端口：" + clientPort);
			System.out.println("客户端发送内容：" + new String(data, 0, len));
			// 反馈到客户端
			String content = "OK";
			byte[] b = content.getBytes();
			DatagramPacket sendDp = new DatagramPacket(b, b.length,
					clentAddress, clientPort);
			// 发送
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}