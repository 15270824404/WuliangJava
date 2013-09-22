package kewai.zuoye3.udp;

/**
 * 课后作业5
 * 
 * 使用UDP方式，实现将客户端输入的阿拉伯数字转换为中文大写数字

 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP方式服务器端
 * 
 * @author ZHONG
 * 
 */
public class UDPChangeNumberServer {

	public static void main(String[] args) {
		final int PORT = 10001;

		DatagramSocket ds = null;// UDP连接对象
		DatagramPacket receiveDp = null;// 接收数据包对象

		try {
			ds = new DatagramSocket(PORT);
			System.out.println("服务器端已启动：");
			while (true) {
				byte[] b = new byte[1024];
				receiveDp = new DatagramPacket(b, b.length);// 初始化接收数据包对象
				ds.receive(receiveDp);// 启动阻塞方法，等待客户端连接
				new LogicThread(ds, receiveDp);// 调用线程处理连接
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
