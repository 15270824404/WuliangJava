package shangji.zuoye1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * 复用的Socket客户端
 * 功能为：接收控制台的输入并发送到服务器端，并打印出服务器端的反馈
 * 其中只接收 控制台输入的整数
 */
public class MulSocketClient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 声明客户端对象
		Socket socket = null;
		// 输入流
		InputStream is = null;
		// 输出流
		OutputStream os = null;

		try {
			// 建立连接
			socket = new Socket("127.0.0.1", 10000);
			// 创建输出流对象
			os = socket.getOutputStream();
			// 获取输入流
			is = socket.getInputStream();
			// 用循环保持对话
			while (true) {
				byte[] b = new byte[1024];
				System.out.println("请输入一个整数：（1～3之间）");
				// 接收控制台输入
				String in = input.next();
				try {
					Integer.parseInt(in);// 进行转换，有异常表明不是整数
				} catch (Exception e) {
					continue;
				}
				// 发送字节流
				os.write(in.getBytes());
				// 读取数据
				int n = is.read(b);
				// 控制台输出数据
				String response = new String(b, 0, n);
				System.out.println("服务器反馈：" + response);
				// 服务器返回"bye bye"后，不再运行，停止循环
				if (response.equals("bye bye")) {
					break;
				}
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
