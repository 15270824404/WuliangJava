package kewai.zuoye3.udp;

import java.io.*;
import java.net.*;

/**
 * �ͻ��˳���
 * 
 * ���ܣ������û����룬���û����봫�͵�������
 * 
 * ���շ��������������ڿ���̨���
 * 
 * @author ZHONG
 * 
 */
public class UDPChangeNumberClient {

	public static void main(String[] args) {

		DatagramSocket ds = null;// ���Ӷ���
		DatagramPacket sendDp = null;// �������ݰ�����
		DatagramPacket receiveDp = null;// �������ݰ�����

		BufferedReader br = null;

		try {
			ds = new DatagramSocket();
			InetAddress address = InetAddress.getByName("127.0.0.1");
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);

			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				System.out.print("���������֣�");
				String s = br.readLine();
				if (s.equalsIgnoreCase("quit")) {
					break;
				}
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					System.out.println("������Ĳ�������������������");
					continue;
				}
				// ��������
				byte[] data = s.getBytes();
				// ��װ����
				sendDp = new DatagramPacket(data, data.length, address, 10001);
				// ��������
				ds.send(sendDp);
				// ���շ���
				ds.receive(receiveDp);// ���������յ��������ݰ�������
				byte[] response = receiveDp.getData();
				int len = receiveDp.getLength();

				// �ͻ������
				System.out
						.println(s + "�Ĵ�д��ʽ�ǣ�" + new String(response, 0, len));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ds.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
