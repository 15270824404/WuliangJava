package kewai.zuoye1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 课后作业3
 * 
 * 服务器端
 * 
 * UDP连接实现课后作业1功能
 * 
 * @author ZHONG
 * 
 */
public class UDPPrimeServer {

	public static void main(String[] args) {
		final int PORT = 10005;
		DatagramSocket ds = null;// UDP连接对象
		DatagramPacket receiveDp = null;

		try {
			ds = new DatagramSocket(PORT);// 监听端口
			System.out.println("服务器端已启动：");
			while (true) {
				byte[] b = new byte[1024];
				receiveDp = new DatagramPacket(b, b.length);
				ds.receive(receiveDp);
				new UDPPrimeLogicThread(ds, receiveDp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
