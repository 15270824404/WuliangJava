package shangji.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/*
 * 简单的UDP客户端，实现向服务器端发送系统时间功能
 */
public class SimpleUDPClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;// 连接对象
		DatagramPacket sendDp = null;// 要发送的数据包对象
		DatagramPacket receiveDp = null;// 接收的数据包对象
		String serverHost = "127.0.0.1";// 服务器IP
		int serverPort = 10010;// 服务器端口号

		try {
			// 建立连接，不指定客户端端口号，系统自动分配
			ds = new DatagramSocket();
			// 初始化发送数据
			Date date = new Date();
			String content = date.toString();
			byte[] data = content.getBytes();// 将要发送的内容转换成字节数组
			InetAddress address = InetAddress.getByName(serverHost);
			// 封装要发送的数据
			sendDp = new DatagramPacket(data, data.length, address, serverPort);
			// 发送
			ds.send(sendDp);

			// 接收准备
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds.receive(receiveDp);
			// 读取接收到的数据
			byte[] response = receiveDp.getData();
			int len = receiveDp.getLength();
			String s = new String(response, 0, len);
			System.out.println("服务器端反馈为：" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}
	}
}
