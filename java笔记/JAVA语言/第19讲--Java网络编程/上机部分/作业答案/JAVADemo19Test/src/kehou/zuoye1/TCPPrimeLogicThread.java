package kehou.zuoye1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 实现质数判断的线程类
 * 
 * @author ZHONG
 * 
 */
public class TCPPrimeLogicThread extends Thread {
	Socket socket;
	InputStream is;
	OutputStream os;

	public TCPPrimeLogicThread(Socket socket) {
		this.socket = socket;
		init();// 调用初始化方法
		start();// 启动线程
	}

	/**
	 * 用于处理线程任务的run()方法
	 */
	public void run() {
		while (true) {
			byte[] data = receive();// 调用方法接收客户端数据
			if (isQuit(data)) {// 如果接收到quit，退出循环
				break;
			}
			// 进行逻辑处理，并得到反馈
			byte[] b = logic(data);
			// 反馈数据
			send(b);
		}
		close();
	}

	/**
	 * 初始化声明的相关对象
	 */
	private void init() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
		}
	}

	/**
	 * 接收客户端数据
	 * 
	 * @return 客户端发送来的数据
	 */
	private byte[] receive() {
		byte[] b = new byte[1024];
		try {
			int n = is.read(b);
			byte[] data = new byte[n];
			System.arraycopy(b, 0, data, 0, n);
			return data;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 向客户端发送数据
	 * 
	 * @param data
	 *            数据内容
	 */
	private void send(byte[] data) {
		try {
			os.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 判断接收到的数据是否是“quit”
	 * 
	 * @param data
	 *            要判断的数据
	 * @return 是就返回true，不是就返回false
	 */
	private boolean isQuit(byte[] data) {
		if (data == null) {
			return false;
		} else {
			String s = new String(data);
			if (s.equalsIgnoreCase("qiut"))
				return true;
			else
				return false;
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
	private byte[] logic(byte[] data) {
		byte[] b = new byte[1];// 返回0、1、2即可
		if (data == null) {
			b[0] = 2;
			return b;
		}

		try {
			String s = new String(data);
			int n = Integer.parseInt(s);
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

	/**
	 * 关闭流和连接
	 */
	private void close() {
		try {
			is.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
