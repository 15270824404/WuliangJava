package file.bytestream;

/*
 * С��2
 * ����hello world��д�뵽һ���ļ���demo.txt����
 */
import java.io.*;

public class WriteAndRead {
	public static void main(String[] args) throws Exception {
		// 1.ʹ��File���ҵ�һ���ļ�,�����ǰ�ļ��������򴴽����ļ�
		File f = new File("d:" + File.separator + "demo.txt");
		// 2.ʵ����IO����
		OutputStream os = new FileOutputStream(f, true);
		String str = "hello world";
		// 3 .����д����
		os.write(str.getBytes());
		// 4.�ر������
		os.close();
		// �����ݴ����ж�ȡ����
		InputStream in = new FileInputStream(f);
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf, 0, len));
		in.close();
	}
}
