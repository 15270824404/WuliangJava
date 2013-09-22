package kehou.zuoye2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * ���Ƚ���һ����IP��ַΪ127.0.0.1�Ķ˿�Ϊ10001������
 * Ȼ����и������ĳ�ʼ��������
 * ���߼����ƵĴ������һ��whileѭ���У����������ڿͻ��˶�ν������롣
 * ��ѭ���ڲ��������ж��û�������Ƿ�Ϊquit�ַ���������ǣ����������
 * ������ǣ�����У��������Ƿ������֣����������ֱ��������������!�������������û�����
 * ������������͸��������ˣ������ݷ������˵ķ�����ʾ��Ӧ����ʾ��Ϣ
 * ���ر��������ӣ������ͻ��˳���
 */
public class TCPGuessMumberClient {

	public static void main(String[] args) {
		Socket socket = null;
		OutputStream os = null;
		InputStream is = null;
		BufferedReader br = null;
		byte[] data = new byte[2];

		try {
			socket = new Socket("127.0.0.1", 10001);
			os = socket.getOutputStream();
			is = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				System.out.println("���������֣�");
				String s = br.readLine();

				if (s.equalsIgnoreCase("quit")) {
					os.write(s.getBytes());
					break;
				}

				boolean b = true;

				// �ж��ǲ�������
				try {
					Integer.parseInt(s);
				} catch (Exception e) {
					b = false;
				}

				if (b) {
					// ��������
					os.write(s.getBytes());
					is.read(data);
					switch (data[0]) {
					case 0:
						System.out.println("��ȣ�ף���㣡");
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
					System.out.println("���Ѿ�����" + data[1] + "�Σ�");
					if (data[1] >= 5) {
						System.out.println("����ˣ�");
						// ֪ͨ�������ر��߳�
						os.write("quit".getBytes());
						break;
					}
				} else {
					System.out.println("�������");
				}
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
