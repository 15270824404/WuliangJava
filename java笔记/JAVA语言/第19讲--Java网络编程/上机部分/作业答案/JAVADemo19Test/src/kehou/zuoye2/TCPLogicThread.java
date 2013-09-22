package kehou.zuoye2;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * �߼������߳�
 * 
 * @author ZHONG
 * 
 */
public class TCPLogicThread extends Thread {
	Socket s;
	static Random r = new Random();

	public TCPLogicThread(Socket s) {
		this.s = s;
		start();// �����߳�
	}

	public void run() {
		// ����һ��[0~50]�������
		int randomNumber = Math.abs(r.nextInt() % 51);
		// �����Ĵ���
		int guessNumber = 0;
		InputStream is = null;
		OutputStream os = null;
		// Ҫ���͵����ݶ���
		byte[] data = new byte[2];

		try {
			is = s.getInputStream();
			os = s.getOutputStream();

			while (true) {// ��δ���
				// ��ȡ�ͻ��˷�����������
				byte[] b = new byte[1024];
				int n = is.read(b);
				// ȡ����Ч����
				String send = new String(b, 0, n);
				// �ж��Ƿ�Ҫ����
				if (send.equalsIgnoreCase("quit")) {
					break;
				}
				// �Խ��յ������ݽ��н������ж�
				try {
					// ת�����յ�������Ϊ����
					int num = Integer.parseInt(send);
					// �µĴ����ۼ�
					guessNumber++;
					// ���������浽�����У������͵��ͻ���
					data[1] = (byte) guessNumber;
					// �Խ��յ������ݽ����ж�
					if (num > randomNumber) {
						data[0] = 1;
					} else if (num < randomNumber) {
						data[0] = 2;
					} else {
						data[0] = 0;
						// �ڲ¶Ե�����£���������0��
						guessNumber = 0;
						// �ٲ���һ����������Ա��´��ٲ�
						randomNumber = Math.abs(r.nextInt() % 51);
					}
					// �����ݷ��͵��ͻ���
					os.write(data);
				} catch (Exception e) {
					data[0] = 3;
					data[1] = (byte) guessNumber;
					os.write(data);// �����쳣����
					break;
				}
				os.flush();// ǿ�Ʒ���
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				s.close();
			} catch (Exception e) {
			}
		}
	}
}
