package kewai.zuoye3.tcp;

/**
 * �κ���ҵ5
 * 
 * ʹ��TCP��ʽ��ʵ�ֽ��ͻ�������İ���������ת��Ϊ���Ĵ�д����

 */
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP��ʽ��������
 * 
 * @author ZHONG
 * 
 */
public class TCPChangeNumberServer {

	public static void main(String[] args) {
		final int PORT = 10001;
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(PORT);
			System.out.println("����������������");
			while (true) {
				Socket s = ss.accept();// ���������������ȴ��ͻ�������
				new LogicThread(s);// �����̴߳�������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
