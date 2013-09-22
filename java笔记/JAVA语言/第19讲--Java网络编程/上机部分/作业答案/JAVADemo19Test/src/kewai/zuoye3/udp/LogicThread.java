package kewai.zuoye3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class LogicThread implements Runnable {

	DatagramSocket ds;
	DatagramPacket receiveDp;

	static char[] bigNumber = { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌',
			'玖' };

	public LogicThread(DatagramSocket ds, DatagramPacket receiveDp) {
		this.ds = ds;
		this.receiveDp = receiveDp;
		new Thread(this).start();
	}

	public void run() {
		try {
			// 获得数据
			byte[] b = receiveDp.getData();
			int n = receiveDp.getLength();
			String s = new String(b, 0, n);
			String number = new Integer(Integer.parseInt(s)).toString();
			// 获得接收到的整数的字符数组
			char[] inputnumber = number.toCharArray();
			// 用于保存获得的结果数组
			char[] resultnumber = toBigNumber(inputnumber);

			// 将char类型数据转成字符数组——封装数据
			byte[] send = getResult(resultnumber);
			System.out.println("服务器输出：" + s + "的大写形式是："
					+ new String(send, 0, send.length));
			// 封装数据
			DatagramPacket sendDp = new DatagramPacket(send, send.length,
					receiveDp.getAddress(), receiveDp.getPort());
			// 发送数据
			ds.send(sendDp);

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	/**
	 * 转换大写
	 * 
	 * @param inputnumber
	 * @return
	 */
	private char[] toBigNumber(char[] inputnumber) {
		char[] resultnumber = new char[inputnumber.length];
		// 转换大写
		for (int i = 0; i < inputnumber.length; i++) {
			resultnumber[i] = bigNumber[Integer.parseInt(new Character(
					inputnumber[i]).toString())];
			// 或用下面代码，功能同上
			// resultnumber[i] = bigNumber[inputnumber[i] - 48];
		}
		return resultnumber;
	}

	/**
	 * 将字符数组转换成字节数组
	 * 
	 * @param input
	 * @return
	 */
	static private byte[] getResult(char[] input) {
		byte[] b;

		// 先转换成字符串
		StringBuffer bf = new StringBuffer();
		for (char c : input) {
			bf.append(new Character(c).toString());
		}
		b = bf.toString().getBytes();
		return b;
	}

}
