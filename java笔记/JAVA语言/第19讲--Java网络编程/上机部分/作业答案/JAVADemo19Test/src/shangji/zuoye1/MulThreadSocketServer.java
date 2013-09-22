package shangji.zuoye1;

import java.net.ServerSocket;
import java.net.Socket;


/*
 * 支持多客户端的服务器端实现
 */
public class MulThreadSocketServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 10000;

		try {
			// 监听端口
			serverSocket = new ServerSocket(port);
			System.out.println("多客户端服务器已启动：");
			while (true) {
				// 获得连接
				socket = serverSocket.accept();
				// 启动线程，处理连接
				new LogicThread(socket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (Exception e) {
			}
		}
	}

}
