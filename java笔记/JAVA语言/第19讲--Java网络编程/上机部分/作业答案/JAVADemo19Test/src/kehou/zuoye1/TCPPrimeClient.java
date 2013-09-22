package kehou.zuoye1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TCPPrimeClient {

	static BufferedReader br;
	static Socket socket;
	static InputStream is;
	static OutputStream os;
	final static String HOST = "127.0.0.1";
	final static int PORT = 10005;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		init();// ���ó�ʼ������
		while (true) {
			System.out.println("���������֣�");
			String input = readInput();// ���ö�ȡ����ķ���
			if (isQuit(input)) {// �����ж������Ƿ�Ϊ��quit���ķ��������ж�
				byte[] b = "quit".getBytes();
				send(b);// ������������������ݵķ�����������
				break;// ����
			}
			if (checkInput(input)) {// ����Ч�����ݺϷ��Եķ��������ж�
				send(input.getBytes());// �Ϸ��͵��÷������ݵķ�����������
				byte[] data = receive();// ���ý������ݵķ�����������
				parse(data);// ���ý������ݵķ����Խ��յ����ݽ��н��������
			} else {
				System.out.println("���벻�Ϸ������������룡");
			}
		}
		close();// ���ùر��������ӵķ���
	}

	/**
	 * ���շ���������
	 * 
	 * @return ��������
	 */
	private static byte[] receive() {
		try {
			byte[] b = new byte[1024];
			int n = is.read(b);
			byte[] data = new byte[n];
			System.arraycopy(b, 0, data, 0, n);
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;// ������쳣����null
	}

	/**
	 * ���������������
	 * 
	 * @param data
	 *            ��������
	 */
	private static void send(byte[] data) {
		try {
			os.write(data);
		} catch (Exception e) {
		}
	}

	/**
	 * Ч�������Ƿ�Ϸ�
	 * 
	 * @param input
	 *            ҪЧ�������
	 * @return �Ϸ�����true�����Ϸ�����false
	 */
	public static boolean checkInput(String input) {
		if (input == null) {
			return false;
		} else {
			try {
				int n = Integer.parseInt(input);// ���ܷ����쳣
				if (n >= 2) {
					return true;
				} else
					return false;
			} catch (Exception e) {
				return false;
			}
		}
	}

	/**
	 * Ч�������ǲ���quit
	 * 
	 * @param input
	 *            ҪЧ�������
	 * @return ��quit����true�����Ǿͷ���false
	 */
	private static boolean isQuit(String input) {
		if (input == null) {
			return false;
		} else {
			if (input.equalsIgnoreCase("quit"))
				return true;
			else
				return false;
		}
	}

	/**
	 * ��ȡ�ͻ�������
	 * 
	 * @return ���ض�ȡ��������
	 */
	private static String readInput() {
		try {
			return br.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * ��ʼ�������ĸ�������
	 */
	private static void init() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			socket = new Socket(HOST, PORT);
			is = socket.getInputStream();
			os = socket.getOutputStream();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��������
	 * 
	 * @param data
	 *            Ҫ����������
	 */
	private static void parse(byte[] data) {
		if (data == null) {
			System.out.println("�������˷������ݲ���ȷ��");
			return;
		}
		byte value = data[0];// ȡ��һ��byte
		switch (value) {
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����������");
			break;
		case 2:
			System.out.println("Э���ʽ����");
			break;
		}
	}

	/**
	 * �ر���������
	 */
	private static void close() {
		try {
			br.close();
			is.close();
			os.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
