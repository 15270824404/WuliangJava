package file.bytestream;

import java.io.*;

/*
 * ʹ��FileOutputStreamд�ļ�ʾ�������ֽ���
 * ��ʾ��������JAVA �����̡̳��͡�100�����������鱣�浽E�̵�out.txt�ļ���
 */
public class WriteFileUseFileOutputStream {
	public static void main(String[] args) {
		String s = "JAVA �����̳�";// ��Ҫ��д�������
		int n = 100;// ��Ҫ��д�������
		FileOutputStream fos = null;// �������������

		try {
			// ��1�����������������
			fos = new FileOutputStream("e:\\out.txt");
			byte[] b1 = s.getBytes();// ��Ҫ���������ת��Ϊ�ֽ�����
			byte[] b2 = "\r\n".getBytes();// �ı��ļ��еĻ��з�
			byte[] b3 = String.valueOf(n).getBytes();
			// ��2��������д������
			fos.write(b1);// д���ַ�������
			fos.write(b2);// д�뻻�з�
			fos.write(b3);// д����������

		} catch (Exception e) {
			e.printStackTrace();// �쳣����
		} finally {
			try {
				fos.close();// ��3�����ر�����������ͷ���Դ
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
