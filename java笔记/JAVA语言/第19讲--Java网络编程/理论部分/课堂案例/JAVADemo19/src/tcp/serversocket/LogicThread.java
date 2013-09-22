package tcp.serversocket;

import java.io.*;
import java.net.*;

/*
 * ���������߼��̡߳�����ͻ��˵ķ�����ʵ��
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
		try {
			os = socket.getOutputStream();
			is = socket.getInputStream();
			for (int i = 0; i < 3; i++) {
				int n = is.read(b);// ��ȡ����
				// �߼���������Ч���ݿ���������response��
				byte[] response = new byte[n];
				System.arraycopy(b, 0, response, 0, n);
				System.out.println("�̴߳���" + new String(response, 0, n));
				// �������ͻ���
				os.write(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	/**
	 * �ر������Դ
	 */
	public void close() {
		try {
			os.close();
			is.close();
			socket.close();
		} catch (Exception e) {
		}
	}

}
