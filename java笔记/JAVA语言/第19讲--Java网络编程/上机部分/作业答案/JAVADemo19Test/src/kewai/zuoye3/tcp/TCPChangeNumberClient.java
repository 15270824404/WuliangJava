package kewai.zuoye3.tcp;

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
public class TCPChangeNumberClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		BufferedReader br = null;

		try {
			socket = new Socket("127.0.0.1", 10001);
			os = socket.getOutputStream();
			is = socket.getInputStream();
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
				os.write(s.getBytes());
				byte[] b = new byte[1024];
				// ���շ���
				int n = is.read(b);
				// �ͻ������
				System.out.println(s + "�Ĵ�д��ʽ�ǣ�" + new String(b, 0, n));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				is.close();
				os.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
