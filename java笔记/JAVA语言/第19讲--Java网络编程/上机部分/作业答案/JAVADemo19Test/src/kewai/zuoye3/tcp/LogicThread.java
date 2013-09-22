package kewai.zuoye3.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LogicThread implements Runnable {

	Socket s;

	static char[] bigNumber = { '��', 'Ҽ', '��', '��', '��', '��', '½', '��', '��',
			'��' };

	public LogicThread(Socket s) {
		this.s = s;
		new Thread(this).start();
	}

	public void run() {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = s.getInputStream();
			os = s.getOutputStream();
			while (true) {
				byte[] b = new byte[1024];
				int n = is.read(b);
				String s = new String(b, 0, n);
				if (s.equalsIgnoreCase("quit")) {
					break;
				}
				String number = new Integer(Integer.parseInt(s)).toString();
				// ��ý��յ����������ַ�����
				char[] inputnumber = number.toCharArray();
				// ���ڱ����õĽ������
				char[] resultnumber = toBigNumber(inputnumber);

				// ��char��������ת���ַ����顪����װ����
				byte[] send = getResult(resultnumber);
				System.out.println("�����������" + s + "�Ĵ�д��ʽ�ǣ�"
						+ new String(send, 0, send.length));
				// ��������
				os.write(send);
			}
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
