package kewai.zuoye1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPPrimeClient {

	static BufferedReader br;
	static DatagramSocket ds;
	static DatagramPacket sendDp;
	static DatagramPacket receiveDp;
	final static String HOST = "127.0.0.1";
	final static int PORT = 10005;

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		init();// ���ó�ʼ������
		while (true) {
			System.out.println("���������֣�");
			String input = readInput();// ���ö�ȡ����ķ���
			if (isQuit(input)) {// �����ж������Ƿ�Ϊ��quit���ķ��������ж�
				break;// ����
			}
			if (checkInput(input)) {// ����Ч�����ݺϷ��Եķ��������ж�
				// �Ϸ��ͷ�������
				sendDp = new DatagramPacket(input.getBytes(),
						input.getBytes().length, InetAddress.getByName(HOST),
						PORT);
				ds.send(sendDp);

				// ��������
				ds.receive(receiveDp);
				byte[] data = receiveDp.getData();

				parse(data);// ���ý������ݵķ����Խ��յ����ݽ��н��������
			} else {
				System.out.println("���벻�Ϸ������������룡");
			}
		}
		close();// ���ùر��������ӵķ���
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
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds = new DatagramSocket();
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
			ds.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
