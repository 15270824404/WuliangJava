package shangji.zuoye1;

import java.io.*;
import java.net.*;

/*
 * ���������߼��߳�
 */
public class LogicThread extends Thread {
	Socket socket;
	InputStream is;
	OutputStream os;

	public LogicThread(Socket socket) {
		this.socket = socket;
		start();// �����߳�
	}

	/*
	 * �������ݵ��߼�����д��run()������
	 */
	public void run() {
		byte[] b = new byte[1024];
		byte[] response = new byte[1024];// �����ص���Ӧ
		try {
			os = socket.getOutputStream();
			is = socket.getInputStream();
			boolean flag = true;
			while (flag) {
				int n = is.read(b);// ��ȡ����
				// �߼���������Ч���ݿ���������request��
				byte[] request = new byte[n];// ���յ�������
				System.arraycopy(b, 0, request, 0, n);
				// ת������Ϊ����
				int input = Integer.parseInt(new String(request, 0, n));
				// �Կͻ��˵���������ж�
				switch (input) {
				case 1:
					response = "Hello".getBytes();
					break;
				case 2:
					response = "Hello ZTE".getBytes();
					break;
				case 3:
					response = "bye bye".getBytes();
					flag = false;// �ͻ�������3�󣬱����ͻ���Ҫ�����Ի�ѭ������
					break;
				default:
					response = "what??".getBytes();
				}
				// �������ͻ���
				os.write(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	public void close() {
		try {
			os.close();
			is.close();
			socket.close();
		} catch (Exception e) {
		}
	}

}
