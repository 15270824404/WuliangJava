package shangji.zuoye1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * ���õ�Socket�ͻ���
 * ����Ϊ�����տ���̨�����벢���͵��������ˣ�����ӡ���������˵ķ���
 * ����ֻ���� ����̨���������
 */
public class MulSocketClient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// �����ͻ��˶���
		Socket socket = null;
		// ������
		InputStream is = null;
		// �����
		OutputStream os = null;

		try {
			// ��������
			socket = new Socket("127.0.0.1", 10000);
			// �������������
			os = socket.getOutputStream();
			// ��ȡ������
			is = socket.getInputStream();
			// ��ѭ�����ֶԻ�
			while (true) {
				byte[] b = new byte[1024];
				System.out.println("������һ����������1��3֮�䣩");
				// ���տ���̨����
				String in = input.next();
				try {
					Integer.parseInt(in);// ����ת�������쳣������������
				} catch (Exception e) {
					continue;
				}
				// �����ֽ���
				os.write(in.getBytes());
				// ��ȡ����
				int n = is.read(b);
				// ����̨�������
				String response = new String(b, 0, n);
				System.out.println("������������" + response);
				// ����������"bye bye"�󣬲������У�ֹͣѭ��
				if (response.equals("bye bye")) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
				socket.close();
			} catch (IOException e) {
			}
		}
	}
}
