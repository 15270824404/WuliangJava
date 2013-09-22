package file.demo;

/*
 * RandomAccessFile���ȡ����
 */
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTestRead {

	public static void main(String[] args) throws Exception {
		File f = new File("c:" + File.separator + "demo.txt");
		RandomAccessFile rdf = new RandomAccessFile(f, "rw");
		String name = "";
		int age = 0;
		byte[] b = new byte[4];
		// ��ȡ��2�˵���Ϣ
		rdf.skipBytes(7);// ����7���ֽ�,��������һ���˵���Ϣ
		for (int i = 0; i < b.length; i++) {
			b[i] = rdf.readByte();
		}
		name = new String(b);
		age = rdf.readInt();
		System.out.println("�ڶ�������Ϣ--->����:" + name + ";����:" + age);
		rdf.seek(0);// ָ��ص��ļ���ʼ
		rdf.close();
	}
}
