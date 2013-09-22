package kehou.zuoye2;

import java.io.*;

/*
 * ʹ���ֽ���
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
		OutputStream os = new FileOutputStream(f, true);
		String str = "hello world";
		// 3 .����д����
		os.write(str.getBytes());
		// 4.�ر������
		os.close();
	}

	/*
	 * ����2(readerFile)�����ļ��ж�ȡ�������ڿ���̨��ʾ
	 */
	public void readerFile() throws Exception {
		File f = new File("d:" + File.separator + "demo.txt");
		// �����ݴ����ж�ȡ����
		InputStream in = new FileInputStream(f);
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf, 0, len));
		in.close();
	}

	public static void main(String[] args) throws Exception {
		FileWriteAndRead f = new FileWriteAndRead();
		f.writerFile();
		f.readerFile();
	}
}
