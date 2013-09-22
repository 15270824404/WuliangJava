package inetaddress;

import java.net.*;

/**
 * ���������స��
 * 
 * @author ZHT
 * 
 */
public class InetAddressDemo {

	public static void main(String[] args) {
		try {
			// ��ȡָ��������IP��ַ
			InetAddress inet1 = InetAddress.getByName("www.163.com");
			System.out.println(inet1);
			// ʹ��IP��ַ��������
			InetAddress inet2 = InetAddress.getByName("172.0.0.1");
			System.out.println(inet2);
			// ��ñ�����ַ����
			InetAddress inet3 = InetAddress.getLocalHost();
			System.out.println(inet3);
			// ��ö����д洢������
			String host = inet3.getHostName();
			System.out.println("�����ǣ�" + host);
			// ��ö����д洢��IP��ַ
			String ip = inet3.getHostAddress();
			System.out.println("IP��ַ�ǣ�" + ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
