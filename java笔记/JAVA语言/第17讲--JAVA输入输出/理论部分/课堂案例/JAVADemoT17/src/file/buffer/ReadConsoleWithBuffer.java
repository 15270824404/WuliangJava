package file.buffer;

import java.io.*;

/*
 * ʹ��BufferedReader��ȡ����̨����
 */
public class ReadConsoleWithBuffer {

	public static void main(String[] args) {
		BufferedReader br = null;// ��������װ����
		String s = null;// ���ڱ����û�������ַ���

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("�����룺");// ��ʾ�û�����
				// ��������
				s = br.readLine();
				// �ڿ���̨����û�������
				System.out.println(s);
			} while (!s.equals("quit"));
			System.out.println("�������룡");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
