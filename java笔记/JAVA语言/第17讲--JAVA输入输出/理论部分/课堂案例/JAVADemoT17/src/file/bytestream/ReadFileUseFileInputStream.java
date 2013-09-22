package file.bytestream;

import java.io.*;

/*
 * ʹ��FileInputStream��ȡ�ļ������ֽ���
 * �����������ַ�ʽ���ж�ȡ
 * 1��ÿ�ζ�ȡһ���ֽڵķ�ʽ���ж�ȡ��һֱ��ȡ��û������
 * 2��һ�ζ�ȡ��������
 */
public class ReadFileUseFileInputStream {

	static FileInputStream fis = null;

	public static void main(String[] args) {
		readFileAll();
	}

	// �˷���ÿ�ζ�ȡһ���ֽڵ�����
	// �����ַ���ֻ���������ڶ�ȡʱ�ķ�����һ����������һ����
	public static void readFileByOneLine() {
		try {
			// ��������������
			fis = new FileInputStream("e:\\out.txt");
			// �������ڱ������ݵ��ֽ�����
			byte[] data = new byte[1024];
			// ���嵱ǰ�±ꡪ����0��ʼ
			int i = 0;
			int n = fis.read();// ��ȡ��һ���ֽڡ�����n����-1ʱ��������ȡ��������
			while (n != -1) {
				// ����Ч�����ݱ��浽������
				data[i] = (byte) n;
				i++;// �±����ӣ��Ա㱣����һ���ֽڵ�����
				n = fis.read();// ��ȡ��һ���ֽڵ�����
			}
			// ����ȡ�������ݽ������ַ���
			String s = new String(data, 0, i);
			// �ڿ���̨���
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// �˷���һ�ζ�ȡ��������
	// �����ַ���ֻ���������ڶ�ȡʱ�ķ�����һ����������һ����
	public static void readFileAll() {
		try {
			// ��1������������������
			fis = new FileInputStream("e:\\out.txt");
			// �������ڱ������ݵ��ֽ�����
			byte[] data = new byte[1024];
			// ��2�������������ݶ�ȡ���ֽ�������
			int i = fis.read(data);
			// ����ȡ�������ݽ������ַ���
			String s = new String(data, 0, i);
			// �ڿ���̨���
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();// ��3�����ر�����������
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
