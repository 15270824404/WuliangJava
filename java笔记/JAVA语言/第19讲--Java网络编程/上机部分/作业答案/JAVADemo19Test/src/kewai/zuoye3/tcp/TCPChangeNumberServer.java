package kewai.zuoye3.tcp;

/**
 * 课后作业5
 * 
 * 使用TCP方式，实现将客户端输入的阿拉伯数字转换为中文大写数字

 */
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP方式服务器端
 * 
 * @author ZHONG
 * 
 */
public class TCPChangeNumberServer {

	public static void main(String[] args) {
		final int PORT = 10001;
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(PORT);
			System.out.println("服务器端已启动：");
			while (true) {
				Socket s = ss.accept();// 启动阻塞方法，等待客户端连接
				new LogicThread(s);// 调用线程处理连接
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
