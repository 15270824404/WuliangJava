package file.charsetstream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ��FileWriter��д����һ����ʽ���ļ������ַ���
 * ���ֽ�������
 */
public class WriteFileUserFileWriter {

	public static void main(String[] args) {
		String s = "JAVA �����̳�";// ��Ҫ��д�������
		int n = 100;// ��Ҫ��д�������
		FileWriter fw = null;// �������������

		try {
			// ��1�����������������
			fw = new FileWriter("e:\\out.txt");
			char[] c1 = s.toCharArray();// ��Ҫ���������ת��Ϊ�ַ�����
			char[] c2 = "\r\n".toCharArray();// �ı��ļ��еĻ��з�
			char[] c3 = String.valueOf(n).toCharArray();

			// ��2��������д������
			fw.write(c1);// д���ַ�������
			fw.write(c2);// д�뻻�з�
			fw.write(c3);// д����������

		} catch (Exception e) {
			e.printStackTrace();// �쳣����
		} finally {
			try {
				fw.close();// ��3�����ر�����������ͷ���Դ
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
