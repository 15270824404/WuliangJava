package kewai.zuoye1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ʵ�������жϵ��߳��࣬UDPʵ��
 * 
 * @author ZHONG
 * 
 */
public class UDPPrimeLogicThread extends Thread {
	DatagramSocket ds;
	DatagramPacket receiveDp;

	public UDPPrimeLogicThread(DatagramSocket ds, DatagramPacket receiveDp) {
		this.ds = ds;
		this.receiveDp = receiveDp;
		start();// �����߳�
	}

	/**
	 * ���ڴ����߳������run()����
	 */
	public void run() {
		byte[] b;
		try {
			// ���տͻ�������
			byte[] data = receiveDp.getData();
			// ��ȡ���ݳ���
			int n = receiveDp.getLength();
			// �ͻ��˵�ַ����
			InetAddress clientAddress = receiveDp.getAddress();
			// �ͻ��˶˿ں�
			int clientPort = receiveDp.getPort();
			// �����߼��������õ����������˷�������Ҫ���͵�����
			String input = new String(data, 0, n);
			b = logic(input);
			System.out.println("�������˽����" + b[0]);

			// ��������
			DatagramPacket sendDp = new DatagramPacket(b, b.length,
					clientAddress, clientPort);
			// ����
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
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
	private byte[] logic(String input) {
		byte[] b = new byte[1];// ����0��1��2����
		if (input == null) {
			b[0] = 2;
			return b;
		}
		try {
			int n = Integer.parseInt(input);
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

}
