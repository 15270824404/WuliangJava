package kewai.zuoye2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 首先建立一个到IP地址为127.0.0.1的端口为10001的连接
 * 
 * 然后进行各个流的初始化工作，
 * 
 * 将逻辑控制的代码放入一个while循环中，这样可以在客户端多次进行输入。
 * 
 * 在循环内部，首先判断用户输入的是否为quit字符串，如果是，则结束程序
 * 
 * 如果不是，首先校验输入的是否是数字，如果不是则直接输出“输入错误!”并继续接收用户输入
 * 
 * 如果是数字则发送给服务器端，并根据服务器端的反馈显示相应的提示信息
 * 
 * 最后关闭流和连接，结束客户端程序
 * 
 * UDP连接方式的客户端
 * 
 */
public class UDPGuessMumberClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket sendDp = null;
		DatagramPacket receiveDp = null;

		BufferedReader br = null;

		try {
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds = new DatagramSocket();
			br = new BufferedReader(new InputStreamReader(System.in));
			// 猜数的次数
			int number = 0;
			while (true) {
				number++;
				System.out.println("请输入你猜的数字：");
				String s = br.readLine();

				if (s.equalsIgnoreCase("quit")) {
					break;
				}

				boolean flag = true;

				// 判断是不是整数
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					flag = false;
				}

				if (flag) {
					System.out.println("输入的数字是：" + s);

					// 封装要发送的数据
					sendDp = new DatagramPacket(s.getBytes(),
							s.getBytes().length, InetAddress
									.getByName("127.0.0.1"), 10001);
					// 发送数据
					ds.send(sendDp);

					// 接收数据
					ds.receive(receiveDp);
					byte[] get = receiveDp.getData();

					switch (get[0]) {
					case 0:
						System.out.println("相等！祝贺你！");
						number = 0;
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
					System.out.println("你已经猜了" + number + "次！");
					if (number >= 5) {
						System.out.println("你挂了！");
						break;
					}
				} else {
					System.out.println("输入错误！");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try {
			// br.close();
			// ds.close();
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
		}
	}

}
