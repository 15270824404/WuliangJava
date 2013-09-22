package tcp.socket;

import java.io.*;
import java.net.*;

/*
 * �򵥵�Socket�ͻ���
 * ����Ϊ�������ַ�����Hello�����������ˣ�����ӡ���������˵ķ���
 */
public class SimpleSocketClient {

	public static void main(String[] args) {
		// �����ͻ��˶���
		Socket socket = null;
		// ������
		InputStream is = null;
		// �����
		OutputStream os = null;
		try {
			// ��������IP��ַ
			String serverIP = InetAddress.getByName("localhost")
					.getHostAddress();
			// System.out.println(serverIP);
			// �������˿ں�
			int port = 10000;
			String data = "Hello";
			// ��������
			socket = new Socket(serverIP, port);
			// �������������
			os = socket.getOutputStream();
			// �����ֽ���
			os.write(data.getBytes());
			// ��ȡ������
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			// ��ȡ����
			int n = is.read(b);
			// ����ȡ������ת�����ַ���
			String getString = new String(b, 0, n);
			// ����̨�������
			System.out.println("������������" + getString);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}
