package kehou.zuoye3;

import java.io.*;

/*
 * 使用字符流：FileWriter 和FileReader
 * 编写一个类FileWriteAndReade，分别用两个方法实现以下功能：
 * 方法1(writerFile)：将“hello world”写入到D盘根目录的一个文件（demo.txt）中，
 * 方法2(readerFile)：从文件中读取出来后在控制台显示
 * 在入口方法中创建类的对象并分别调用类的两个方法实现功能
 */
public class FileWriteAndRead {
	/*
	 * 方法1(writerFile)：将“hello world”写入到D盘根目录的一个文件（demo.txt）中，
	 */
	public void writerFile() throws Exception {
		// 1.使用File类找到一个文件,如果当前文件不存在则创建新文件
		File f = new File("d:" + File.separator + "demo.txt");
		// 2.实例化IO流类
		FileWriter fw = new FileWriter(f, true);
		String str = "hello world";
		// 3 .进行写操作
		fw.write(str);
		// 4.关闭输出流
		fw.close();
	}

	/*
	 * 方法2(readerFile)：从文件中读取出来后在控制台显示
	 */
	public void readerFile() throws Exception {
		File f = new File("d:" + File.separator + "demo.txt");
		// 将数据从流中读取出来
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
