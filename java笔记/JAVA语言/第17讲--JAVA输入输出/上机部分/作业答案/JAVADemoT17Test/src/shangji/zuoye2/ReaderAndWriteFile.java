package shangji.zuoye2;

/*
 * ��дһ���ࣺReaderAndWriteFile����������������ʵ�����¹��ܣ�
 * ����1(writerFile)��
 * ����JAVA �����̡̳��͡�100��д�뵽D�̸�Ŀ¼��һ���ļ���out.txt���У����Ҹ�ռһ�С�
 * ����2(readerFile)��
 * ������1д������ݴ��ļ��ж�ȡ�������ڿ���̨��ʾ
 * ����ڷ����зֱ�������������������в��ԣ��������Ƿ�����
 */
import java.io.*;

public class ReaderAndWriteFile {
	/**
	 * ����1:������д�뵽�����ļ���
	 */
	public void writeFile() {
		// ����һЩ��Ҫд���ļ�������
		String s = "JAVA�����̳�";
		int n = 100;
		// �������������
		FileOutputStream fos = null;
		// ��1�����������������
		try {
			fos = new FileOutputStream("d:\\out.txt");
			byte[] b1 = s.getBytes(); // ��Ҫ���������ת��Ϊ�ֽ�����
			byte[] b2 = "\r\n".getBytes(); // �ı��ļ��еĻ��з�
			byte[] b3 = String.valueOf(n).getBytes();
			// ��2��������д������
			fos.write(b1); // д���ַ�������
			fos.write(b2); // д�뻻�з�
			fos.write(b3); // д����������
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();// ��3�����ر�����������ͷ���Դ
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ����2��������1д������ݴ��ļ��ж�ȡ�������ڿ���̨��ʾ
	 */
	public void readFile() {
		FileInputStream fis = null;
		try {
			// ��1������������������
			fis = new FileInputStream("e:\\out.txt");
			// �������ڱ������ݵ��ֽ�����
			byte[] data = new byte[1024];
			// ��2�������������ݶ�ȡ��������
			int i = fis.read(data);
			// ����ȡ�������ݽ������ַ���
			String s = new String(data, 0, i);
			// �ڿ���̨���
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); // ��3�����ر�����������
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
