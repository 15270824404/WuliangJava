package kewai.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP连接方式的服务器端
 * 
 * 实现功能：接收客户端的数据，判断数字关系 *
 * 
 * @author ZHONG
 * 
 */
public class UDPGuessMunberServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10001);
			System.out.println("服务器已经启动：");
			while (true) {
				byte[] b = new byte[1024];
				DatagramPacket receiveDp = new DatagramPacket(b, b.length);
				ds.receive(receiveDp);// 调用阻塞方法等待获取数据
				// 启动线程处理获得的连接和数据
				// System.out.println(new
				// String(receiveDp.getData(),0,receiveDp.getLength()));
				new UDPRandomLogicThread(ds, receiveDp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
