package file.charsetstream;

import java.io.*;

/*
 * ʹ��FileReader��д����һ����ʽ���ļ������ַ���
 * ���ֽ�������
 */
public class ReadFileUserFileReader {
	
	static FileReader fr=null;	
	
	public static void main(String[] args) {
		readFileAll();
	}
	
	// �˷���һ�ζ�ȡ��������
	// �����ַ���ֻ���������ڶ�ȡʱ�ķ�����һ����������һ����
	public static void readFileAll() {
		try {
			// ��1������������������
			fr = new FileReader("e:\\out.txt");
			// �������ڱ������ݵ��ֽ�����
			char[] data = new char[1024];
			// ��2�������������ݶ�ȡ���ַ�������
			int i = fr.read(data);
			// ����ȡ�������ݽ������ַ���
			String s = new String(data, 0, i);
			// �ڿ���̨���
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();// ��3�����ر�����������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
