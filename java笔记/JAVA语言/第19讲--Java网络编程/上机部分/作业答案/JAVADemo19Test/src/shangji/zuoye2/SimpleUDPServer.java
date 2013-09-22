package shangji.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 简单UDP服务器端，实现功能是输出客户端发送的数据，并反馈“OK”给客户端
 */
public class SimpleUDPServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket sendDp = null;
		DatagramPacket receiveDp = null;
		final int PORT = 10010;
		try {
			ds = new DatagramSocket(PORT);
			System.out.println("服务器端已启动：");
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			// 接收数据
			ds.receive(receiveDp);
			InetAddress clientIP = receiveDp.getAddress();
			int clientPort = receiveDp.getPort();
			byte[] data = receiveDp.getData();
			int len = receiveDp.getLength();
			System.out.println("客户端IP：" + clientIP.getHostAddress());
			System.out.println("客户端端口：" + clientPort);
			System.out.println("客户端发送内容：" + new String(data, 0, len));
			// 发送反馈信息
			String response = "OK";
			byte[] rData = response.getBytes();// 转换成字节数组
			// 封装要发送的数据
			sendDp = new DatagramPacket(rData, rData.length, clientIP,
					clientPort);
			// 发送数据
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}
	}
}
