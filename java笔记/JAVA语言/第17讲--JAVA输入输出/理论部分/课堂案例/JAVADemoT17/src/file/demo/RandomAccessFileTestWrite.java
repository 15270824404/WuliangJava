package file.demo;

/*
 * RandomAccessFile类写入数据
 */
import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTestWrite {

	public static void main(String[] args) throws Exception {
		File f = new File("c:" + File.separator + "demo.txt");
		if (f.exists()) // 判断文件是否存在
			f.delete(); // 删除文件
		RandomAccessFile rdf = new RandomAccessFile(f, "rw");
		String name = null;
		int age = 0;
		name = "tom";
		age = 18;// 整型数据在内存中占4个字节大小
		rdf.writeBytes(name);// 将name写入到文件
		rdf.writeInt(age);// 将年龄写入到文件
		name = "mike";
		age = 21;
		rdf.writeBytes(name);// 将name写入到文件
		rdf.writeInt(age);// 将年龄写入到文件
		rdf.close();
	}
}
