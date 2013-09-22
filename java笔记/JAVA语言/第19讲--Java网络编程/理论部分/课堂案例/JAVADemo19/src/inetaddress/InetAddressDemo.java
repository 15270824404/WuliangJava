package inetaddress;

import java.net.*;

/**
 * 基础网络类案例
 * 
 * @author ZHT
 * 
 */
public class InetAddressDemo {

	public static void main(String[] args) {
		try {
			// 获取指定域名的IP地址
			InetAddress inet1 = InetAddress.getByName("www.163.com");
			System.out.println(inet1);
			// 使用IP地址创建对象
			InetAddress inet2 = InetAddress.getByName("172.0.0.1");
			System.out.println(inet2);
			// 获得本机地址对象
			InetAddress inet3 = InetAddress.getLocalHost();
			System.out.println(inet3);
			// 获得对象中存储的域名
			String host = inet3.getHostName();
			System.out.println("域名是：" + host);
			// 获得对象中存储的IP地址
			String ip = inet3.getHostAddress();
			System.out.println("IP地址是：" + ip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
