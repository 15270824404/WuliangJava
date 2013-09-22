package kewai.zuoye1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * �κ���ҵ3
 * 
 * ��������
 * 
 * UDP����ʵ�ֿκ���ҵ1����
 * 
 * @author ZHONG
 * 
 */
public class UDPPrimeServer {

	public static void main(String[] args) {
		final int PORT = 10005;
		DatagramSocket ds = null;// UDP���Ӷ���
		DatagramPacket receiveDp = null;

		try {
			ds = new DatagramSocket(PORT);// �����˿�
			System.out.println("����������������");
			while (true) {
				byte[] b = new byte[1024];
				receiveDp = new DatagramPacket(b, b.length);
				ds.receive(receiveDp);
				new UDPPrimeLogicThread(ds, receiveDp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
