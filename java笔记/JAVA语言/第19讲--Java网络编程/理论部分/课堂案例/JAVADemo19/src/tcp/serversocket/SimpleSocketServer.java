package tcp.serversocket;

import java.io.*;
import java.net.*;

/*
 * 服务器端
 * 功能：将客户端发送的内容反馈给客户端
 */
public class SimpleSocketServer {

	public static void main(String[] args) {
		// 声明服务器端对象
		ServerSocket server = null;
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		int port = 10000;
		try {
			// 根据端口号进行监听
			server = new ServerSocket(port);
			// 获得连接
			socket = server.accept();
			// 接收客户端发送的内容
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			int n = is.read(b);
			// 输出
			System.out.println("客户端发送的内容为：" + new String(b, 0, n));
			// 向客户端发送反馈内容
			os = socket.getOutputStream();
			os.write(b, 0, n);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				socket.close();
				server.close();
			} catch (IOException e) {
			}
		}
	}

}
