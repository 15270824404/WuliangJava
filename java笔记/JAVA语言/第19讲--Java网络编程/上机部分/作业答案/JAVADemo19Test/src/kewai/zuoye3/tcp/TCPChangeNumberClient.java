package kewai.zuoye3.tcp;

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
public class TCPChangeNumberClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		BufferedReader br = null;

		try {
			socket = new Socket("127.0.0.1", 10001);
			os = socket.getOutputStream();
			is = socket.getInputStream();
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
				os.write(s.getBytes());
				byte[] b = new byte[1024];
				// 接收反馈
				int n = is.read(b);
				// 客户端输出
				System.out.println(s + "的大写形式是：" + new String(b, 0, n));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				is.close();
				os.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
