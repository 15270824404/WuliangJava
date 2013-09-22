package shangji.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

/*
 * �򵥵�UDP�ͻ��ˣ�ʵ����������˷���ϵͳʱ�书��
 */
public class SimpleUDPClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;// ���Ӷ���
		DatagramPacket sendDp = null;// Ҫ���͵����ݰ�����
		DatagramPacket receiveDp = null;// ���յ����ݰ�����
		String serverHost = "127.0.0.1";// ������IP
		int serverPort = 10010;// �������˿ں�

		try {
			// �������ӣ���ָ���ͻ��˶˿ںţ�ϵͳ�Զ�����
			ds = new DatagramSocket();
			// ��ʼ����������
			Date date = new Date();
			String content = date.toString();
			byte[] data = content.getBytes();// ��Ҫ���͵�����ת�����ֽ�����
			InetAddress address = InetAddress.getByName(serverHost);
			// ��װҪ���͵�����
			sendDp = new DatagramPacket(data, data.length, address, serverPort);
			// ����
			ds.send(sendDp);

			// ����׼��
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds.receive(receiveDp);
			// ��ȡ���յ�������
			byte[] response = receiveDp.getData();
			int len = receiveDp.getLength();
			String s = new String(response, 0, len);
			System.out.println("�������˷���Ϊ��" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}
	}
}
