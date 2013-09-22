package shangji.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * ��UDP�������ˣ�ʵ�ֹ���������ͻ��˷��͵����ݣ���������OK�����ͻ���
 */
public class SimpleUDPServer {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket sendDp = null;
		DatagramPacket receiveDp = null;
		final int PORT = 10010;
		try {
			ds = new DatagramSocket(PORT);
			System.out.println("����������������");
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			// ��������
			ds.receive(receiveDp);
			InetAddress clientIP = receiveDp.getAddress();
			int clientPort = receiveDp.getPort();
			byte[] data = receiveDp.getData();
			int len = receiveDp.getLength();
			System.out.println("�ͻ���IP��" + clientIP.getHostAddress());
			System.out.println("�ͻ��˶˿ڣ�" + clientPort);
			System.out.println("�ͻ��˷������ݣ�" + new String(data, 0, len));
			// ���ͷ�����Ϣ
			String response = "OK";
			byte[] rData = response.getBytes();// ת�����ֽ�����
			// ��װҪ���͵�����
			sendDp = new DatagramPacket(rData, rData.length, clientIP,
					clientPort);
			// ��������
			ds.send(sendDp);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ds.close();
		}
	}
}
