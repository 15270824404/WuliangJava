package file.bytestream;

import java.io.*;

/*
 * 使用FileInputStream读取文件——字节流
 * 这个类采用两种方式进行读取
 * 1、每次读取一个字节的方式进行读取，一直读取到没有数据
 * 2、一次读取所有数据
 */
public class ReadFileUseFileInputStream {

	static FileInputStream fis = null;

	public static void main(String[] args) {
		readFileAll();
	}

	// 此方法每次读取一个字节的数据
	// 这两种方法只是输入流在读取时的方法不一样，其他是一样的
	public static void readFileByOneLine() {
		try {
			// 创建输入流对象
			fis = new FileInputStream("e:\\out.txt");
			// 创建用于保存数据的字节数组
			byte[] data = new byte[1024];
			// 定义当前下标——从0开始
			int i = 0;
			int n = fis.read();// 读取第一个字节——当n不是-1时，表明读取出数据了
			while (n != -1) {
				// 将有效的数据保存到数组中
				data[i] = (byte) n;
				i++;// 下标增加，以便保存下一个字节的数组
				n = fis.read();// 读取下一个字节的数据
			}
			// 将读取出的数据解析成字符串
			String s = new String(data, 0, i);
			// 在控制台输出
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	// 此方法一次读取所有数据
	// 这两种方法只是输入流在读取时的方法不一样，其他是一样的
	public static void readFileAll() {
		try {
			// 第1步：创建输入流对象
			fis = new FileInputStream("e:\\out.txt");
			// 创建用于保存数据的字节数组
			byte[] data = new byte[1024];
			// 第2步：将所有数据读取到字节数组中
			int i = fis.read(data);
			// 将读取出的数据解析成字符串
			String s = new String(data, 0, i);
			// 在控制台输出
			System.out.println(s);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();// 第3步：关闭输入流对象
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}
