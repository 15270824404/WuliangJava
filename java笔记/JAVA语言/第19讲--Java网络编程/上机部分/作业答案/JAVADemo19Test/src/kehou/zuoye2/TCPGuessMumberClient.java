package kehou.zuoye2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 首先建立一个到IP地址为127.0.0.1的端口为10001的连接
 * 然后进行各个流的初始化工作，
 * 将逻辑控制的代码放入一个while循环中，这样可以在客户端多次进行输入。
 * 在循环内部，首先判断用户输入的是否为quit字符串，如果是，则结束程序
 * 如果不是，首先校验输入的是否是数字，如果不是则直接输出“输入错误!”并继续接收用户输入
 * 如果是数字则发送给服务器端，并根据服务器端的反馈显示相应的提示信息
 * 最后关闭流和连接，结束客户端程序
 */
public class TCPGuessMumberClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		BufferedReader br = null;
		byte[] data = new byte[2];

		try {
			socket = new Socket("127.0.0.1", 10001);
			os = socket.getOutputStream();
			is = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("请输入数字：");
				String s = br.readLine();

				if (s.equalsIgnoreCase("quit")) {
					os.write(s.getBytes());
					break;
				}

				boolean b = true;

				// 判断是不是整数
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					b = false;
				}

				if (b) {
					// 发送数据
					os.write(s.getBytes());
					is.read(data);
					switch (data[0]) {
					case 0:
						System.out.println("相等！祝贺你！");
						break;
					case 1:
						System.out.println("大了！");
						break;
					case 2:
						System.out.println("小了！");
						break;
					default:
						System.out.println("其他错误！");
					}
					System.out.println("你已经猜了" + data[1] + "次！");
					if (data[1] >= 5) {
						System.out.println("你挂了！");
						// 通知服务器关闭线程
						os.write("quit".getBytes());
						break;
					}
				} else {
					System.out.println("输入错误！");
				}
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
