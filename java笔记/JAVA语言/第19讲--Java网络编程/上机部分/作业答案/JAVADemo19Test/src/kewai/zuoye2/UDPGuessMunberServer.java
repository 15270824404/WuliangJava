package kewai.zuoye2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP���ӷ�ʽ�ķ�������
 * 
 * ʵ�ֹ��ܣ����տͻ��˵����ݣ��ж����ֹ�ϵ *
 * 
 * @author ZHONG
 * 
 */
public class UDPGuessMunberServer {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10001);
			System.out.println("�������Ѿ�������");
			while (true) {
				byte[] b = new byte[1024];
				DatagramPacket receiveDp = new DatagramPacket(b, b.length);
				ds.receive(receiveDp);// �������������ȴ���ȡ����
				// �����̴߳����õ����Ӻ�����
				// System.out.println(new
				// String(receiveDp.getData(),0,receiveDp.getLength()));
				new UDPRandomLogicThread(ds, receiveDp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
