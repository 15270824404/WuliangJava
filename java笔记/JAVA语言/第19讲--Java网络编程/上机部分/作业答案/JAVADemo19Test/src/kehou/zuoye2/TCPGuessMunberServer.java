package kehou.zuoye2;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP连接方式的服务器端
 * 
 * 实现功能：接收客户端的数据，判断数字关系 *
 * 
 * @author ZHONG
 * 
 */
public class TCPGuessMunberServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10001);
			System.out.println("服务器已经启动：");
			while (true) {
				Socket s = ss.accept();// 调用阻塞方法等待获取连接
				// 启动线程处理获得的连接
				new TCPLogicThread(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
