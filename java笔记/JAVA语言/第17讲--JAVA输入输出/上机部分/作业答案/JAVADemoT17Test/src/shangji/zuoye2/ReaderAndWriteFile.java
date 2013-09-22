package shangji.zuoye2;

/*
 * 编写一个类：ReaderAndWriteFile，具有两个方法，实现以下功能：
 * 方法1(writerFile)：
 * 将“JAVA 基础教程”和“100”写入到D盘根目录的一个文件（out.txt）中，并且各占一行。
 * 方法2(readerFile)：
 * 将方法1写入的内容从文件中读取出来后在控制台显示
 * 在入口方法中分别调用以上两个方法进行测试，看功能是否正常
 */
import java.io.*;

public class ReaderAndWriteFile {
	/**
	 * 方法1:将数据写入到磁盘文件中
	 */
	public void writeFile() {
		// 创建一些将要写入文件的数据
		String s = "JAVA基础教程";
		int n = 100;
		// 声明输出流对象
		FileOutputStream fos = null;
		// 第1步：创建输出流对象
		try {
			fos = new FileOutputStream("d:\\out.txt");
			byte[] b1 = s.getBytes(); // 将要保存的数据转换为字节数组
			byte[] b2 = "\r\n".getBytes(); // 文本文件中的换行符
			byte[] b3 = String.valueOf(n).getBytes();
			// 第2步：依次写入数据
			fos.write(b1); // 写入字符串数据
			fos.write(b2); // 写入换行符
			fos.write(b3); // 写入整数数据
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();// 第3步：关闭输出流——释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 方法2：将方法1写入的内容从文件中读取出来后在控制台显示
	 */
	public void readFile() {
		FileInputStream fis = null;
		try {
			// 第1步：创建输入流对象
			fis = new FileInputStream("e:\\out.txt");
			// 创建用于保存数据的字节数组
			byte[] data = new byte[1024];
			// 第2步：将所有数据读取到数组中
			int i = fis.read(data);
			// 将读取出的数据解析成字符串
			String s = new String(data, 0, i);
			// 在控制台输出
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close(); // 第3步：关闭输入流对象
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
