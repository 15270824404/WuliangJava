package shangji.zuoye1;

import java.net.ServerSocket;
import java.net.Socket;


/*
 * ֧�ֶ�ͻ��˵ķ�������ʵ��
 */
public class MulThreadSocketServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		int port = 10000;

		try {
			// �����˿�
			serverSocket = new ServerSocket(port);
			System.out.println("��ͻ��˷�������������");
			while (true) {
				// �������
				socket = serverSocket.accept();
				// �����̣߳���������
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
