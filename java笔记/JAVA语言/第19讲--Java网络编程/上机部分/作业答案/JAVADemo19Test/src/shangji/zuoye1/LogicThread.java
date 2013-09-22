package shangji.zuoye1;

import java.io.*;
import java.net.*;

/*
 * 服务器端逻辑线程
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
		byte[] response = new byte[1024];// 将发回的响应
		try {
			os = socket.getOutputStream();
			is = socket.getInputStream();
			boolean flag = true;
			while (flag) {
				int n = is.read(b);// 读取数据
				// 逻辑处理，将有效数据拷贝到数组request中
				byte[] request = new byte[n];// 接收到的请求
				System.arraycopy(b, 0, request, 0, n);
				// 转换输入为整数
				int input = Integer.parseInt(new String(request, 0, n));
				// 对客户端的输入进行判断
				switch (input) {
				case 1:
					response = "Hello".getBytes();
					break;
				case 2:
					response = "Hello ZTE".getBytes();
					break;
				case 3:
					response = "bye bye".getBytes();
					flag = false;// 客户端输入3后，表明客户端要结束对话循环结束
					break;
				default:
					response = "what??".getBytes();
				}
				// 反馈到客户端
				os.write(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public void close() {
		try {
			os.close();
			is.close();
			socket.close();
		} catch (Exception e) {
		}
	}

}
