package tcp.socket;

import java.io.*;
import java.net.*;

/*
 * 简单的Socket客户端
 * 功能为：发送字符串“Hello”到服务器端，并打印出服务器端的反馈
 */
public class SimpleSocketClient {

	public static void main(String[] args) {
		// 声明客户端对象
		Socket socket = null;
		// 输入流
		InputStream is = null;
		// 输出流
		OutputStream os = null;
		try {
			// 服务器端IP地址
			String serverIP = InetAddress.getByName("localhost")
					.getHostAddress();
			// System.out.println(serverIP);
			// 服务器端口号
			int port = 10000;
			String data = "Hello";
			// 建立连接
			socket = new Socket(serverIP, port);
			// 创建输出流对象
			os = socket.getOutputStream();
			// 发送字节流
			os.write(data.getBytes());
			// 获取输入流
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			// 读取数据
			int n = is.read(b);
			// 将读取的数据转换成字符串
			String getString = new String(b, 0, n);
			// 控制台输出数据
			System.out.println("服务器反馈：" + getString);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}
