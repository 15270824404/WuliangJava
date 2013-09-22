package kehou.zuoye1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ʵ�������жϵ��߳���
 * 
 * @author ZHONG
 * 
 */
public class TCPPrimeLogicThread extends Thread {
	Socket socket;
	InputStream is;
	OutputStream os;

	public TCPPrimeLogicThread(Socket socket) {
		this.socket = socket;
		init();// ���ó�ʼ������
		start();// �����߳�
	}

	/**
	 * ���ڴ����߳������run()����
	 */
	public void run() {
		while (true) {
			byte[] data = receive();// ���÷������տͻ�������
			if (isQuit(data)) {// ������յ�quit���˳�ѭ��
				break;
			}
			// �����߼��������õ�����
			byte[] b = logic(data);
			// ��������
			send(b);
		}
		close();
	}

	/**
	 * ��ʼ����������ض���
	 */
	private void init() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
		}
	}

	/**
	 * ���տͻ�������
	 * 
	 * @return �ͻ��˷�����������
	 */
	private byte[] receive() {
		byte[] b = new byte[1024];
		try {
			int n = is.read(b);
			byte[] data = new byte[n];
			System.arraycopy(b, 0, data, 0, n);
			return data;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * ��ͻ��˷�������
	 * 
	 * @param data
	 *            ��������
	 */
	private void send(byte[] data) {
		try {
			os.write(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * �жϽ��յ��������Ƿ��ǡ�quit��
	 * 
	 * @param data
	 *            Ҫ�жϵ�����
	 * @return �Ǿͷ���true�����Ǿͷ���false
	 */
	private boolean isQuit(byte[] data) {
		if (data == null) {
			return false;
		} else {
			String s = new String(data);
			if (s.equalsIgnoreCase("qiut"))
				return true;
			else
				return false;
		}
	}

	/**
	 * �ж�һ�������ǲ�������
	 * 
	 * @param n
	 *            Ҫ�жϵ�����
	 * @return �жϽ��
	 */
	private boolean isPrime(int n) {
		boolean b = true;
		for (int i = 2; i <= Math.sqrt(n); i++) {// �жϵ���ǰ����ƽ�����Ϳ�����
			if (n % i == 0) {
				b = false;
				break;
			}
		}
		return b;
	}

	/**
	 * �Խ��յ������ݽ����߼�����
	 * 
	 * @param data
	 * @return
	 */
	private byte[] logic(byte[] data) {
		byte[] b = new byte[1];// ����0��1��2����
		if (data == null) {
			b[0] = 2;
			return b;
		}

		try {
			String s = new String(data);
			int n = Integer.parseInt(s);
			if (n >= 2) {
				boolean flag = isPrime(n);// �����ж������ķ��������ж�
				if (flag) {
					b[0] = 0;// ����������
				} else {
					b[0] = 1;// ������������
				}
			} else {
				b[0] = 2;// ��ʾ��ʽ����
				System.out.println(n);
			}
		} catch (Exception e) {
			e.printStackTrace();
			b[0] = 2;
		}
		return b;
	}

	/**
	 * �ر���������
	 */
	private void close() {
		try {
			is.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
