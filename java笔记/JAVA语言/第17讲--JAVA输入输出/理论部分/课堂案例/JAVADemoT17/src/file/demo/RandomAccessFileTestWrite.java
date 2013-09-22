package file.demo;

/*
 * RandomAccessFile��д������
 */
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTestWrite {

	public static void main(String[] args) throws Exception {
		File f = new File("c:" + File.separator + "demo.txt");
		if (f.exists()) // �ж��ļ��Ƿ����
			f.delete(); // ɾ���ļ�
		RandomAccessFile rdf = new RandomAccessFile(f, "rw");
		String name = null;
		int age = 0;
		name = "tom";
		age = 18;// �����������ڴ���ռ4���ֽڴ�С
		rdf.writeBytes(name);// ��nameд�뵽�ļ�
		rdf.writeInt(age);// ������д�뵽�ļ�
		name = "mike";
		age = 21;
		rdf.writeBytes(name);// ��nameд�뵽�ļ�
		rdf.writeInt(age);// ������д�뵽�ļ�
		rdf.close();
	}
}
