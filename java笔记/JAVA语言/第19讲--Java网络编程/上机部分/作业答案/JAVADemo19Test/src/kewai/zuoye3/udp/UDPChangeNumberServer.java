package kewai.zuoye3.udp;

/**
 * �κ���ҵ5
 * 
 * ʹ��UDP��ʽ��ʵ�ֽ��ͻ�������İ���������ת��Ϊ���Ĵ�д����

 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP��ʽ��������
 * 
 * @author ZHONG
 * 
 */
public class UDPChangeNumberServer {

	public static void main(String[] args) {
		final int PORT = 10001;

		DatagramSocket ds = null;// UDP���Ӷ���
		DatagramPacket receiveDp = null;// �������ݰ�����

		try {
			ds = new DatagramSocket(PORT);
			System.out.println("����������������");
			while (true) {
				byte[] b = new byte[1024];
				receiveDp = new DatagramPacket(b, b.length);// ��ʼ���������ݰ�����
				ds.receive(receiveDp);// ���������������ȴ��ͻ�������
				new LogicThread(ds, receiveDp);// �����̴߳�������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
