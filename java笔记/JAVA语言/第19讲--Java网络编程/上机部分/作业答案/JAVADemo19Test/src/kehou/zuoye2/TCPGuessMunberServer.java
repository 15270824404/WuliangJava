package kehou.zuoye2;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP���ӷ�ʽ�ķ�������
 * 
 * ʵ�ֹ��ܣ����տͻ��˵����ݣ��ж����ֹ�ϵ *
 * 
 * @author ZHONG
 * 
 */
public class TCPGuessMunberServer {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(10001);
			System.out.println("�������Ѿ�������");
			while (true) {
				Socket s = ss.accept();// �������������ȴ���ȡ����
				// �����̴߳����õ�����
				new TCPLogicThread(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
