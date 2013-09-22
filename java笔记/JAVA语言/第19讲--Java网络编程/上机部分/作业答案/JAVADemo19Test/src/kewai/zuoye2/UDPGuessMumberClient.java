package kewai.zuoye2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * ���Ƚ���һ����IP��ַΪ127.0.0.1�Ķ˿�Ϊ10001������
 * 
 * Ȼ����и������ĳ�ʼ��������
 * 
 * ���߼����ƵĴ������һ��whileѭ���У����������ڿͻ��˶�ν������롣
 * 
 * ��ѭ���ڲ��������ж��û�������Ƿ�Ϊquit�ַ���������ǣ����������
 * 
 * ������ǣ�����У��������Ƿ������֣����������ֱ��������������!�������������û�����
 * 
 * ������������͸��������ˣ������ݷ������˵ķ�����ʾ��Ӧ����ʾ��Ϣ
 * 
 * ���ر��������ӣ������ͻ��˳���
 * 
 * UDP���ӷ�ʽ�Ŀͻ���
 * 
 */
public class UDPGuessMumberClient {

	public static void main(String[] args) {
		DatagramSocket ds = null;
		DatagramPacket sendDp = null;
		DatagramPacket receiveDp = null;

		BufferedReader br = null;

		try {
			byte[] b = new byte[1024];
			receiveDp = new DatagramPacket(b, b.length);
			ds = new DatagramSocket();
			br = new BufferedReader(new InputStreamReader(System.in));
			// �����Ĵ���
			int number = 0;
			while (true) {
				number++;
				System.out.println("��������µ����֣�");
				String s = br.readLine();

				if (s.equalsIgnoreCase("quit")) {
					break;
				}

				boolean flag = true;

				// �ж��ǲ�������
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					flag = false;
				}

				if (flag) {
					System.out.println("����������ǣ�" + s);

					// ��װҪ���͵�����
					sendDp = new DatagramPacket(s.getBytes(),
							s.getBytes().length, InetAddress
									.getByName("127.0.0.1"), 10001);
					// ��������
					ds.send(sendDp);

					// ��������
					ds.receive(receiveDp);
					byte[] get = receiveDp.getData();

					switch (get[0]) {
					case 0:
						System.out.println("��ȣ�ף���㣡");
						number = 0;
						break;
					case 1:
						System.out.println("���ˣ�");
						break;
					case 2:
						System.out.println("С�ˣ�");
						break;
					default:
						System.out.println("��������");
					}
					System.out.println("���Ѿ�����" + number + "�Σ�");
					if (number >= 5) {
						System.out.println("����ˣ�");
						break;
					}
				} else {
					System.out.println("�������");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try {
			// br.close();
			// ds.close();
			// } catch (Exception e) {
			// e.printStackTrace();
			// }
		}
	}

}
