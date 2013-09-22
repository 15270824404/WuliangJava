package tcp.serversocket;

import java.io.*;
import java.net.*;

/*
 * ��������
 * ���ܣ����ͻ��˷��͵����ݷ������ͻ���
 */
public class SimpleSocketServer {

	public static void main(String[] args) {
		// �����������˶���
		ServerSocket server = null;
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		int port = 10000;
		try {
			// ���ݶ˿ںŽ��м���
			server = new ServerSocket(port);
			// �������
			socket = server.accept();
			// ���տͻ��˷��͵�����
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			int n = is.read(b);
			// ���
			System.out.println("�ͻ��˷��͵�����Ϊ��" + new String(b, 0, n));
			// ��ͻ��˷��ͷ�������
			os = socket.getOutputStream();
			os.write(b, 0, n);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				socket.close();
				server.close();
			} catch (IOException e) {
			}
		}
	}

}
