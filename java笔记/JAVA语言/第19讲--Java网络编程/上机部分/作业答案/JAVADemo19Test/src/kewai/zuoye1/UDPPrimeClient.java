package kewai.zuoye1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPPrimeClient {

	static BufferedReader br;
	static DatagramSocket ds;
	static DatagramPacket sendDp;
	static DatagramPacket receiveDp;
	final static String HOST = "127.0.0.1";
	final static int PORT = 10005;

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		init();// 调用初始化方法
		while (true) {
			System.out.println("请输入数字：");
			String input = readInput();// 调用读取输入的方法
			if (isQuit(input)) {// 调用判断输入是否为“quit”的方法进行判断
				break;// 结束
			}
			if (checkInput(input)) {// 调用效验数据合法性的方法进行判断
				// 合法就发送数据
				sendDp = new DatagramPacket(input.getBytes(),
						input.getBytes().length, InetAddress.getByName(HOST),
						PORT);
				ds.send(sendDp);

				// 接收数据
				ds.receive(receiveDp);
				byte[] data = receiveDp.getData();

				parse(data);// 调用解析数据的方法对接收的数据进行解析，输出
			} else {
				System.out.println("输入不合法，请重新输入！");
			}
		}
		close();// 调用关闭流和连接的方法
	}

	/**
	 * 效验输入是否合法
	 * 
	 * @param input
	 *            要效验的数据
	 * @return 合法返回true，不合法返回false
	 */
	public static boolean checkInput(String input) {
		if (input == null) {
			return false;
		} else {
			try {
				int n = Integer.parseInt(input);// 可能发生异常
				if (n >= 2) {
					return true;
				} else
					return false;
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * 效验输入是不是quit
	 * 
	 * @param input
	 *            要效验的输入
	 * @return 是quit返回true，不是就返回false
	 */
	private static boolean isQuit(String input) {
		if (input == null) {
			return false;
		} else {
			if (input.equalsIgnoreCase("quit"))
				return true;
			else
				return false;
		}
	}

	/**
	 * 读取客户端输入
	 * 
	 * @return 返回读取到的数据
	 */
	private static String readInput() {
		try {
			return br.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * 初始化声明的各个对象
	 */
	private static void init() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds = new DatagramSocket();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 解析数据
	 * 
	 * @param data
	 *            要解析的数据
	 */
	private static void parse(byte[] data) {
		if (data == null) {
			System.out.println("服务器端反馈数据不正确！");
			return;
		}
		byte value = data[0];// 取第一个byte
		switch (value) {
		case 0:
			System.out.println("质数！");
			break;
		case 1:
			System.out.println("不是质数！");
			break;
		case 2:
			System.out.println("协议格式错误！");
			break;
		}
	}

	/**
	 * 关闭流和连接
	 */
	private static void close() {
		try {
			br.close();
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
