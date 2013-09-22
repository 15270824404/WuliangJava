package tcp.socket;

import java.io.*;
import java.net.*;

/*
 * 复用的Socket客户端
 * 功能为：发送字符串“Hello”到服务器端，并打印出服务器端的反馈
 */
public class MulSocketClient {

	public static void main(String[] args) {
		// 声明客户端对象
		Socket socket = null;
		// 输入流
		InputStream is = null;
		// 输出流
		OutputStream os = null;
		String[] data = { "First", "Second", "Third" };
		try {
			// 建立连接
			socket = new Socket("127.0.0.1", 10000);
			// 创建输出流对象
			os = socket.getOutputStream();
			// 获取输入流
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			// 用循环将数组中数据依次发送到服务器端
			for (int i = 0; i < data.length; i++) {
				// 发送字节流
				os.write(data[i].getBytes());
				// 读取数据
				int n = is.read(b);
				// 控制台输出数据
				System.out.println("服务器反馈：" + new String(b, 0, n));
			}
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
