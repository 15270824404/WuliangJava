package file.bytestream;

import java.io.*;

/*
 * 使用FileOutputStream写文件示例——字节流
 * 本示例，将“JAVA 基础教程”和“100”这两个数组保存到E盘的out.txt文件中
 */
public class WriteFileUseFileOutputStream {
	public static void main(String[] args) {
		String s = "JAVA 基础教程";// 将要被写入的数据
		int n = 100;// 将要被写入的数据
		FileOutputStream fos = null;// 声明输出流对象

		try {
			// 第1步：创建输出流对象
			fos = new FileOutputStream("e:\\out.txt");
			byte[] b1 = s.getBytes();// 将要保存的数据转换为字节数组
			byte[] b2 = "\r\n".getBytes();// 文本文件中的换行符
			byte[] b3 = String.valueOf(n).getBytes();
			// 第2步：依次写入数据
			fos.write(b1);// 写入字符串数据
			fos.write(b2);// 写入换行符
			fos.write(b3);// 写入整数数据

		} catch (Exception e) {
			e.printStackTrace();// 异常处理
		} finally {
			try {
				fos.close();// 第3步：关闭输出流——释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
