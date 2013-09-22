package kehou.zuoye1;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPPrimeServer {

	final static int PORT = 10005;

	public static void main(String[] args) {
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(PORT);
			System.out.println("服务器端已启动：");
			while (true) {
				Socket s = ss.accept();
				new TCPPrimeLogicThread(s);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
