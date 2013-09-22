package kewai.zuoye3.udp;

import java.io.*;
import java.net.*;

/**
 * 客户端程序
 * 
 * 功能：接收用户输入，将用户输入传送到服务器
 * 
 * 接收服务器反馈，并在控制台输出
 * 
 * @author ZHONG
 * 
 */
public class UDPChangeNumberClient {

	public static void main(String[] args) {

		DatagramSocket ds = null;// 连接对象
		DatagramPacket sendDp = null;// 发送数据包对象
		DatagramPacket receiveDp = null;// 接收数据包对象

		BufferedReader br = null;

		try {
			ds = new DatagramSocket();
			InetAddress address = InetAddress.getByName("127.0.0.1");
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);

			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.print("请输入数字：");
				String s = br.readLine();
				if (s.equalsIgnoreCase("quit")) {
					break;
				}
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					System.out.println("您输入的不是整数！请输入整数");
					continue;
				}
				// 发送数据
				byte[] data = s.getBytes();
				// 封装数据
				sendDp = new DatagramPacket(data, data.length, address, 10001);
				// 发送数据
				ds.send(sendDp);
				// 接收反馈
				ds.receive(receiveDp);// 将反馈接收到接收数据包对象中
				byte[] response = receiveDp.getData();
				int len = receiveDp.getLength();

				// 客户端输出
				System.out
						.println(s + "的大写形式是：" + new String(response, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ds.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
