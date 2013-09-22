package file.demo;

/*
 * RandomAccessFile类读取数据
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
		// 读取第2人的信息
		rdf.skipBytes(7);// 跳过7个字节,即跳过第一个人的信息
		for (int i = 0; i < b.length; i++) {
			b[i] = rdf.readByte();
		}
		name = new String(b);
		age = rdf.readInt();
		System.out.println("第二个人信息--->姓名:" + name + ";年龄:" + age);
		rdf.seek(0);// 指针回到文件开始
		rdf.close();
	}
}
