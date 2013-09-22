package kehou.zuoye3;

import java.io.*;

/*
 * ʹ���ַ�����FileWriter ��FileReader
 * ��дһ����FileWriteAndReade���ֱ�����������ʵ�����¹��ܣ�
 * ����1(writerFile)������hello world��д�뵽D�̸�Ŀ¼��һ���ļ���demo.txt���У�
 * ����2(readerFile)�����ļ��ж�ȡ�������ڿ���̨��ʾ
 * ����ڷ����д�����Ķ��󲢷ֱ���������������ʵ�ֹ���
 */
public class FileWriteAndRead {
	/*
	 * ����1(writerFile)������hello world��д�뵽D�̸�Ŀ¼��һ���ļ���demo.txt���У�
	 */
	public void writerFile() throws Exception {
		// 1.ʹ��File���ҵ�һ���ļ�,�����ǰ�ļ��������򴴽����ļ�
		File f = new File("d:" + File.separator + "demo.txt");
		// 2.ʵ����IO����
		FileWriter fw = new FileWriter(f, true);
		String str = "hello world";
		// 3 .����д����
		fw.write(str);
		// 4.�ر������
		fw.close();
	}

	/*
	 * ����2(readerFile)�����ļ��ж�ȡ�������ڿ���̨��ʾ
	 */
	public void readerFile() throws Exception {
		File f = new File("d:" + File.separator + "demo.txt");
		// �����ݴ����ж�ȡ����
		FileReader fr = new FileReader(f);
		char[] buf = new char[1024];
		int len = fr.read(buf);
		System.out.println(new String(buf, 0, len));
		fr.close();
	}

	public static void main(String[] args) throws Exception {
		FileWriteAndRead f = new FileWriteAndRead();
		f.writerFile();
		f.readerFile();
	}
}
