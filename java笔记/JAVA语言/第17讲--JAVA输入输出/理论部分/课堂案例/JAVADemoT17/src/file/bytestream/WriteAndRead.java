package file.bytestream;

/*
 * 小结2
 * 将“hello world”写入到一个文件（demo.txt）中
 */
import java.io.*;

public class WriteAndRead {
	public static void main(String[] args) throws Exception {
		// 1.使用File类找到一个文件,如果当前文件不存在则创建新文件
		File f = new File("d:" + File.separator + "demo.txt");
		// 2.实例化IO流类
		OutputStream os = new FileOutputStream(f, true);
		String str = "hello world";
		// 3 .进行写操作
		os.write(str.getBytes());
		// 4.关闭输出流
		os.close();
		// 将数据从流中读取出来
		InputStream in = new FileInputStream(f);
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf, 0, len));
		in.close();
	}
}
