package kewai.zuoye3.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class LogicThread implements Runnable {

	DatagramSocket ds;
	DatagramPacket receiveDp;

	static char[] bigNumber = { '��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��',
			'��' };

	public LogicThread(DatagramSocket ds, DatagramPacket receiveDp) {
		this.ds = ds;
		this.receiveDp = receiveDp;
		new Thread(this).start();
	}

	public void run() {
		try {
			// �������
			byte[] b = receiveDp.getData();
			int n = receiveDp.getLength();
			String s = new String(b, 0, n);
			String number = new Integer(Integer.parseInt(s)).toString();
			// ��ý��յ����������ַ�����
			char[] inputnumber = number.toCharArray();
			// ���ڱ����õĽ������
			char[] resultnumber = toBigNumber(inputnumber);

			// ��char��������ת���ַ����顪����װ����
			byte[] send = getResult(resultnumber);
			System.out.println("�����������" + s + "�Ĵ�д��ʽ�ǣ�"
					+ new String(send, 0, send.length));
			// ��װ����
			DatagramPacket sendDp = new DatagramPacket(send, send.length,
					receiveDp.getAddress(), receiveDp.getPort());
			// ��������
			ds.send(sendDp);

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	/**
	 * ת����д
	 * 
	 * @param inputnumber
	 * @return
	 */
	private char[] toBigNumber(char[] inputnumber) {
		char[] resultnumber = new char[inputnumber.length];
		// ת����д
		for (int i = 0; i < inputnumber.length; i++) {
			resultnumber[i] = bigNumber[Integer.parseInt(new Character(
					inputnumber[i]).toString())];
			// ����������룬����ͬ��
			// resultnumber[i] = bigNumber[inputnumber[i] - 48];
		}
		return resultnumber;
	}

	/**
	 * ���ַ�����ת�����ֽ�����
	 * 
	 * @param input
	 * @return
	 */
	static private byte[] getResult(char[] input) {
		byte[] b;

		// ��ת�����ַ���
		StringBuffer bf = new StringBuffer();
		for (char c : input) {
			bf.append(new Character(c).toString());
		}
		b = bf.toString().getBytes();
		return b;
	}

}
