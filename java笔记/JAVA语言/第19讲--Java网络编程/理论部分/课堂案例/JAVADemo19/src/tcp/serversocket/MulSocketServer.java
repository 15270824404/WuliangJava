package tcp.serversocket;

import java.io.*;
import java.net.*;

/*
 * ��������
 * ���ܣ����ͻ��˷��͵����ݷ������ͻ���
 */
public class MulSocketServer {
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
			System.out.println("�������Ѿ�������");
			// �������
			socket = server.accept();
			// ���տͻ��˷��͵�����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			byte[] b = new byte[1024];
			for (int i = 0; i < 3; i++) {
				int n = is.read(b);
				// ���
				System.out.println("�ͻ��˷��͵�����Ϊ��" + new String(b, 0, n));
				// ��ͻ��˷��ͷ�������
				os.write(b, 0, n);
			}
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
