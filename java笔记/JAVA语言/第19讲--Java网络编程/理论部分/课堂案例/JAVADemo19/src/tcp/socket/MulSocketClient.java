package tcp.socket;

import java.io.*;
import java.net.*;

/*
 * ���õ�Socket�ͻ���
 * ����Ϊ�������ַ�����Hello�����������ˣ�����ӡ���������˵ķ���
 */
public class MulSocketClient {

	public static void main(String[] args) {
		// �����ͻ��˶���
		Socket socket = null;
		// ������
		InputStream is = null;
		// �����
		OutputStream os = null;
		String[] data = { "First", "Second", "Third" };
		try {
			// ��������
			socket = new Socket("127.0.0.1", 10000);
			// �������������
			os = socket.getOutputStream();
			// ��ȡ������
			is = socket.getInputStream();
			byte[] b = new byte[1024];
			// ��ѭ�����������������η��͵���������
			for (int i = 0; i < data.length; i++) {
				// �����ֽ���
				os.write(data[i].getBytes());
				// ��ȡ����
				int n = is.read(b);
				// ����̨�������
				System.out.println("������������" + new String(b, 0, n));
			}
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
