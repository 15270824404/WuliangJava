package file.charsetstream;

import java.io.*;

/*
 * 使用FileReader书写具有一定格式的文件——字符流
 * 与字节流对照
 */
public class ReadFileUserFileReader {
	
	static FileReader fr=null;	
	
	public static void main(String[] args) {
		readFileAll();
	}
	
	// 此方法一次读取所有数据
	// 这两种方法只是输入流在读取时的方法不一样，其他是一样的
	public static void readFileAll() {
		try {
			// 第1步：创建输入流对象
			fr = new FileReader("e:\\out.txt");
			// 创建用于保存数据的字节数组
			char[] data = new char[1024];
			// 第2步：将所有数据读取到字符数组中
			int i = fr.read(data);
			// 将读取出的数据解析成字符串
			String s = new String(data, 0, i);
			// 在控制台输出
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();// 第3步：关闭输入流对象
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
