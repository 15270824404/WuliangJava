package kewai.zuoye1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 实现质数判断的线程类，UDP实现
 * 
 * @author ZHONG
 * 
 */
public class UDPPrimeLogicThread extends Thread {
	DatagramSocket ds;
	DatagramPacket receiveDp;

	public UDPPrimeLogicThread(DatagramSocket ds, DatagramPacket receiveDp) {
		this.ds = ds;
		this.receiveDp = receiveDp;
		start();// 启动线程
	}

	/**
	 * 用于处理线程任务的run()方法
	 */
	public void run() {
		byte[] b;
		try {
			// 接收客户端数据
			byte[] data = receiveDp.getData();
			// 获取数据长度
			int n = receiveDp.getLength();
			// 客户端地址对象
			InetAddress clientAddress = receiveDp.getAddress();
			// 客户端端口号
			int clientPort = receiveDp.getPort();
			// 进行逻辑处理，并得到反馈——此反馈才是要发送的数据
			String input = new String(data, 0, n);
			b = logic(input);
			System.out.println("服务器端结果：" + b[0]);

			// 反馈数据
			DatagramPacket sendDp = new DatagramPacket(b, b.length,
					clientAddress, clientPort);
			// 发送
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 判断一个整数是不是质数
	 * 
	 * @param n
	 *            要判断的整数
	 * @return 判断结果
	 */
	private boolean isPrime(int n) {
		boolean b = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {// 判断到当前数的平方根就可以了
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

	/**
	 * 对接收到的数据进行逻辑处理
	 * 
	 * @param data
	 * @return
	 */
	private byte[] logic(String input) {
		byte[] b = new byte[1];// 返回0、1、2即可
		if (input == null) {
			b[0] = 2;
			return b;
		}
		try {
			int n = Integer.parseInt(input);
			if (n >= 2) {
				boolean flag = isPrime(n);// 调用判断质数的方法进行判断
				if (flag) {
					b[0] = 0;// 表明是质数
				} else {
					b[0] = 1;// 表明不是质数
				}
			} else {
				b[0] = 2;// 表示格式错误
				System.out.println(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			b[0] = 2;
		}
		return b;
	}

}
