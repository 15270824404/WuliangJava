package kehou.zuoye2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * 逻辑处理线程
 * 
 * @author ZHONG
 * 
 */
public class TCPLogicThread extends Thread {
	Socket s;
	static Random r = new Random();

	public TCPLogicThread(Socket s) {
		this.s = s;
		start();// 启动线程
	}

	public void run() {
		// 生成一个[0~50]的随机数
		int randomNumber = Math.abs(r.nextInt() % 51);
		// 猜数的次数
		int guessNumber = 0;
		InputStream is = null;
		OutputStream os = null;
		// 要发送的数据对象
		byte[] data = new byte[2];

		try {
			is = s.getInputStream();
			os = s.getOutputStream();

			while (true) {// 多次处理
				// 读取客户端发送来的数据
				byte[] b = new byte[1024];
				int n = is.read(b);
				// 取出有效数据
				String send = new String(b, 0, n);
				// 判断是否要结束
				if (send.equalsIgnoreCase("quit")) {
					break;
				}
				// 对接收到的数据进行解析、判断
				try {
					// 转换接收到的数据为整数
					int num = Integer.parseInt(send);
					// 猜的次数累加
					guessNumber++;
					// 将次数保存到数组中，将发送到客户端
					data[1] = (byte) guessNumber;
					// 对接收到的数据进行判断
					if (num > randomNumber) {
						data[0] = 1;
					} else if (num < randomNumber) {
						data[0] = 2;
					} else {
						data[0] = 0;
						// 在猜对的情况下，计数器置0，
						guessNumber = 0;
						// 再产生一个随机数，以便下次再猜
						randomNumber = Math.abs(r.nextInt() % 51);
					}
					// 将数据发送到客户端
					os.write(data);
				} catch (Exception e) {
					data[0] = 3;
					data[1] = (byte) guessNumber;
					os.write(data);// 发送异常数据
					break;
				}
				os.flush();// 强制发送
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				s.close();
			} catch (Exception e) {
			}
		}
	}
}
