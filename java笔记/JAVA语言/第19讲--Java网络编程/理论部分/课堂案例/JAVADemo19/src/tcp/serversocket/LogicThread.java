package tcp.serversocket;

import java.io.*;
import java.net.*;

/*
 * 服务器端逻辑线程——多客户端的服务器实现
 */
public class LogicThread extends Thread {
	Socket socket;
	InputStream is;
	OutputStream os;

	public LogicThread(Socket socket) {
		this.socket = socket;
		start();// 启动线程
	}

	/*
	 * 将对数据的逻辑处理写在run()方法中
	 */
	public void run() {
		byte[] b = new byte[1024];
		try {
			os = socket.getOutputStream();
			is = socket.getInputStream();
			for (int i = 0; i < 3; i++) {
				int n = is.read(b);// 读取数据
				// 逻辑处理，将有效数据拷贝到数组response中
				byte[] response = new byte[n];
				System.arraycopy(b, 0, response, 0, n);
				System.out.println("线程处理：" + new String(response, 0, n));
				// 反馈到客户端
				os.write(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	/**
	 * 关闭相关资源
	 */
	public void close() {
		try {
			os.close();
			is.close();
			socket.close();
		} catch (Exception e) {
		}
	}

}
